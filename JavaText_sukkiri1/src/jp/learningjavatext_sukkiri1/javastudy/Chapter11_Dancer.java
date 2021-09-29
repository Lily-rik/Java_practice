package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter11_Dancer extends Chapter11_Character {
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	
	public void attack(Matango m) {								// 親から継承した「詳細未定のattack()」を上書きする = 実装
		System.out.println(this.name + "の攻撃");			// オーバーライドしないと継承してきた親クラスに抽象メソッドが含まれているため、
		System.out.println("敵に3ポイントのダメージ");	// このクラスも抽象クラスにしないとコンパイルすることができなくなる
		m.hp -= 3;
	}

}

