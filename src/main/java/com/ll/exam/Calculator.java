package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        boolean inMinus = s.indexOf('-') != -1;

        if(inMinus){
            return runMinus(s);
        }else {
            return runPlus(s);
        }
    }

    private static int runPlus(String s) {
        String[] sBits = s.split("\\+");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);
        return a + b;
    }

    private static int runMinus(String s) {
        String[] sBits = s.split("\\-");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);
        return a - b;
    }
}
