package edu.uci.arcastro;

import java.util.Collections;
import java.util.EnumSet;

public class AnyPOSPredicate implements Predicate {
    private final EnumSet<POS> partsOfSpeech;

    public AnyPOSPredicate(EnumSet<POS> partsOfSpeech) {
        this.partsOfSpeech = partsOfSpeech;
    }

    public boolean fulfills(Word w) {
        return !Collections.disjoint(this.partsOfSpeech, w.PartsOfSpeech);
    }
}
