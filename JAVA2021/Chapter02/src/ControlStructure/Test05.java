//package ControlStructure;
//
///*
//增强switch
//用逗号来连接两个常量表达式
//用->来代替break
//*/
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Test05 {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        System.out.println("您输入了:"+str);
//        br.close();
//
//        int a = Integer.parseInt(str);
//        switch (a) {
//            case 9, 10 -> {
//                System.out.println("优秀");
//            }
//            case 7, 8 -> System.out.println("良好");
//            case 6 -> System.out.println("及格");
//            default -> System.out.println("不及格");
//        }
//    }
//}
