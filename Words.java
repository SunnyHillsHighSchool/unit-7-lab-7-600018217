//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Johnathan Mitri

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{ 
    words = new ArrayList<Word>();
    for (String str: wordList)
    {
      Word currWord = new Word(str);
      words.add(currWord);
    }
	}

	public int countWordsWithXChars(int size)
	{
    //declare resultCount as 0
    int resultCount = 0;
    //foreach word in array
    for (Word currWord: words)
    {
      //if getLength() returns the same as the number of chars passed to the function
      if (currWord.getLength() == size)
      {
        //increment resultCount
        resultCount++;
      }
      
    }
    //return resultCount
    return resultCount;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    int vowelSum = 0;
    //foreach word in array going backwards
    for (int i = words.size() - 1; i >= 0; i--)
    {
      //if getLength() returns the same value as size
      Word currWord = words.get(i);
      if (currWord.getLength() == size)
      {
        //add its vowelCount to the sum
        vowelSum += currWord.getNumVowels();
        //remove current element from the arrayList
        words.remove(i);
      }
    }
		return vowelSum;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		//declare resultCount as 0
    int resultCount = 0;
    //foreach word in array
    for (Word currWord: words)
    {
      //if getNumVowels() returns the same as the number of vowels passed to the function
      if (currWord.getNumVowels() == numVowels)
      {
        //increment resultCount
        resultCount++;
      }
      //return resultCount
    }
    return resultCount;
	}
	
	//add in a toString
  public String toString()
  {
    return words.toString();
  }
}