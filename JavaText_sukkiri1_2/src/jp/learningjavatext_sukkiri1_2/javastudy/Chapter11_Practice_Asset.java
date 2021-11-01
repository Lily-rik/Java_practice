package jp.learningjavatext_sukkiri1_2.javastudy;


// 自分の回答
// public interface Chapter11_Practice_Asset {
//
//String getName();
//int getPrice();
//String getColor();
//
//}


// 解答：Assetは抽象クラスと問題文にあるためabstractを使用する
public abstract class Chapter11_Practice_Asset {
	
	// 有形、無形資産に共通するものをここに記述する
	String name;
	int price;

	public Chapter11_Practice_Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	
	
}
	
	
	
	
