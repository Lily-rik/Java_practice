package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter13_Wizard {
	private int hp;
	private int mp;
	private String name;
	private Chapter13_Practice_Wand wand;
	
	public void heal (Chapter13_Hero h) {
		int basePoint = 10;		// 基本回復ポイント
		int recovPoint = (int)(basePoint * this.getWand().getPower());	// 杖による増幅
		h.setHp(h.getHp() + recovPoint);	// 勇者のHPを回復する
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if (hp < 0) {
		this.hp = 0;	// this抜け。注意！
		}
		this.hp = hp;
	}
	
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("mpは0以上の値を入力してください。処理を中断します。");
		}
		this.mp = mp;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前が空白です。処理を中断します。");
		}
		if (name.length() <= 2) {
			throw new IllegalArgumentException("名前が短すぎます。処理を中断します。");
		}
		this.name = name;
	}
	
	public Chapter13_Practice_Wand getWand() {
		return this.wand;
	}
	public void setWand(Chapter13_Practice_Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖は必ず装備してください、処理を中断します。");
		}
		this.wand = wand;
	}
	
	
	
	

}
