package jp.learningjavatext_sukkiri1.javastudy;

import java.util.*;

public class Chapter16_Main {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);		// 自動的にIntegerに格納される
		points.add(80);
		points.add(75);
		for (int i : points) {		// 拡張for文
			System.out.print(i);
			System.out.print(',');
		}
		System.out.println();
		System.out.println();
		
		// 型を明示的に変換したい場合(newは非推奨)
		Integer i1 = Integer.valueOf(16);
		int i2 =	i1.intValue();
		System.out.println(i2);
		System.out.println();
		
		
		// イテレータ
		ArrayList<String> names = new ArrayList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {		// 矢印を次に進められるなら繰り返す
			String e = it.next();		// 矢印を次に進め、内容を取り出す
			System.out.println(e);
		}
		System.out.println();
		
		// Setの使用
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("黄");
		colors.add("青");
		colors.add("赤");		// 重複して「赤」を格納しようとしても無視される
		System.out.println("色は" + colors.size() + "種類");		// そのため結果は3種類となる
		System.out.println();
		
		for (String s : colors) {		// Setには順序がないため、格納した順で表示されるとは限らない
			System.out.print(s + "→");
		}
		System.out.println();
		System.out.println();
		
		// TreeSetからの取り出し
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s :words) {
			System.out.print(s + "→");		// 自然順序付けで整列される
		}
		System.out.println();
		System.out.println();
		
		
		// Mapの使用
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);			// ペアで値を格納
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");		// キー値に対する値を取得
		System.out.println("東京都の人口は、" + tokyo);
		prefs.remove("京都府");			// 京都府の削除
		prefs.put("熊本県", 182);			// 値を182で上書き
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);		// 結果は181ではなく182
		System.out.println();
		
//		prefs.put("京都府", 255);
//		for (String key : prefs.KeySet()) {		// 解決できず、、、？？？
//			int value = prefs.get(key);
//			System.out.println(key + "の人口は、" + value);
//		}
		
		
		// 要素の参照に関する注意点
		// 格納前や取得後の変数のインスタンスを書き換えると、
		// コレクションに格納中の要素も下記かわるおそれがあるため注意！(参照型のため)
		Chapter14_Hero h = new Chapter14_Hero();
		h.name = "ミナト";
		List<Chapter14_Hero> list = new ArrayList<Chapter14_Hero>();
		list.add(h);
		h.name = "スガワラ";
		System.out.println(list.get(0).name);		// 出力は"スガワラ"になる
		

		
		
		
	}

}






