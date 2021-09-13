package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter9_Thief {
	String name;
	int hp;
	int mp;
	
	
	public Chapter9_Thief (String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Chapter9_Thief (String name, int hp) {
		this(name, hp, 5);
	}
	
	public Chapter9_Thief (String name) {
//		this(name, 40, 5); (自分の解答)
//		this(name, 40); (正答)		// 上記のメソッドを呼び出すと、mpの初期値はすでに5でき間ているため記述しなくてもよい
	}

}
