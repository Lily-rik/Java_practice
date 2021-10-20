package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter10_Practice_PoisonMatango extends Chapter10_Practice_Matango {
	
	int count;
	
	
	public Chapter10_Practice_PoisonMatango(char suffix) {
		super(suffix);
		this.count = 5;
	}
	
//	毒攻撃は攻撃の一種だった、、、
//	public void poisonAttack(Chapter10_Hero h) {
//		System.out.println("キノコ" + this.suffix + "の毒攻撃！");
//		System.out.println(h.name + "に10のダメージをあたえた！");
//		h.hp -= 10;
//	}
	
	public void attack(Chapter10_Hero h) {
		super.attack(h);
		if (this.count != 0) {		// count前にthis抜け！ローカル変数や引数が同じだった場合バグの原因になるため注意！
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ！");
			this.count--;
		}
	}

}
