// Score Sort

// Author: Kenneth Rea
// Date: 4/25/2013
// CODE-FOO

package ScorePack;
import java.util.ArrayList;
import static java.lang.System.out;

public class score {
	public int[] m_score;
	public String[] m_name;
	int count = 0;
	
	
	public void addScore(int inScore, String inName){		
		++count;
		int[] temp = m_score;
		m_score = new int[count];		
					
		try {
			for (int i = 0; i < temp.length; ++i)
			{
				m_score[i] = temp[i];
			}
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		m_score[count - 1] = inScore;
		
		String[] tempString = m_name;
		m_name = new String[count];					
		
		try {
			for (int i = 0; i < tempString.length; ++i)
			{
				m_name[i] = tempString[i];
			}
		} catch (Exception e) {
			
			//e.printStackTrace();
		}
		m_name[count - 1] = inName;
	}
}
