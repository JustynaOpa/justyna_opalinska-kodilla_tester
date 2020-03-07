package com.kodilla.collections.adv.exercises.dictionary;

public class EnglishWord {
    private PartOfSpeach partOfSpeach;
    private String word;

    public EnglishWord(PartOfSpeach partOfSpeach, String word) {
        this.partOfSpeach = partOfSpeach;
        this.word = word;
    }

    public PartOfSpeach getPartOfSpeach() {
        return partOfSpeach;
    }

    public String getWord() {
        return word;
    }
}
