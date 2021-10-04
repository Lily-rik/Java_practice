package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter12_Main {
	public static void main (String[] args) {
		Chapter12_Character c = new Chapter12_Wizard();
		Chapter12_Wizard w = (Chapter12_Wizard)c;		// ダウンキャスト = 強制的な代入
		Chapter12_Matango m = new Chapter12_Matango();
		
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
		System.out.println();
		
		
		Chapter12_Slime s = new Chapter12_Slime();
		Chapter12_Monster M = new Chapter12_Slime();
		
		s.run();
		M.run();
		System.out.println();
		
//		安全にキャストできるか判定する 変数 indtanceof 型名
//		if (c instanceof SuperHero) {
//			superHero h = (superHero) c;
//			h.fly();
//		}
		
		
		// 5人組でパーティを組む
		Chapter12_Hero h1 = new Chapter12_Hero();
		Chapter12_Hero h2 = new Chapter12_Hero();
		Chapter12_Thief t1 = new Chapter12_Thief();
		Chapter12_Wizard w1 = new Chapter12_Wizard();
		Chapter12_Wizard w2 = new Chapter12_Wizard();
		
		// 冒険開始！
		// まず宿屋に泊まる(全員のhpが50回復する)
		h1.hp += 50;
		h2.hp += 50;
		t1.hp += 50;
		w1.hp += 50;
		w2.hp += 50;
		
		// 上記コードの問題点
		// コードに重複が多い、将来的に多くの修正が必要
		
		// 上記の問題点を、多態性と配列を組み合わせて解決する！
		Chapter12_Character[] C = new Chapter12_Character[5];
		C[0] = new Chapter12_Hero();
		C[1] = new Chapter12_Hero();
		C[2] = new Chapter12_Thief();
		C[3] = new Chapter12_Wizard();
		C[4] = new Chapter12_Wizard();
		
		// 宿屋に泊まる
		// それぞれのキャラクターをざっくりキャラクターとまとめることで、一括して扱うことが可能となる
		for(Chapter12_Character ch : C) {
			ch.hp += 50;
		}
		
		
		
		// モンスターへの攻撃
		Chapter12_Slime S = new Chapter12_Slime();
		Chapter12_Goblin G = new Chapter12_Goblin();
		Chapter12_DeathBat D = new Chapter12_DeathBat();
		
		h1.name = "ミナト";
		h1.attack(S);
		h1.attack(G);
		h1.attack(D);
		System.out.println();
		
		// 多態性の特徴
		// ざっくり捉えてまとめて扱う
		// メソッドの動作は中身の型に従う
		// 上記の特徴を組み合わせることで、多態性の真価を発揮することができる！
		
		// 同じ指示で異なる動作をさせることができる
		Chapter12_Monster[] monsters = new Chapter12_Monster[3];
		monsters[0] = new Chapter12_Slime();
		monsters[1] = new Chapter12_Goblin();
		monsters[2] = new Chapter12_DeathBat();
		
		for (Chapter12_Monster MO : monsters) {
			MO.run();
		}

		
	}
	
	
	
	

}





