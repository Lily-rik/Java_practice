package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter09_Main {

	public static void main(String[] args) {
		// 勇者1
		Chapter09_Hero h1;
		h1 = new Chapter09_Hero();
		h1.hp = 100;
		
		// 勇者2
		Chapter09_Hero h2;
		h2 = h1;				// 同じ番地を参照しているため勇者1と勇者2は同じ勇者を指す
		h2.hp = 200;		// また、newしていないことからも勇者は1人であることが分かる
		System.out.println("勇者のHPは" + h1.hp);
		System.out.println();
		
		
		Chapter09_Sword s = new Chapter09_Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Chapter09_Hero h3 = new Chapter09_Hero();
		h3.name = "ミナト";
		h3.hp = 100;
		h3.sword = s;		// swordフィールドに生成済みの剣インスタンス(の番地)を代入
		System.out.println("現在の武器は" + h3.sword.name);		// 勇者(の番地)の剣(の番地)の名前領域を指定
		h3.attack();
		System.out.println();
		
		
		Chapter09_Hero h4 = new Chapter09_Hero();
		h4.name = "ミナト";
		h4.hp = 100;
		
		Chapter09_Hero h5 = new Chapter09_Hero();
		h5.name = "アサカ";
		h5.hp = 100;
		
		Chapter09_Wizard w = new Chapter09_Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h4);		// ミナトを回復させる
		w.heal(h5);		// アサカを回復させる
		w.heal(h5);		// アサカを回復させる
		System.out.println();
		
		
		// String型はクラス型である！
		// java.langパッケージのStringクラスであるため、import文は省略し、クラス名のみの記載で良い
		// Stringは多用されるため、特例としてnew演算子を用いず""で囲めばインスタンスを生成することができる
		// そのためHero型などと同じようにnewを用いてインスタンスを生成することも可能である(非推奨)
		java.lang.String str = new String("こんにちは");
		System.out.println(str);
		System.out.println();
		
		
		Chapter09_Hero h6 = new Chapter09_Hero();
		System.out.println("勇者の初期HPは、" + h6.hp);
		System.out.println();
		
		
		// コンストラクタの引数はnewする際に渡す
		Chapter09_Hero h7 = new Chapter09_Hero("ミナト");		// インスタンス生成後、JVMがコンストラクタを呼び出す際に引数を渡す
		System.out.println("勇者の初期HPは、" + h7.hp);
		System.out.println("勇者1の名前は、" + h7.name);
		Chapter09_Hero h8 = new Chapter09_Hero();					// 引数がないためオーバーロードしたコンストラクタ(ダミー)が呼び出される
		System.out.println("勇者2の名前は、" + h8.name);	
		System.out.println();
		
	}

}
