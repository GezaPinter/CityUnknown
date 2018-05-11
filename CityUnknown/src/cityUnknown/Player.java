package cityUnknown;

import java.awt.*;
import java.awt.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	Scanner anything = new Scanner(System.in);
	private String name;
	private int money;
	private int exhaustion;
	private int strength;
	private int courage;
	private String[] items = {"","","","",""};
	
	public Player(int money, int exhaustion, int strength, int courage, String[] items) {
		this.money = money;
		this.exhaustion = exhaustion;
		this.strength = strength;
		this.courage = courage;
		this.items = items;
	}
	

	public String Speak() {
		try {
		String line = anything.next();
		return line;
		} catch (Exception e) {
			System.out.println("Kerlek adj meg rendes szoveget!");
			this.Speak();
		}
		return null;
	}
	
	public boolean Choice() {
		try {
			String choice = anything.next();
		
			if(choice.equals("Yes") || choice.equals("yes")) {
				return true;
			} else if(choice.equals("No") || choice.equals("no")) {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Kerlek adj meg rendesen -Yes- vagy -No- valaszt!");
			this.Choice();
		}
		
		return false;
	}
	
	public void inventory() {
		for(int i = 0; i < this.getItems().length; i++){
		System.out.println(this.getItems()[i]);
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getExhaustion() {
		return exhaustion;
	}

	public void setExhaustion(int exhaustion) {
		this.exhaustion = exhaustion;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(int hova, String mit) {
		this.items[hova] = mit;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "The player " + this.getName() + " got " + this.money + " money.";
	}
	
}
