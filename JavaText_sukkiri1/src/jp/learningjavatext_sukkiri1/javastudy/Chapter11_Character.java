package jp.learningjavatext_sukkiri1.javastudy;

public abstract class Chapter11_Character {		// 抽象クラス：抽象メソッドを含むクラスは必ずabstract付きのクラスにしなければならない
	String name;																// もし付けずにコンパイルするとエラーになる
	int hp;																			// この宣言をすることによって、newによるインスタンス化が禁止される
	
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	// 戦う
	public abstract void attack(Matango m);		// 抽象メソッド：現時点では何をするか確定できないメソッド
																						// この宣言によって何もしないメソッドと区別することができる

}

