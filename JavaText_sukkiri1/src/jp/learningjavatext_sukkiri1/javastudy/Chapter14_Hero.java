package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter14_Hero {
	String name;
	int hp;
	static int money;		// 静的フィールド
	
	// toStringの表示内容を変えたい時はオーバーライドする必要がある
	public String toString() {
		return "名前：" + this.name + "/HP：" + this.hp;
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Chapter14_Hero) {
			Chapter14_Hero h = (Chapter14_Hero)o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
	
	// 静的メソッド、クラスメソッド
	// 1.メソッド自体がクラスに属するようになる
	// 2.インスタンスにメソッドの分身が準備される
	// 3.インスタンスを1つも生み出すことなく呼び出せる
	public static void setRandomMoney() {
		Chapter14_Hero.money = (int)(Math.random() * 1000);
//	System.out.println(this.name + "たちの所持金を初期化しました");
//  静的メソッドに中に記述
	}

}









