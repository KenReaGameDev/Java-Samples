// Word Move

// Author: Kenneth Rea
// Date: 4/25/2013
// CODE-FOO

package pkg_WordMove;

import java.util.*;
import java.io.*;
import static java.lang.System.out;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WordList {

	String[] allWords;
	String currentWord = "HAM";
	int count = 0;
	int moves = 0;
	int movesThisLoop = 0;
	int loops = 0;
	char[] tempCharArray = new char[3];
	
	// Loads the words from the list into memory for quick access.
	public void LoadList() throws FileNotFoundException{
		
		BufferedReader reader = new BufferedReader(new FileReader(
		"wordmovelist.txt"));
		
		Scanner scanfile = new Scanner(new File("wordmovelist.txt"));
		count = 0;
		
		while (scanfile.hasNextLine()){
			count++;
			scanfile.nextLine();
		}
		
		allWords = new String[count];
		
		for (int i = 0; i < count; ++i){
			try {
				allWords[i] = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			out.println(allWords[i]);
		}

		out.println("All Words Successfully Loaded");
		
	}
	
	String  SetTempCharArray(String inWord, String tempWord, int letter){
		String holder = "";
		// Sets it to the current word.
		tempCharArray[0] = tempWord.charAt(0);
		tempCharArray[1] = tempWord.charAt(1);
		tempCharArray[2] = tempWord.charAt(2);
		// inWord is the word we are trying to get to. Takes a letter from that.
		tempCharArray[letter] = inWord.charAt(letter);
		// Returns the charArray as a string.
		holder += tempCharArray[0];
		holder += tempCharArray[1];
		holder += tempCharArray[2];
		return holder;
	}
	
	void SetTempCharArrayStart(String inWord){
		tempCharArray[0] = inWord.charAt(0);
		tempCharArray[1] = inWord.charAt(1);
		tempCharArray[2] = inWord.charAt(2);
	}
	
	// Check to make sure the word is in the list
	String CheckingWord(String checkWord, String tempWord){
		for (int i = 0; i < count; ++i){

			if (checkWord.equalsIgnoreCase(allWords[i])){
				// If this happens, then move on to the next word.
				++moves;
				++movesThisLoop;
				return checkWord;

			}			
		}		
		return tempWord;
	}
	
	// Needs a middle word. 
	public void CheckForWord(String inWord){
		
		int letter = 0;
		String tempWord = currentWord;
		String checkWord = "";
		SetTempCharArrayStart(currentWord);
		
		// Check for Letter One by One. 
		// If It's equal, Move on to next letter.
		while ( tempCharArray[0] != inWord.charAt(0) || tempCharArray[1] != inWord.charAt(1) || tempCharArray[2] != inWord.charAt(2) ) {

			if ( inWord.charAt(letter) == tempWord.charAt(letter) ) {
				letter = (letter < 2) ? ++letter : 0;
			}
			
			// Clears the word to check then sets the new word in chars.
			checkWord = SetTempCharArray(inWord, tempWord, letter);			
			tempWord = CheckingWord(checkWord, tempWord);

			// Changes to the next letter numerically.
			letter = (letter < 2) ? ++letter : 0;
			
			++loops;
			if (loops > 15){
				if (PivotMove(currentWord, inWord))
					break;
				moves -= movesThisLoop;
				movesThisLoop = 0;		
				out.println("Failure");
				break;
			}
			out.println(tempWord + "  " + moves);
		}
		
		out.println("Moves: " + moves);
	}
	
	// InWord is the word we start at. 
	// checkPivotWord is the pivot word we are string to make it to.
	// tempWord is the (current word or the word passed in)
	// Check if pivots can reach each other.
	Boolean PivotToPivotCheck(String startWord, String lastWord){
		
		String pivotWord = "";
		String pivotWord2 = "";
		
		for (int i = 0; i < count-2; ++i){
			
			moves = 0;
			pivotWord = allWords[i];
			out.println("Pivot Word is: "+ pivotWord + ". Trying to get there from " + startWord);
			
			// Finds word that first word can reach.
			if (PivotCheck(currentWord, pivotWord)){			
				
				for (int i2 = 0; i2 < count-2; ++i2){
					pivotWord2 = allWords[i2];
					
					//  Finds word that second Word can Reach.
					if (PivotCheck(lastWord, pivotWord2))	{	
						if(PivotCheck(pivotWord, pivotWord2)){
							out.println("FOUND DUAL PIVOT CONNECTION");
							return true;
						}
					}						
				}
			}
		}
			
		return false;
	}
	// Checks to see if word can reach the Pivot.
	Boolean PivotCheck(String inWord, String checkPivotWord){
		
		loops = 0;
		int letter = 0;
		String tempWord = inWord;
		String checkWord = "";
		SetTempCharArrayStart(inWord);
		
		// Check for Letter One by One. 
		// If It's equal, Move on to next letter.
		
		while ( tempCharArray[0] != checkPivotWord.charAt(0) || tempCharArray[1] != checkPivotWord.charAt(1) || tempCharArray[2] != checkPivotWord.charAt(2) ) {
			
			// Check for Letter One by One. 
			// If It's equal, Move on to next letter.	
			if ( inWord.charAt(letter) == tempWord.charAt(letter) ) {
				letter = (letter < 2) ? ++letter : 0;
			}
			
			// Clears the word to check then sets the new word in chars.
			checkWord = SetTempCharArray(checkPivotWord, inWord, letter);			
			tempWord = CheckingWord(checkWord, tempWord);
			
			// Changes to the next letter numerically.
			letter = (letter < 2) ? ++letter : 0;
			
			++loops;
			if (loops > 15){
				moves -= movesThisLoop;
				movesThisLoop = 0;
				return false;
			}
			
		}
		out.println(checkPivotWord + "  " + moves);		
		
		return true;
	}
	
	// If we can't find it in one go, we try here with 1 pivot or 2. After that we just quit.
	Boolean PivotMove(String startWord, String lastWord){
		
		String pivotWord = "";
		for (int i = 0; i < count-2; ++i){
			moves = 0;
			pivotWord = allWords[i];
			out.println("Pivot Word is: "+ pivotWord + ". First Word Is: " + startWord + ". Last Word Is: " + lastWord);
			if (PivotCheck(currentWord, pivotWord)){
				out.println("FOUND POSSIBLE MID WORD");
					if (PivotCheck(pivotWord, lastWord))
						return true;
			}
		}
		
		// Checks for Pivot to Pivot movement and if Word to Pivot movement in one go. 
		// This is the final line of defense.
		// In relative calculation times this is already taking a long time. Not enough time to optimize.
		Boolean i = PivotToPivotCheck(startWord, lastWord);
		if (i) {
			out.println("Success!");
			return true;
		}
		
		return false;
	}
	
	Boolean ContinueMove(String inWord){
		
		return false;
	}
}
