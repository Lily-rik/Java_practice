package jp.learningjavatext_sukkiri1.javastudy;

public abstract class Chapter12_Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	public abstract void attack(Chapter12_Matango m);
	
}
