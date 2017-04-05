package com.example.yo.a5week;

import android.content.Intent;

/**
 * Created by yo on 2017-03-30.
 */

public class Data {
    String table,date,time,member;

    int spa, pizza, price;
    public Data(String t){
        this.table = t;

    }
    public Data(String t,String d, String tt, int s, int p, String m, int pr) {
        this.table = t;
        this.date = d;
        this.time = tt;
        this.spa = s;
        this.pizza = p;
        this.member = m;
        this.price = pr;
    }
    public String getTable(){
        return table;
    }
    public void setTable(String table){
        this.table = table;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
    public int getSpa(){
        return spa;
    }
    public void setSpa(int spa){
        this.spa = spa;
    }
    public int getPizza(){
        return pizza;
    }
    public void setPizza(int pizza){
        this.pizza = pizza;
    }
    public String getMember(){
        return member;
    }
    public void setMember(String member){
        this.member = member;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}