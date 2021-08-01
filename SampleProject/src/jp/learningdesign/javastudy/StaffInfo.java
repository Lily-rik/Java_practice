package jp.learningdesign.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}
}

public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff("Taro Yamada", 12345, "yamada@abc.co.jp");
		// yamada.name = "Taro Yamada";
		
		yamada.sayhello();
		
		// System.out.println(yamada.name);
	}

}
