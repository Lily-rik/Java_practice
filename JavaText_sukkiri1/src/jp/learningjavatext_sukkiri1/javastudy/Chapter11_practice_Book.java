package jp.learningjavatext_sukkiri1.javastudy;


//　自分の回答
//public class Chapter11_practice_Book extends Chpater11_practice_TangibleAsset {
//
//	public String GetIsbn() {
//		return this.isbn;
//	}
//}

// 解答
// 継承先のクラスではもっと詳細な部分(個別性のある部分)を記載する
public class Chapter11_practice_Book extends Chpater11_practice_TangibleAsset {
	String isbn;
	
	// コンストラクタ
	public Chapter11_practice_Book (String name, int price, String color, String isbn) {
		super(name, price, color);	// 親クラスの呼び出しにはsuperを用いる
		this.isbn = isbn;
	}

	// メソッド
	public String GetIsbn() {
		return this.isbn;
	}
	
}
