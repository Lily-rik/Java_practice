package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter09_Wizard {
	
	String name;
	int hp;
	
	public void heal(Chapter09_Hero h) {
		h.hp += 10;		// このインスタンス自身がHeroを持っているわけではない(引数として持ってきている)のでthisは用いない
		System.out.println(h.name + "のHPを10回復した！");
	}

}
