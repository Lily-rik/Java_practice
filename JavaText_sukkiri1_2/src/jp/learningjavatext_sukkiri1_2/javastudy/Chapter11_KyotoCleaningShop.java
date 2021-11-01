package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter11_KyotoCleaningShop implements Chapter11_CleaningService {		// インターフェースを継承する際はimplementsを付ける
	
	String ownerName;
	String address;
	String phone;
	
	
	/* シャツを洗う */
	public Shirt washShirt(Shirt s) {
		// 大型洗濯機15分
		return s;
	}
	
	/* タオルを洗う */
	public Towl washTowl(Towl t) {
		// 大型洗濯機10分
		return t;
		
	}
	/* コートを洗う */
	public Coat washCoat(Coat c) {
		// ドライ20分
		return c;
	}


	
	
	

}
