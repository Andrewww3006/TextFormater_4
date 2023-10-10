package com.company;

import java.io.*;
import java.io.BufferedWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here


        try {
            TextFormater textFormater = new TextFormater();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("out2.txt"));
            int s;
            int start;
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer1 = new StringBuffer();

            while ((s=bufferedReader.read()) != -1) {
                stringBuffer.append((char) s);
            }
                    for (int i = 0; i < stringBuffer.length()-1; i++) {
                        start = i;
                       // System.out.print(stringBuffer.charAt(i));
                        while (stringBuffer.charAt(i) != '.'){
                            if (i == stringBuffer.length())
                                break;
                            i++;
                        }

                        if (textFormater.getAmoutOfWords(stringBuffer.substring(start, i))>=3&&textFormater.getAmoutOfWords(stringBuffer.substring(start, i))<=5)
                       stringBuffer1.append(stringBuffer.substring(start, i) + stringBuffer.charAt(i) + " ");

                           // System.out.println(textFormater.getAmoutOfWords(stringBuffer.substring(start, i)));
                            i++;
                        // (stringBuffer.charAt(i+1) == ' ') i++;
                        //if (stringBuffer.charAt(i+1) == ' ' && stringBuffer.charAt(i+1)  < stringBuffer.length()-1) i++;

                    }


                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out3.txt"));
                bufferedWriter.write(stringBuffer1.substring(0));
                bufferedWriter.close();


        }

        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }



       /* String str = "Hellollh, howo are you?yooooooyh!sost.";




        System.out.println(textFormater.getAmoutOfSentenses(str));
        if(textFormater.findPolidrome(str))
            System.out.println("Yes");
        else System.out.println("No");*/

    }
}
