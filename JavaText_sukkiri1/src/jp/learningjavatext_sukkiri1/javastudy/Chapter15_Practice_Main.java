package jp.learningjavatext_sukkiri1.javastudy;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class Chapter15_Practice_Main {
	public static void main(String[] args) {
		
		
//	15.1
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i + 1 + ",");		// 自分の解答
//			sb.append(i + 1).append(",");		// 解答：自分の回答も間違いではないが、型が異なるためappendで追加していく方がスマート
		}
		System.out.println(sb);
		System.out.println();
		
		String s = sb.toString();				// 解答：StringBuilder型の変数sbをString型に変換する
		String[] a = s.split("[,]");		// 			toStringで文字列として取り出せる
		
		
// 15.4
		Date now = new Date();	// 現在の日時をDate型で取得
		Calendar c = Calendar.getInstance();	// CalendarのInstanceを生成
		c.setTime(now);		// 取得した日時情報をCalendarにセット
		int d = c.get(Calendar.DAY_OF_MONTH);		// Calendarから「日」の情報を取得
		
//		c.set(Calendar.DAY_OF_MONTH, d+100);		// 自分の回答(型内で足し算はあまりよくない、、、？、結果は一応でた)
		d += 100;																	// 解答：取得した値に100を足してCalendarの「日」にセット
		c.set(Calendar.DAY_OF_MONTH, d);					// 解答
		
		Date date = c.getTime();		// Calendarの日付情報をDate型に変換
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");		// 指定された形式で表示
		String st = f.format(date);
		System.out.println(st);
		System.out.println();
		
		
//	15.5
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		LocalDate ld = LocalDate.now();
//		LocalDate ldate = LocalDate.parse(ld, fmt);		// 解答：不要、現在の日時をフォーマットに代入する必要はない
		LocalDate ldate = ld.plusDays(100);
		String str = ldate.format(fmt);
		System.out.println(str);
		System.out.println();
		
	}
	
	
//　15.2
//　解答(答え分からず、、、)
		public String concatPath(String folder, String file) {
			if (!folder.endsWith("¥")) {
				folder += "¥";
			}
			return folder + file;
	
		}

	
// 15.3
// 	(1) .*
// 	(2)	A¥d		// 解答：A¥d{1,2}
// 	(3) U[A-Z]{2,4}		// 解答：U[A-z]{3}

}
