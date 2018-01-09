package com.patterns.Combined.djview.java;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public final class DJViewServlet extends HttpServlet {

    private static final long serialVersionUID = 2L;

    @Override
    public void init() throws ServletException {
        final BeatModel beatModel = new BeatModel();
        beatModel.initialize();
        getServletContext().setAttribute("beatModel", beatModel);
    }

    @Override
    public void doGet(
            final HttpServletRequest request,
            final HttpServletResponse response
    ) throws IOException, ServletException {
        doPost(request, response);
    }

    @Override
    public void doPost(
            final HttpServletRequest request,
            final HttpServletResponse response
    ) throws IOException, ServletException {
        final BeatModel beatModel = (BeatModel) getServletContext().getAttribute("beatModel");
        String bpm = request.getParameter("bpm");
        if (bpm == null) {
            bpm = beatModel.getBPM() + "";
        }
        final String set = request.getParameter("set");
        if (set != null) {
            final int bpmNumber = Integer.parseInt(bpm);
            beatModel.setBPM(bpmNumber);
        }
        final String decrease = request.getParameter("decrease");
        if (decrease != null) {
            beatModel.setBPM(beatModel.getBPM() - 1);
        }
        final String increase = request.getParameter("increase");
        if (increase != null) {
            beatModel.setBPM(beatModel.getBPM() + 1);
        }
        final String on = request.getParameter("on");
        if (on != null) {
            beatModel.on();
        }
        final String off = request.getParameter("off");
        if (off != null) {
            beatModel.off();
        }
        request.setAttribute("beatModel", beatModel);
        final RequestDispatcher dispatcher = request.getRequestDispatcher("/djview.jsp");
        dispatcher.forward(request, response);
    }
}
