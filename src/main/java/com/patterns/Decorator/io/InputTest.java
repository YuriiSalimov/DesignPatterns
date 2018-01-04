package com.patterns.Decorator.io;

import java.io.*;

public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            final InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")
                            )
                    );
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
