package com.bitcamp.exam0124;

import java.util.Scanner;

public class CalcDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();

        System.out.println(CalcApp.appName);
        System.out.println("첫번째 숫자 입력.");
        System.out.println("연산기호 입력");
        System.out.println("두번째 숫자 입력.");

        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();

        System.out.println(calcApp.calc(num1, opcode, num2));
    }
}
