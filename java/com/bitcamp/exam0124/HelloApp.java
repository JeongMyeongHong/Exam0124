package com.bitcamp.exam0124;

public class HelloApp {
    static String appName = "----HelloApp----";
    String id;
    String pw;
    String name;

    public String sayhello(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;


        return "환영합니다."+name+"고객님 \nid는 "+id+" pw는 "+pw+" 입니다.";
    }

}
