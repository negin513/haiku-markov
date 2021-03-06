package edu.uci.arcastro.Predicates;

import edu.uci.arcastro.English.Word;

public class SyllablePredicate implements Predicate {
    private final int syllableCount;

    public SyllablePredicate(int syllableCount) {
        this.syllableCount = syllableCount;
    }

    public boolean isFulfilledBy(Word w) {
        return w.syllables() == this.syllableCount;
    }
}