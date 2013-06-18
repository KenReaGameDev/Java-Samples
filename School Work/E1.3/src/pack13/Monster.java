package pack13;

public class Monster {
	
	String m_name;
	int m_age;
	public String getName() {
		return m_name;
	}
	public void setName(String m_name) {
		this.m_name = m_name;
	}
	public int getAge() {
		return m_age;
	}
	public void setAge(int m_age) {
		this.m_age = m_age;
	}
	
	public static void main(String[] args){
		Monster leviathon = new Monster();
		leviathon.setName("leviathon");
		leviathon.setAge(150);
		System.out.println("Monsters name is " + leviathon.getName());
		System.out.println("Monsters age is " + leviathon.getAge());
		
	}

}
