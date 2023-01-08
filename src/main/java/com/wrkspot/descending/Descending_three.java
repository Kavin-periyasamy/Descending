package com.wrkspot.descending;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Descending_three {
    static String text="Can I block your calendar from 5:30 to 6pm today to "+
            "review/discuss on test case scenarios for HK dashboard cards ";
    public static void main(String[] args)
    {
        String[] arr=text.split(" ");
        List<String>words =Arrays.asList(arr);
        Collections.sort(words,Comparator.comparingInt(String::length).reversed());
        for(String word:words)
        {
            System.out.print(word+" ");
        }
    }
}
