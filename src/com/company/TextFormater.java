package com.company;

public class TextFormater {

    public int getAmoutOfSentenses(String str) {

        StringBuilder builder = new StringBuilder(str);
        int amount = 1;
        for (int i = 0; i < str.length(); i++) {

            if (builder.charAt(i) == ' ')
                amount++;
        }

        return amount;

    }

    public boolean findPolidrome(String str) {

        //str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());
        StringBuilder reverse = new StringBuilder();
        int s;
        for (int i = 0; i < str.length(); i++){
                s = i;
            while (stringBuilder.charAt(i) != ',' && stringBuilder.charAt(i) != ' ' && stringBuilder.charAt(i) != '.' &&
                    stringBuilder.charAt(i) != '!' && stringBuilder.charAt(i) != '?') {
                if(i == stringBuilder.length()-1)
                    break;
                i++;
            }
            reverse.append(stringBuilder.substring(s,i)).reverse();

            if (stringBuilder.substring(s,i).equals(reverse.toString())&&i!=s) {

                System.out.println(reverse);
                return true;


            }
            reverse.delete(0,reverse.length());

}

return false;

    }

}
