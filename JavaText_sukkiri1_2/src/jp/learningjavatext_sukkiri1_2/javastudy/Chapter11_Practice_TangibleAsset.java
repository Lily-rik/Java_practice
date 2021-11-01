package jp.learningjavatext_sukkiri1_2.javastudy;

public abstract class Chapter11_Practice_TangibleAsset extends Chapter11_Practice_Assett implements Chapter11_Practice_Thing {
	
	String color;
	double weight;
	
	// コンストラクタ
	public Chapter11_Practice_TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	
	// メソッド
	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

}


// 11-2
// 	(ア) Asset
//	(イ) IntangibleAsset
// 	(ウ) Patent



