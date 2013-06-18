package pk_MMO;

public class Playthrough {

	public static void main(String[] args) {
	Server server = new Server();
	
	Player player1 = new Player(150, server);
	Player player2 = new Player(100, server);
	
	Bots bot1 = new Bots(30, server);
	
	Villain villain1 = new Villain(30, server);
	Villain villain2 = new Villain(30, server);
	Villain villain3 = new Villain(30, server);
	
	Boss boss1 = new Boss(300, server);
	
	Boolean playing = true;
	int i = 0;
	while(playing == true)
	{
		playing = server.EmulatePlaythrough();	
		i++;
		System.out.println(i);
	}
	System.out.println("Game Over");
	
	}
	
	
}
