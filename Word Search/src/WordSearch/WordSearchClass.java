// Word Search

// Author: Kenneth Rea
// Date: 4/21/2013
// CODE-FOO


package WordSearch;

import static java.lang.System.out;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;


public class WordSearchClass {

	// Off by 1, don't forget!
	static int puzzleRows = 24;
	static int puzzleCols = 19;
	static int wordAmnt = 23;

	static String currentWordString = "";
	static String currentFindings = "";
	static int currentWord = 0;
	static int currentLetter = 0;
	static int nextLetter = 0;
	static int selectedLetter = 0;

	static int currentRow = 0;
	static int currentCol = 0;

	static int checkRow = 0;
	static int checkCol = 0;

	public static char[][] puzzle = new char[25][20];
	public static String[] words = new String[24];
	public static String wordComb = new String();

	// Loads the puzzle from a text file.
	public static void LoadPuzzle() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				"wrdsearch.txt"));

		int r;

		for (int i = 0; i < 25; ++i) {
			for (int j = 0; j < 20; ++j) {
				r = reader.read();
				while ((char) r == ' ')
					r = reader.read();

				if (r != -1)
					puzzle[i][j] = (char) r;
			}
			// Bug! reader takes end line as 2 places? This is a temporary fix.
			reader.read();
			reader.read();
		}

	}

	// Loads the words needed to be found from a text file.
	public static void LoadList() throws IOException {

		BufferedReader reader = new BufferedReader(
				new FileReader("wrdlist.txt"));

		int r;
		char ch;

		for (int i = 0; i < 24; ++i) {

			// Have to set each word to empty first or it adds null at start.
			words[i] = "";
			
			// Make sure we haven't hit end of file.
			while ((r = reader.read()) != -1) {
				ch = (char) r;
				// Checking for new word
				if (ch == ',')
					break;
				// Make sure no spaces mess with word finding.
				if (ch == ' ')
					continue;
				// Adds letter to word.
				words[i] += ch;
			}
			
			// Debug Purposes
			out.println(words[i]);

		}
		
		// Debug Purposes
		for (int i = 0; i < 24; ++i) {
			out.println(words[i]);

		}
	}

	// Finds the first letter of the current word we are looking for.
	static void FindFirstLetter(){
		
		char i = words[currentWord].charAt(0);
		
		for (currentRow = 0; currentRow < puzzleRows; ++currentRow) {
			if (currentRow < 0 | currentRow > puzzleRows)
				continue;

			for (currentCol = 0; currentCol < puzzleCols; ++currentCol) {
				if (currentCol < 0 | currentCol > puzzleCols)
					continue;
				++selectedLetter;
				if (puzzle[currentRow][currentCol] == Character.toLowerCase(i))
				{
					wordComb = "";
					wordComb += i;
					out.println(i);
					if (CheckSurroundings())
						return;
				}
			}
		}
		
	}
	
	// Checks the surroundings of the letter we are looking for.
	static Boolean CheckSurroundings() {

		++currentLetter;
		char i = words[currentWord].charAt(currentLetter);
		out.println("Checking Surroindings for  for " + i);
		
		// Checks each column in the row then moves on to next row.
		for (checkRow = currentRow - 1; checkRow <= (currentRow + 1); ++checkRow) {
			
			if (checkRow < 0 | checkRow > puzzleRows)
				continue;

			for (checkCol = currentCol - 1; checkCol <= (currentCol + 1); ++checkCol) {
				
				if (checkCol < 0 | checkCol > puzzleCols)
					continue;
				
				// Checks the letter against the current word and starting letter.
				if (puzzle[checkRow][checkCol] == Character.toLowerCase(i))
				{
					
					out.println("Surround finds " + i);
					wordComb += i;
					// Continues checking the direction it found the letter in.
					if (ContinuePath(checkRow, checkCol))
						return true;
				}
			}
		}
		
		currentLetter = 0;
		out.println("Returning False due to no surround found for this letter");
		return false;
	}

	// Continues in the direction letter has been found in until it reaches the wrong letter or completes the word.
	public static Boolean ContinuePath(int initialRow, int initialCol) {
		out.println("Continuing Path");
		int holdRow = initialRow;
		int holdCol = initialCol;
		int rowDif = checkRow - currentRow;
		int colDif = checkCol - currentCol;
		
		holdRow += rowDif;
		holdCol += colDif;
		int wrdlngth = words[currentWord].length();
	   ++currentLetter;
		
		out.println(holdRow);
		out.println(holdCol);
		if (currentLetter == wrdlngth)
		{
			out.println(wordComb);
			wordComb = "";
			return true;
		}
		
		out.println("Looking For " + words[currentWord].charAt(currentLetter));
		out.println(words[currentWord]);
		
		// While the letter we are checking is still within the amount of letters the word has check again.
		if (currentLetter < wrdlngth)
		{
			char i = words[currentWord].charAt(currentLetter);
			if (holdRow < 0 | holdCol < 0 | holdRow > puzzleRows | holdCol > puzzleCols)
			{
				out.println("returning FALSE due to out of boundries");
				currentLetter = 0;
				return false;
			}
			if (puzzle[holdRow][holdCol] ==  Character.toLowerCase(i))
			{
				out.println(i);
				out.println("Found " + words[currentWord].charAt(currentLetter));
				wordComb += i;
				// If the letter is found, recursive function to check for next. 
				if (ContinuePath(holdRow, holdCol))
				{
					out.println("returning TRUE... found Letter");
					return true;
				}
			}		
		}		
		--currentLetter;
		out.println("returning FALSE due to not found.");
		return false;
		
		// When word is found, make them capital in the word search.
	}

	public Boolean CheckNextCharacter() {
		if (currentWordString.length() <= currentLetter)
			return false;

		return true;
	}

	// Resets what is needed to check for new word.
	public static Boolean NextWord() {
		if (currentWord >= wordAmnt)
		{
			out.println("No Next Word");
			return false;
		}

		++currentWord;
		currentLetter = 0;
		nextLetter = 0;
		currentRow = 0;
		currentCol = 0;
		checkRow = 0;
		checkCol = 0;
		selectedLetter = 0;
		wordComb = "";
		
		currentWordString = words[currentWord];
		return true;
	}
	
	// This might not be needed.
	public static Boolean NextLetter(){		
		if (currentCol < puzzleCols){
			++currentCol;
		}
		else{
			++currentRow;
			currentCol = 0;
		}
		
		if (currentRow <= puzzleRows)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		try {
			LoadPuzzle();
			LoadList();
		} catch (IOException e) {
			e.printStackTrace();
		}
		wordComb = "";
		Boolean playing = true;
		
		// Word Search Loop
		while ( playing ){
		FindFirstLetter();
		
		if (NextWord())
			continue;
		// this ends the game.
		if ( !NextWord())
			break;
		}
		
		out.println("Finishing Program");
	}
}
