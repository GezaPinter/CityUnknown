package cityUnknown;

public class Main {

	public static void main(String[] args) {
		String[] items = {"","","","",""};
		Player p = new Player(0, 70, 2, 0, items);
		Map m = new Map();
		Story story = new Story(p);
		
		//m.PrintMap();
		//story.prologue();
		story.firstchoice();
	}

}
