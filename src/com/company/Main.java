package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String str = "Hellollh, howo are you?yooooooyh!sost.";

        TextFormater textFormater = new TextFormater();


        System.out.println(textFormater.getAmoutOfSentenses(str));
        if(textFormater.findPolidrome(str))
            System.out.println("Yes");
        else System.out.println("No");

    }
}
