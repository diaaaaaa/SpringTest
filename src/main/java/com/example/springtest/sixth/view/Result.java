package com.example.springtest.sixth.view;

import com.example.springtest.sixth.controller.LookUpWord;

public class Result {

    public void displayTheResult(){

        InputFromUser inputFromUser = new InputFromUser();
        String word = inputFromUser.getWord();
        LookUpWord lookUpWord = new LookUpWord();
        String germanWord = lookUpWord.lookup(word);
        if (germanWord.equals("")){germanWord="not found";}
        System.out.println("German  word: "+germanWord);
    }
}
