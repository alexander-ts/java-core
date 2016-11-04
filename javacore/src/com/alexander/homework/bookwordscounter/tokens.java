package com.alexander.homework.bookwordscounter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class tokens {
    public static void uniquewords(File file) throws IOException {
        StringBuilder strb = new StringBuilder();
        Scanner scan = new Scanner(file);
        HashSet<String> words = new HashSet<String>();
        while (scan.hasNext()) {
            String s = scan.next();
            LinkedList<String> parts = new LinkedList<>(Arrays.asList(s.split("(?!^)")));
            for (String numb : parts) {
                if (numb.matches(".*\\d+.*")) {
                    parts.clear();
                }
            }
            for (int i = 0; i < parts.size(); i++) {
                parts.remove("!");
                parts.remove("\"");
                parts.remove(",");
                parts.remove(".");
                parts.remove("?");
                parts.remove(":");
                parts.remove(";");
                parts.remove("(");
                parts.remove(")");
                parts.remove("_");
                parts.remove("[");
                parts.remove("]");
                parts.remove("\uFEFF");
            }
            if ( parts.isEmpty() | parts.contains("*") | parts.contains("/") ) {
                parts.clear();
            } else {

                for (String ss : parts) {
                    strb.append(ss);
                }
                s = strb.toString();
                s = s.toLowerCase();
                String[] sar = s.split("--");
                strb.setLength(0);
                if (sar.length > 0) {
                    for (int i = 0; i < sar.length; i++) {
                        LinkedList<String> parts1 = new LinkedList<>(Arrays.asList(sar[i].split("(?!^)")));
                        for (int j = 0; j < parts1.size() ; j++) {
                            if (parts1.getFirst().equals("'")) {
                                parts1.removeFirst();
                            } else if (parts1.getLast().equals("'")) {
                                parts1.removeLast();
                            }
                        }
                        if (parts1.size() <= 1){
                            parts1.clear();
                        }
                        else {

                            for (String ss : parts1) {
                                strb.append(ss);
                            }
                            s = strb.toString();
                            words.add(s);
                            strb.setLength(0);
                        }
                    }

                } else if (sar.length == 0) {

                }
            }
        }
        words.remove("-");
        words.remove("");
        PrintWriter wordw = new PrintWriter("test.txt");
        for (String s : words) {
            wordw.println(s);System.out.println(s);
        }
        System.out.println(words.toString());
        System.out.println(words.size());

    }
}


























