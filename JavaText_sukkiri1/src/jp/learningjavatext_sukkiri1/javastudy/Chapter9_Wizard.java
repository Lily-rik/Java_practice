package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter9_Wizard {
	String name;
	int hp;
	
	public void heal(Chapter9_Hero h) {		// Hero型の引数(インスタンス(の参照番地))を受け取っている
		h.hp += 10;		// 受け取ったインスタンス(の参照番地)にあるhpフィールドの数値の書き換えを行う
		System.out.println(h.name + "のHPを10回復した！");
	}

}
