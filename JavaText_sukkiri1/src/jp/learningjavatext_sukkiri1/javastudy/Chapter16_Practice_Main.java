package jp.learningjavatext_sukkiri1.javastudy;

import java.util.*;

public class Chapter16_Practice_Main {
	
	
//	16.1
//		(1)Set
//		(2)List
//		(3)Map
	
	public static void main(String[] args) {
		
//	16.2
	 Chapter16_Practice_Hero h1 = new  Chapter16_Practice_Hero("斉藤");
	 Chapter16_Practice_Hero h2 = new  Chapter16_Practice_Hero("鈴木");
	 
//	 自分の回答
//	 List<String> heros = new ArrayList<String>();
//	 解答
	 List<Chapter16_Practice_Hero> heroes = new ArrayList<Chapter16_Practice_Hero>();
	 // ArrayListに格納する型はString型ではなくHero型である
	 
	 
	 heroes.add(h1);
	 heroes.add(h2);
	 
//	 for (String h : heroes) {		// 自分の回答
	 for (Chapter16_Practice_Hero h : heroes) {		// 解答：上記と同じく型はHero型
//		 System.out.println(h);		// 自分の回答
		 System.out.println(h.getName());		// privateがついているため、値の取得はgetName()メソッドを使用して呼び出す
	 }
	 System.out.println();
	 
	 
//	 16.3
//	 自分の回答
	 h1.setKill(3);
	 h2.setKill(7);
	 
	 Map<String, Integer> heroesInf = new HashMap<String, Integer>();
	 heroesInf.put(h1.getName(), h1.getKill());
	 heroesInf.put(h2.getName(), h2.getKill());
	 
	 for (String key : heroesInf.keySet()) {
		 int value = heroesInf.get(key);
		 System.out.println(key + "が倒した敵＝" + value);	
	 }
	 System.out.println();
	 
	 
//	 上記のコードでも正しく出力されているため合っている、、、？
//	 以下解答
	 Map<Chapter16_Practice_Hero, Integer> heroesInfo = new HashMap<Chapter16_Practice_Hero, Integer>();
	 // Hero型のインスタンスに倒した敵の数の情報をコレクション内で追加している
	 heroesInfo.put(h1, 3);		// int型で倒した敵の数を追加しコレクション化
	 heroesInfo.put(h2, 7);
	 
	 for (Chapter16_Practice_Hero key : heroesInfo.keySet()) {
		 int value = heroesInfo.get(key);
		 System.out.println(key.getName() + "が倒した敵＝" + value);	
		 // keyはインスタンスから値の取得にあるのでgetName()を使用、
		 // valueはMap内の数字なので変数のみ
	 }
	 System.out.println();
		
	}

}
