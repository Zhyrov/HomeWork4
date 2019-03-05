package com.epam.lesson4;

public class ZhyrovHW4P2 {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Char->" + findCharacrers(str));
    }

        static String findCharacrers (String str) {
            String doble = "";
            String uniq = "";
            int index = 0;
            int len = str.length();
            while (index < len){
                char ch = str.charAt(index++);
                if (str.substring(index).contains(String.valueOf(ch))&&!conStr.contains(String.valueOf(ch))){
                    doble = doble + ch;
                }
            }
            index = 0;
            while (index < len){
                char ch = str.charAt(index++);
                if (!doble.contains(String.valueOf(ch))){
                    uniq = uniq + ch;
                }
            }
            return uniq;
        }
}
