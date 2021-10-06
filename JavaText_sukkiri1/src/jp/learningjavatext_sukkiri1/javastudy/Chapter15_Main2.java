package jp.learningjavatext_sukkiri1.javastudy;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class Chapter15_Main2 {

	public static void main(String[] args) throws Exception {
		// 日付と時刻を扱う
		
		// 形式1:long型の数値
		// 処理時間を計測する
		long start = System.currentTimeMillis();
		// ここで何らかの時間がかかる処理
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は..." + (end - start) + "ミリ秒でした");
		System.out.println();
		
		// 形式2:Date型のインスタンス
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
		System.out.println();
		
		
		// Calenderクラスの利用
		// 6つのint値とDate型の相互交換
		Calendar c = Calendar.getInstance();
		
		// 6つのint値からDateインスタンスを生成
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);		// 月の取得・設定には0~11を用いる
		Date d = c.getTime();
		System.out.println(d);
		
		// Dateインスタンスからint値を生成
		Date  now2 = new Date();
		c.setTime(now2);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
		System.out.println();
		
		// String型とDate型の相互交換
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		// 文字列からDateインスタンスを生成
		Date d2 = f.parse("2020/09/22 01:23:45");
		System.out.println(d2);
		
		// Dateインスタンスから文字列を生成
		Date now3 = new Date();
		String s = f.format(now3);
		System.out.println("現在は" + s + "です");
		System.out.println();
		
		
		// Time APIの使用
		// TimeAPIクラスの多くでは静的メソッドが使用されており、newが禁止されている
		// そのためnow()やof()を使用する
		
		// InstantおよびZoneDateTimeの利用例
		// Instantの生成
		Instant i1 = Instant.now();		// 現在日時を取得
		
		// Instantとlong値の相互交換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		// ZobeDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now();		// 現在日時を取得
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		// InstantとZonedDateTimeの相互交換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		// ZonedDateTimeの利用方法
		System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {		// 同じ瞬間の判定にはequals()ではなくisEqual()を使用する
			System.out.println("これらは同じ瞬間を指しています");
		}
		System.out.println();
		
		
		// LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();		// 現在日時を取得
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		
		// LocalDateTimeとZonedDateTimeの相互交換
		ZonedDateTime z4 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z4.toLocalDateTime();
		System.out.println(l1);		// 現在日時
		System.out.println(l2);		// 曖昧な日時
		System.out.println(z4);		// タイムゾーンの情報を追加
		System.out.println(l3);		// タイムゾーンの情報を除去(曖昧な日時)
		System.out.println();
		
		// 各種日時クラスのメソッド利用例
		
		// 文字列からLocalDateを作成
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
		
		// 1000日後を計算する
		LocalDate ldatep = ldate.plusDays(100);
		String str = ldatep.format(fmt);
		System.out.println("100日後は" + str);
		
		// 現在日付との比較
		LocalDate now4 = LocalDate.now();
		if (now4.isAfter(ldatep)) {
			System.out.println("100日後は過去の日付です");
		}
		System.out.println();
		
		
		// Periodクラスの利用例
		LocalDate d3 = LocalDate.of(2020, 1, 1);
		LocalDate d4 = LocalDate.of(2020, 1, 4);
		
		// 3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d3, d4);
		System.out.println(p1);
		System.out.println(p2);
		
		// d4のさらに3日後を計算する
		LocalDate d5 = d4.plus(p2);
		System.out.println(d5);
		System.out.println();

	}

}
