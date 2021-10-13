package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter04_Practice {

	public static void main(String[] args) {
//	4-1
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] ansewers = new boolean[3];
		String[] names = new String[3];
		
		
//	4-2
		int[] moneyList = {121902, 8302, 55100};
		
		// for文
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		System.out.println();
		// 拡張for文
		for (int moneyLists : moneyList) {
			System.out.println(moneyLists);
		}
		System.out.println();
		
		
//	4-3
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
//		
//		System.out.println(counts[1]);		// NullPointerException
//		System.out.println(height[2]);		// ArrayIndexOutOfBoundsException
		
		
//	4-4
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int number : numbers) {
			if (input == number) {
				System.out.println("アタリ！");
			}
		}

	}

}
