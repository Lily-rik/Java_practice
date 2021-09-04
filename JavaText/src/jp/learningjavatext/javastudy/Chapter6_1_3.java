package jp.learningjavatext.javastudy;

class Chapter6_1_3 {

	public static void main(String[] args) {
		// 複数のif文
		
		double height, weight, fat;
		
		height = 1.75;
		weight = 22 * height * height;
		fat = (50 - weight) / weight * 100;
		
		System.out.println("あなたの肥満率は" + (int)fat + "%です。");
		
		if (fat >= 20) {
			System.out.println("あなたは太りすぎです。");
		}
		if (fat <= -10) {
			System.out.println("あなたは痩せすぎです。");
		}
	}
}
