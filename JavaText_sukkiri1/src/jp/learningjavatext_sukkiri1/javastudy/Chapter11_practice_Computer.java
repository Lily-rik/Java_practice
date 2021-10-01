package jp.learningjavatext_sukkiri1.javastudy;

// 自分の回答
//public class Chapter11_practice_Computer extends Chpater11_practice_TangibleAsset {
//
//	public String GetMakerNmae() {
//		return this.makerName;
//	}
//	
//	
//}


// 解答
public class Chapter11_practice_Computer extends Chpater11_practice_TangibleAsset {
	String makerName;
	
	// コンストラクタ
	public Chapter11_practice_Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	
	public String GetMakerNmae() {
		return this.makerName;
	}
	
}
