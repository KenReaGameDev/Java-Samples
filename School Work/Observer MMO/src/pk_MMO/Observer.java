package pk_MMO;

public interface Observer {
	public void update(int Health);
	public void notifySubject();
	public void pullSubject();
}
