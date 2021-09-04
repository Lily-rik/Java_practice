package jp.learningjavatext.javastudy;

class Chapter6_1_6 {

	public static void main(String[] args) {
		// else if
		
		double height, weight, fat;
		
		height = 1.75;
		weight = 22 * height * height;
		fat = (70 - weight) / weight * 100;
		
		System.out.println("あなたの肥満率は" + (int)fat + "%です。");

		if (fat >= 20) {
			System.out.println("あなたは太りすぎです。");
		} else if (fat <= -10) {
			System.out.println("あなたは痩せすぎです。");
		} else {
			System.out.println("あなたは普通です。");
		}

	}

}
