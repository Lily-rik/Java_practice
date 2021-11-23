package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter12_Practice_Main {

	public static void main(String[] args) {
		// 12-3 (2)
		Chapter12_Practice_Y[] y = new Chapter12_Practice_Y[2];
		y[0] = new Chapter12_Practice_A();
		y[1] = new Chapter12_Practice_B();
		
		for(Chapter12_Practice_Y yab : y) {
			yab.b();
		}
	}
}


// 12-1
// 	(1)Sword,Item,Sword,Item
//  (2)Monster,Slime,Slime,Monster

// 12-2
//  (1)a()
//  (2)"Aa","Ba"

// 12-3
//  (1)Y