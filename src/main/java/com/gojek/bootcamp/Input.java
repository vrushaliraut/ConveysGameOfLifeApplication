package com.gojek.bootcamp;

import java.io.IOException;

public interface Input {
    public String nextInput() throws IOException;

    public boolean isEndOfInput();

    void close() throws IOException;
}
