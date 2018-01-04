package com.patterns.Decorator.io;

import java.io.*;

public final class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(final InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        final int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(final byte[] b, final int offset, final int len) throws IOException {
        final int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
