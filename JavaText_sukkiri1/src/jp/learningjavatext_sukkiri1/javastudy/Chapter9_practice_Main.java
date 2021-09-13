package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter9_practice_Main {

	public static void main(String[] args) {
		Chapter9_Thief t1 = new Chapter9_Thief("ミライ", 50, 10);
		System.out.println("名前：" + t1.name);
		System.out.println("HP：" + t1.hp);
		System.out.println("MP：" + t1.mp);
		System.out.println();
		
		Chapter9_Thief t2 = new Chapter9_Thief("カオル", 35);
		System.out.println("名前：" + t2.name);
		System.out.println("HP：" + t2.hp);
		System.out.println("MP：" + t2.mp);
		System.out.println();
		
		Chapter9_Thief t3 = new Chapter9_Thief("アズサ");
		System.out.println("名前：" + t3.name);
		System.out.println("HP：" + t3.hp);
		System.out.println("MP：" + t3.mp);
		System.out.println();

	}
	
	
//	9.2
//	実行結果は
//	25:25
//	25:35
//	理由：hpとbaseHpはメモリが異なるため、hpに+10されてもbaseHpの値は変わらない
//			 対してthief.hpはクラス型で参照型のため、
//			 インスタンス生成時にbaseHpで代入した値のメモリとthief.hpの値のメモリは同じになり値が上書きされるため

}
