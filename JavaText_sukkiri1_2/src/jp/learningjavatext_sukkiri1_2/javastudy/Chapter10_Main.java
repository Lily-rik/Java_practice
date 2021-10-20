package jp.learningjavatext_sukkiri1_2.javastudy;

public final class Chapter10_Main {		// finalが付けられているクラスは継承できない
																			// *Stringクラスはfinalがついているため継承することはできない！

	public static void main(String[] args) {
		
		// Heroインスタンス
		Chapter10_Hero h = new Chapter10_Hero();
		h.run();
		
		// SuperHeroを生み出してrun()を呼び出す
		Chapter10_SuperHero sh = new Chapter10_SuperHero();
		sh.run();
		System.out.println();
				
		Chapter10_Weapon w = new Chapter10_Weapon();
		
	}

}
