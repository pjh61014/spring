package di.cunstructor02;


public class Player implements AbstactPlayer{
	AbstractDice d;
	int totalValue=0;
	
	
	public Player(Dice d) {
		super();
		this.d = d;
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}
