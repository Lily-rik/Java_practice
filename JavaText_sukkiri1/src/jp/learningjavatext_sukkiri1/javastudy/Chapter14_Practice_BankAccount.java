package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter14_Practice_BankAccount {
	String accountNumber;
	int balance;
	
	
	public String toString() {
		return "¥" + this.balance + "(口座番号：" + this.accountNumber + ")";
	}
	
//	自分の回答
//	public boolean equals(Object o) {
//		if (this == o) {
//			return true;
//		}
//		if (o instanceof Chapter14_Practice_BankAccount) {
//			Chapter14_Practice_BankAccount a = (Chapter14_Practice_BankAccount)o;
//			if (this.accountNumber.trim().equals(a.accountNumber)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
//	解答
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Chapter14_Practice_BankAccount) {
			Chapter14_Practice_BankAccount a = (Chapter14_Practice_BankAccount)o;
			String an1 = this .accountNumber.trim();	// trim()の使い方はあってる！
			String an2 = a.accountNumber.trim();			// this.accountNumberと、a(口座番号4649)が等しいかを調べるため左記のコードになる
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}


}
