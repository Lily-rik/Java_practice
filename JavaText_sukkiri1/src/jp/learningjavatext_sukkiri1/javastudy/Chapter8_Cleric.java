package jp.learningjavatext_sukkiri1.javastudy;

import java.util.*;		// java.utilの全てのクラスが使用できるように宣言

public class Chapter8_Cleric {
	// フィールド
	String name;
	int hp = 50;;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	// メソッド
	public void selfAid() {		// 魔法「セルフエイド」
		System.out.println(this.name + "は、セルフエイドを唱えた！");	// 解説
		// mp -= 5; (自分の解答)
		this.mp -= 5;		// (正答)　「自分自身の」という意味のthisをつけ忘れないように注意！　クセづける！
		// hp = MAXHP; (自分の解答)
		this.hp = this.MAXHP;		// (正答)
		System.out.println("HPが最大まで回復した");		// 解説
	}
	
	public int pray(int sec) {	// 「祈る」
//		自分の解答　文法的に間違ってはない、、、？(thisは入れる！)
//		int r = new java.util.Random().nextInt(3);
//		mp += sec + r;
//		if (mp > MAXMP) {
//			mp = MAXMP;
//		}
//		return mp;	// 戻り値は実際に回復したmpの値なのでここは間違い
									// actualmp = sec + r でactualmpを戻り値とする
		
		// 解説
		System.out.println("this.name" + "は、" + sec + "秒間天に祈った！");		// secは引数のためthisは不要
		int recover = new Random().nextInt(3) + sec;	// import宣言しているためクラス名だけで使用することができる
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);	// 最大MPから現在のMPの値を引いた値と、回復値の小さい方が実際の回復値となる
										 // Math.min(①, ②);														 (MPの最大値以上に回復することはできないため)
										 // 2つの値を比較して小さい方の数値を代入する命令
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;		// 戻り値は「実際に回復したMPの量」の指示があるため
		
	}

}
