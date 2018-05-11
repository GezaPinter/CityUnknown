package cityUnknown;

import java.util.Scanner;

public class Story {
	Player player;
	Scanner string = new Scanner(System.in);
	
	public Story(Player p) {
		this.player = p;
	}
	
	public void scroll(String text){
		for(int i = 0; i < text.length(); i++) {
		    long start = System.currentTimeMillis();
		    while (System.currentTimeMillis() - start < 110) {

		    }
		    System.out.print(text.charAt(i));
		}
	}
	
	public void wait(String e) {
		String enter = string.nextLine();
		e = enter;
	}
	
	public void prologue() {
		this.scroll("Are you awake?!");
		this.wait("");
		this.scroll("Come on, get UP!");
		this.wait("");
		this.scroll("Come on! They are coming, We have to GO!");
		this.wait("");
		this.scroll("-You find yourself dizzy from waking up like that.-");
		this.wait("");
		this.scroll("-You realize, You dont remember anything what happened.-");
		this.wait("");
		this.scroll("No time for waking up party, come with me I will help you. - Said the Stranger");
		this.wait("");
		this.scroll("-Will you trust this guy?-");
		this.wait("");
		this.scroll("-You dont remember anything.-");
		this.wait("");
		this.scroll("-What will you do?- ");
		this.wait("");
		this.scroll("-Do you go with HIM or NOT and do something by yourself?-");
		this.wait("");
		this.scroll("-Yes or No?-");
		this.wait("");
		this.scroll("Am I on github? LoL");
		
		
	}
	
	public void firstchoice() {
		if(player.Choice() == true) {
			this.scroll("Finally, You got up, We can go now, hurry!");
			this.wait("");
			this.scroll("-You found yourself with that stranger who spoke to you a while ago.-");
			this.wait("");
			this.scroll("Can you speak now? - Said the Stranger");
			this.wait("");
			this.scroll("Tell me your name so, I can tell mine.");
			this.wait("");
			this.scroll("I dont remember.. - you said");
			this.wait("");
			this.scroll("Try remembering by writing it down. - Said the Stranger");
			this.wait("");
			this.scroll("-The stranger hands you a paper and a writing quill.-");
			player.setItems(0, "Quill");
			player.setItems(1, "Paper");
			this.wait("");
			this.scroll("-Write your name down.-");
			player.setName(player.Speak());
			this.scroll("My name is " + player.getName() + ". - you said");
			this.wait("");
			this.scroll("Okay, my name is Narukami, nice to meet you " + player.getName() + "! - Said Narukami");
			this.wait("");
			this.scroll("-You can chech your inventory by typing -i- in.-");
			if(player.Speak().equals("i")) {
				player.inventory();
			}
			this.wait("");
			this.scroll("We are getting closer to the city. - Said Narukami");
			this.wait("");
			this.scroll("Wait, so what are We going to do there? - you asked");
			this.wait("");
			this.scroll("We are running from <Them>. - Said Narukami");
			this.wait("");
			this.scroll("Bad creatures, no one is save from <Them>. No one!... - Said Narukami");
		}
			
		if(player.Choice() == false) {
			this.scroll("What are you doing?");
			this.wait("");
			this.scroll("I cant wait anylonger for you!");
			this.wait("");
			this.scroll("-You found yourself alone in the dark.-");
			this.wait("");
			this.scroll("-You wonder around in the dark until...-");
			this.wait("");
			System.err.println("-You should try again!-");
			this.wait("");
			System.err.println("-Game Over!-");
		}
	}
	
	
	
	
}