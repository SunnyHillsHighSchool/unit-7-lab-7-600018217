//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Johnathan Mitri

import static java.lang.System.*;
import java.util.*;

public class Word
{
  private static List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
  
  //add an instance variable
  private String str;

  //constructor
  public Word(String s)
  {
    str = s;
  }
  
  public int getNumVowels()
  {
    //declare and initialize vowelCount = 0;
    int vowelCount = 0;
    //for each character in the string
    for (int i = 0; i < str.length(); i++)
    {
      //if the character is a vowel
      if (vowels.contains(str.charAt(i)))
      {
        //increment vowelCount
        vowelCount++;
      }
    }
    //return vowelCount
    return vowelCount;
  }

  public int getLength()
  {
    //return the length of text
    return str.length();
  }

  public void setWord(String s)
  {
    //set str to s
    str = s;
  }

	//create a toString method
  public String toString()
  {
    return str;
  }
}