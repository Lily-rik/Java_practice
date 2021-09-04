package jp.learningjavatext.javastudy;

class Chapter6_practice {

	public static void main(String[] args) {
//		1. ④  &&を挟んだ右辺、左辺で見る
		
//		2.
//		double height, weight, fat;
//		
//		height = 1.75;
//		weight = 22 * height * height;
//		fat = (70 - weight) / weight * 100;
//		
//		System.out.println("あなたの肥満率は" + (int)fat + "%です。");
//		
//		if (fat >= 20) {
//			System.out.println("あなたは太りすぎです。");
//		} else {
//			if (fat < -10) {
//				System.out.println("あなたは痩せすぎです。");
//			} else {
//				if ((fat >= -10) && (fat < 10)) {
//					System.out.println("あなたは普通です。");
//				} else {
//					if ((fat >= 10) && (fat < 20)) {
//						System.out.println("あなたは太り気味です。");
//					}
//				}
//			}
//		}

//		3.
//		int month, day;
//		
//		month = 11;
//		
//		switch(month) {
//			case 2: day = 28;
//				break;  // breakがないと、monthがどんな値であってもdefaultまで処理されるため、必ずdayの値は31になってしまうため抜けないように注意！
//			case 4, 6, 9, 11: day = 30;
//				break;
//			default: day = 31;
//		}
//		
//		System.out.println(month + "月は" + day + "日あります。");
		
//		4.		
//		int month, day;
//		
//		month = 11;
//		
//		switch(month) {
//			case 2 -> day = 28;  // アロー構文にはbreakはいらない！
//			case 4, 6, 9, 11 -> day = 30;
//			default -> day = 31;
//		}
//		
//		System.out.println(month + "月は" + day + "日あります。");
		
//		5.		
//		int month = 12;
//		
//		int day = switch(month) {
//			case 2: yield 28;
//			case 4, 6, 9, 11: yield 30;
//			default: yield 31;
//		}; // 式の場合は最後に;をつけることを忘れないように注意！
//		
//		System.out.println(month + "月は" + day + "日あります。");
		
		// アロー構文を使用
//		int month2 = 2;
//		
//		int day2 = switch(month2) {
//			case 2 -> 28;
//			case 4, 6, 9, 11 -> 30;
//			default -> 31;
//		};
//		
//		System.out.println(month2 + "月は" + day2 + "日あります。");
		
	}

}