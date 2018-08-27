package com.gojek.bootcamp;

import java.io.IOException;

public interface Input {
    String nextInput() throws IOException;

    Boolean isEndOfInput();

    void close() throws IOException;
}
