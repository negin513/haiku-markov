package edu.uci.arcastro;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;


public class Word
{
	public final String spelling;
	public int syllables;
	public int frequency;
	public EnumSet<POS> PartsOfSpeech;
	public final HashMap<Word, Integer> CollocatedBefore;
	public final HashMap<Word, Integer> CollocatedAfter;
	public final HashMap<Word, Integer> Associated;
	public final ArrayList<Word> Rhyme;
	public Word(String spelling)
	{
		this.syllables = 0;
		this.frequency = 0;
		this.spelling = spelling;
		this.CollocatedBefore = new HashMap<Word, Integer>();
		this.CollocatedAfter = new HashMap<Word, Integer>();
		this.Associated = new HashMap<Word, Integer>();
		this.Rhyme = new ArrayList<Word>();
		PartsOfSpeech = EnumSet.of(POS.Unknown);
	}
	
	public String spelling() {
		return spelling;
	}
	public int syllables(){
		return syllables;
	}
	public int frequency(){
		return frequency;
	}	
	public HashMap<Word, Integer> CollocatedBefore(){
		return CollocatedBefore;
	}
	public HashMap<Word, Integer> CollocatedAfter(){
		return CollocatedAfter;
	}
	public HashMap<Word, Integer> Associated(){
		return Associated;
	}
	public ArrayList<Word> Rhyme(){
		return Rhyme;
	}
}
