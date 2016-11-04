package com.alexander.homework.bookwordscounter;

import static com.alexander.homework.bookwordscounter.tokens.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("book.txt");
        uniquewords(file);
    }
}