package jp.learningjavatext_sukkiri1_2.javastudy;

// 抽象クラス、抽象メソッド
public abstract class Chapter11_Character {		// abstract：抽象メソッドを含むクラスはnewされないようにabstractを宣言する必要がある
	String name;
	int hp;
			
	
	// 逃げる		
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	// 戦う
	public abstract void attack(Chapter08_Matango m);		// abstract：抽象メソッド

	

}
