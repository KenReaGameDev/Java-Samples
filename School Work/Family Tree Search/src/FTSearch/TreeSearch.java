// Family Tree

// Author: Kenneth Rea
// Date: 4/21/2013
// CODE-FOO

package FTSearch;

import java.util.ArrayList;
import static java.lang.System.out;

public class TreeSearch {

	public static  ArrayList <bTree> allPeople = new ArrayList <bTree>();
	public static bTree search;
	
	public static void main(String[] args) {
		
		allPeople.add(new bTree("Ken","Rea"));
		allPeople.get(0).CreateChild("Ken", "Rea Jr");
		allPeople.get(0).CreateChild("Ken", "Rea 3rd");
		
		out.println(allPeople.get(0).Children.get(0).Parent1.lastName);
		
		search = FindPersonByName("Ken", "Rea 3rd");
	}
	
	// Attempts to find the person by name, starting at the top 
	// of the tree and searched to the bottom each recursive attempt.
	static bTree FindPersonByName(String inFirst, String inLast){
		
		out.println("Looking for " + inFirst + " " + inLast);
		if (checkChild(search = allPeople.get(0), inFirst, inLast) == true)
			return search;
		
		out.println("Nobody was found by that name.");
		return null;
		
		// Return false when not found, try next child, return false no children left. 
	}
	
	// Checks the child of the person being looked for.
	static Boolean checkChild(bTree inElement, String inFirst, String inLast){
		
		out.println("In Person " + inElement.firstName + " " + inElement.lastName);
		for (bTree kid : inElement.Children){
			if (!kid.firstName.equalsIgnoreCase(inFirst) | !kid.lastName.equalsIgnoreCase(inLast)){
				out.println("Checking kid " + kid.firstName + " " + kid.lastName);
				checkChild(kid, inFirst, inLast);
			}
			else{
				out.println("Found Person");
				search = kid;
				return true;
			}
		}
		
		return false;		
	}
}
