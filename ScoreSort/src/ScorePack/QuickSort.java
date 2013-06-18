//Score Sort

// Author: Kenneth Rea
// Date: 4/25/2013
// CODE-FOO

package ScorePack;

import java.util.ArrayList;
import static java.lang.System.out;


public class QuickSort {

	//static ArrayList <score> scores = new ArrayList <score>();
	static int[] scoreArray;
	
	public static void main(String[] args){
		
		score scoreList = new score();
		scoreList.addScore(500, "Ken");
		scoreList.addScore(100, "Brian");
		scoreList.addScore(900, "Adam");
		scoreList.addScore(600, "Eileen");

		quickSort(scoreList.m_score, scoreList.m_name, 0,	scoreList.m_score.length - 1);

		
		for (int ndx = 0; ndx < scoreList.m_score.length; ++ndx)
		{
			out.println(scoreList.m_score[ndx]);
			out.println(scoreList.m_name[ndx]);
		}
		out.println("finished");

	}
	
	// Quick sort that copies what it does to the numbers directly to the letters.
	static int partition(int arr[], String arrString[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      String tmpString;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	            	  tmpString = arrString[i];
	                  tmp = arr[i];
	                  arrString[i] = arrString[j];
	                  arr[i] = arr[j];
	                  arrString[j] = tmpString;
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	static void quickSort(int arr[], String arrString[], int left, int right) {
	      int index = partition(arr, arrString, left, right);
	      if (left < index - 1)
	            quickSort(arr, arrString, left, index - 1);
	      if (index < right)
	            quickSort(arr, arrString, index, right);
	}
	
	
}
