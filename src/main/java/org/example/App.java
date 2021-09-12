package org.example;

import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    private static final String[] greetingsLeading = {"Hi, ", "Hello, ", "Sup, "};
    private static final String[] greetingsTrailing = {", nice to meet you!", ", you look familiar!", ", great to meet you!"};
    public static void main( String[] args )
    {
        Random rand = new Random();
        int leadingChoice = rand.nextInt(greetingsLeading.length);
        int trailingChoice = rand.nextInt(greetingsTrailing.length);
        Scanner askName = new Scanner(System.in);
        System.out.println( "What is your name?" );

        String name = askName.next();
        String output = greetingsLeading[leadingChoice] + name + greetingsTrailing[trailingChoice];
        System.out.println(output);
    }
}
