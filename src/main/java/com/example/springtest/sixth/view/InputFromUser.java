package com.example.springtest.sixth.view;

import java.util.Scanner;

public class InputFromUser {

    public String getWord(){

        String englishWord;
        Scanner scanner = new Scanner(System.in);
        System.out.print("English word: ");
        englishWord = scanner.nextLine();

        return englishWord;
    }
}
