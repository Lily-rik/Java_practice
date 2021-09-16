package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter10_Item {
	String name;
	int price;
	
	public Chapter10_Item (String name) {
		this.name = name;
		this.price = 0;
	}
	
	public Chapter10_Item (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 投げてダメージを与える
	public int getDamage() {
		return 10;
	}

}
