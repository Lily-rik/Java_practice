package jp.learningjavatext_sukkiri1.javastudy;

public final class Chapter10_Main {		// クラス名にfinalを付けると、そのクラスは継承できなくなる
																			// Stringクラスにはfinalが付いており、継承できないようになっている

	public static void main(String[] args) {
		Chapter10_Hero h = new Chapter10_Hero();
		h.run();
		System.out.println();
		
		Chapter10_SuperHero sh = new Chapter10_SuperHero();
		sh.run();		// SuperHeroはHeroクラスを継承しているため、runメソッドも使用することができる
								// オーバーライドしたことによって、Heroと出力情報が異なるようになった
		sh.fly();
		sh.land();
		System.out.println();
		
		// 武器生成
		Chapter10_Weapon w = new Chapter10_Weapon();
		System.out.println("剣の名前は" + w.name);
		System.out.println("値段は" + w.price + "円");
		System.out.println();
		
		
		// お化けキノコ生成
		Chapter10_Matango m = new Chapter10_Matango();

	}


	
	
	
	
	
	
}
