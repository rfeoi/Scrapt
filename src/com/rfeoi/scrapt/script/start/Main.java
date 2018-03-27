package com.rfeoi.scrapt.script.start;

import com.rfeoi.scrapt.script.interpreter.Loader;

import java.io.File;
import java.io.IOException;

public class Main {
    private static Loader loader;
    public static void main(String[] args){
        if (args.length == 1){
            try {
                loader = new Loader(new File(args[0]));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
