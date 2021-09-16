package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter10_practice_Main {

	public static void main(String[] args) {
		
		Chapter10_practice_Hero h = new Chapter10_practice_Hero();
		System.out.println(h.name + "の現在のHPは、" + h.hp + "だ");
		
		Chapter10_practice_PoisonMatango pm = new Chapter10_practice_PoisonMatango('A');
		
		pm.attack(h);
		System.out.println(h.name + "の残りHPは、" + h.hp + "だ");

	}

}


// 10.1
// ③,⑤
// 解答：②も間違い → エンジンは車の「一部」であり、has-aの関係である。一種ではないため間違い

// 10.2
// ① (ア)Machine, (イ)iphone
// ② (ウ)Vehicle, (エ)TOYOTA
// ③ (オ)Book, (カ)English-Japanese dictionary
