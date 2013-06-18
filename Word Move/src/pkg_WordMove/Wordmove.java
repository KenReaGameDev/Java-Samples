// Word Move

// Author: Kenneth Rea
// Date: 4/25/2013
// CODE-FOO

package pkg_WordMove;

import static java.lang.System.out;
import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.IOException;

public class Wordmove {
	
	public static void main(String[] args){
		WordList words = new WordList();
		
		try {
			words.LoadList();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		words.CheckForWord("TOY");
	}
	

}
