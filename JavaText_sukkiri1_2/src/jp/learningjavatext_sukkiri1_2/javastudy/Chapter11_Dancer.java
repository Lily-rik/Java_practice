package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter11_Dancer extends Chapter11_Character {
	
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	
	// 親クラスに抽象メソッドがある場合、オーバーライド、もしくは抽象クラスにしないとコンパイルエラーになる
	// 抽象クラスにした場合は、このクラスもnewはできなkなる
	public void attack(Chapter08_Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ！");
		m.hp -= 3;
	}

}
