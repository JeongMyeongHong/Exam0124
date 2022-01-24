package com.bitcamp.exam0124;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();

        System.out.println(HelloApp.appName);
        System.out.println("id를 입력해주세요.");
        System.out.println("pw를 입력해주세요.");
        System.out.println("이름을 입력해주세요.");

        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();

        System.out.println(helloApp.sayhello(id, pw, name));
    }
}
