package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter11_Practice_Computer extends Chapter11_Practice_TangibleAsset {
	
	String makerName;
	
	// コンストラクタ
	public Chapter11_Practice_Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	
	// メソッド
	public String getMakerName() {
		return this.makerName;
	}

}
