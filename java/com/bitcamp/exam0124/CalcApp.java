package com.bitcamp.exam0124;

public class CalcApp {
    int num1;
    int num2;
    int result;
    static String appName = "----Calc App----";
    String opcode;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.opcode = opcode;

        result = num1+num2;

        return num1 +" "+opcode+" "+num2+" = "+result;
    }
}
