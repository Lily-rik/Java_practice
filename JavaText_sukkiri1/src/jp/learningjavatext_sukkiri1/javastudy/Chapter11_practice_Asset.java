package jp.learningjavatext_sukkiri1.javastudy;

public abstract class Chapter11_practice_Asset {
	
	// 解答での追加
	// 資産は有形でも無形でも名前と値段を持つ
	// よってnameとpriceはAssetに記載する
	
	String name;
	int price;
	
	public Chapter11_practice_Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}

}
