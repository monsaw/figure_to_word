package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(convert(156));
        System.out.println(convert2(156));

    }

    public static String convert(Integer Number){
        String result= "";
        HashMap<Integer,String> base = new HashMap<>();
        base.put(0,"zero"); base.put(1,"one");base.put(2,"two");base.put(3,"three");base.put(4,"four");
        base.put(5,"five");base.put(6,"six");base.put(7,"seven");base.put(8,"eight");base.put(9,"nine");


        Integer[] value = new Integer[3];
        for (int i = 0; i < 3; i++){
            value[i] = Integer.parseInt(Integer.toString(Number).substring(i,i+1));
        }

        result = base.get(value[0])+ "-" + base.get(value[1]) + "-" + base.get(value[2]);

    return result;}


    public static String convert2(Integer number){
        String result = "";
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Integer[] value = new Integer[3];
        for (int i = 0; i < 3; i++){
            value[i] = Integer.parseInt(Integer.toString(number).substring(i,i+1));

        }
        result = num[value[0]] + "-"+ num[value[1]] + "-"+ num[value[2]];
    return result;}
}