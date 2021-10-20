package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter10_Practice_Matango {
	
	int hp = 50;
	char suffix;
	
	public Chapter10_Practice_Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Chapter10_Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
	

}


// 10-1
// 	②、③、⑤		// ②：エンジンは車の一部であり、has-aの関係にある、has-aは種類


// 10-2
// 順番が逆、問題読み取りのミス、、、内容はOK
// 	(1)ア：iphone、イ：Machine
// 	(2)ア；BMW、イ：Vehicle
// 	(3)ア：Japanese and English Dictionary、イ：Book
