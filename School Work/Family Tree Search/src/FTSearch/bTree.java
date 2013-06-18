// Family Tree

// Author: Kenneth Rea
// Date: 4/21/2013
// CODE-FOO

package FTSearch;

import java.util.ArrayList;
import static java.lang.System.out;

public class bTree {
	
	bTree Parent1;
	bTree Parent2;
	ArrayList <bTree> Children = new ArrayList <bTree>();
	
	String firstName = "";
	String lastName = "";
	int generation = 0;
	
	bTree(){
	}
	
	bTree(String inFirstName, String inLastName){
		firstName = inFirstName;
		lastName = inLastName;
	}
	
	bTree(String inFirstName, String inLastName, bTree p1, bTree p2){
		firstName = inFirstName;
		lastName = inLastName;
		Parent1 = p1;
		Parent2 = p2;
	}
	
	public void SetFirstName(String inName){
		firstName = inName;
	}

	public void SetLastName(String inName){
		lastName = inName;
	}
	
	public void AddChild(bTree inChild){
		Children.add(inChild);
	}
	
	
	public void SetGeneration(){
		int genCheck = 0;
		int genCheck2 = 0;
		generation = 0;
		bTree parentFinder = new bTree();
		parentFinder = Parent1;
		
		// Checks the generation of the child by going up the entire tree.
		while(parentFinder != null)
		{
			++genCheck;
			parentFinder = parentFinder.Parent1;
		}
		
		parentFinder = Parent2;
		
		while(parentFinder != null)
		{
			++genCheck2;
			parentFinder = parentFinder.Parent1;
		}
		
		generation = genCheck > genCheck2 ? genCheck : genCheck2;
		
	}
	
	public void SetParent1AndChild(bTree parentTree){
		Parent1 = parentTree;
		parentTree.AddChild(this);	
		SetGeneration();
	}
	
	public void SetParent2AndChild(bTree parentTree){
		Parent2 = parentTree;
		parentTree.AddChild(this);	
		SetGeneration();
	}
	
	public void CreateChild(String inNameFirst, String inNameLast){
		bTree newChild = new bTree(inNameFirst, inNameLast);
		newChild.Parent1 = this;
		Children.add(newChild);
	}
	
	public void ReciteInformation(){
		out.println("First Name: " + firstName);
		out.println("Last Name: " + lastName);
		out.println("Parent1 First Name: " + Parent1.firstName);
		out.println("Parent2 First Name: " + Parent2.firstName);
		
		for (bTree kid : Children)
		{
			out.println("Childs First Name: " + kid.firstName);
		}
	}
	
}
