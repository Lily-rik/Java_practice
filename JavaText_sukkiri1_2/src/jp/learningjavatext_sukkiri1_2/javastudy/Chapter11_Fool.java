package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter11_Fool extends Chapter11_Character interface Chapter11_Human {
	
	// Characterクラスからhpやnameなどのフィールドを継承している
	
	// Characterから継承した抽象メソッドattack()を実装
	public void attack(Chapter08_Matango m) {
		System.out.println(this.name + "は戦わずに遊んでいる");
	}
	
	// さらにHumanから継承した4つの抽象メソッドを実装
	public void talk() {…}
	public void watch() {…}
	public void hear() {…}
	public void run() {…}

}
