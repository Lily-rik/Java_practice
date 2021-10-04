package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter13_Practice_Main {
	public static void main (String[] args) {
		
		Chapter13_Hero h = new Chapter13_Hero();
		Chapter13_Wizard w = new Chapter13_Wizard();
		w.getWand().setPower(10.2);
		w.heal(h);
	}

}
