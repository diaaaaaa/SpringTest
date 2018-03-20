package com.example.springtest.sixth.controller;

import com.example.springtest.sixth.model.Dictionary;
import com.example.springtest.sixth.view.InputFromUser;

import java.util.List;
import java.util.stream.Collectors;

public class LookUpWord {
    public String lookup(String word) {

        WordsParser wordsParser = new WordsParser();

        List<Dictionary> wordsInDictionary = wordsParser.getWords();
        return wordsInDictionary.stream()
                .filter(e-> e.getEnglishWord().equalsIgnoreCase(word))
                .map(e-> e.getGermanWord())
                .collect(Collectors.joining(""));

    }
}
