package com.oop.thisTest;

// 不使用this
public class ThisTest01 {
    public static void main(String[] args){
        MyDate t1 = new MyDate(2018,11,10);
        System.out.println(t1.year+"-"+t1.month+"-"+t1.date);

    }
}

class MyDate {
    int year;
    int month;
    int date;
    MyDate(){}

    MyDate(int _year, int _month, int _date){
        year = _year;
        month = _month;
        date = _date;
    }
}
