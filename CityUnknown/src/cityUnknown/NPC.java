package cityUnknown;

public class NPC {
	private int patience;
	private int stength;
	private int courage;
	private String speak;
	
	public NPC(int p, int s, int c, String sp) {
		this.patience = p;
		this.stength = s;
		this.courage = c;
		this.speak = sp;
	}

	public int getPatience() {
		return patience;
	}

	public void setPatience(int patience) {
		this.patience = patience;
	}

	public int getStength() {
		return stength;
	}

	public void setStength(int stength) {
		this.stength = stength;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public String getSpeak() {
		return speak;
	}

	public void setSpeak(String speak) {
		this.speak = speak;
	}

}
