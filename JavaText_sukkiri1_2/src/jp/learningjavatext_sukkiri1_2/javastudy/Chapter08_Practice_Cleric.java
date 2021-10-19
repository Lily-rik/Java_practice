package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter08_Practice_Cleric {
	
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
	}
	
	public int pray(int sec) {
		int random = new java.util.Random().nextInt(3);
		int recovery = sec + random;
//		自分の回答
//		if (this.mp + recovery < 10) {
//			this.mp += recovery;
//		} else {
//			this.mp = this.MAXMP;
//		}
//		return recovery;		// この記述だと、実際足すと10以上になる場合にもその値が回復したことになってしまうため正しくない
		
//		解答
		// 実際の回復量を計算する
		int recoveryActual = Math.min(this.MAXMP - this.mp, recovery);		// MAXMP(10)までの回復量の少ない方が実際の回復量として選ばれる
		this.mp = recoveryActual;
		System.out.println("MPが" + recoveryActual + "回復した");
		return recoveryActual;		// 実際に回復した量が返される
	}

}
