package jp.learningjavatext_sukkiri1.javastudy;

// 継承を用いたクラスの定義
// フィールドはオーバーライドしない！
public class Chapter10_SuperHero extends Chapter10_Hero {		// HeroクラスをベースにしてSuperHeroクラスを定義するので、
	boolean flying;																						// Heroと同じメンバの定義は省略する(違いだけを記述する)
	public void fly () {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land () {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	public void run () {	// 親クラスにも定義してあるが、子クラスで再定義する(オーバーライド=上書き)
		System.out.println(this.name + "は撤退した！");
	}

}
