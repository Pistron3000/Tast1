package com.example.tast1;

import android.view.View;
import android.widget.EditText;

public class Reverse {

    Reverse

    public static void reverseWords(){
        String str = new String();
        //String str = "Hello world";
        String[] words = new StringBuilder(str).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            newStr.append(words[i]).append(" ");
        System.out.println(newStr);
    }
}
