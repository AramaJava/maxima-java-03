package org.example;

import java.io.FileNotFoundException;

public interface Transformable {
    void transform(String filein, String fileout) throws FileNotFoundException;
    }

