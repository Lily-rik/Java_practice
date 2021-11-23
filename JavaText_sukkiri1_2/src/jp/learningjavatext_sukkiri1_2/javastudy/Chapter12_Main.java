package jp.learningjavatext_sukkiri1_2.javastudy;

public class Chapter12_Main {
	
	public static void main(String[] args) {
		
		Chapter12_Wizard w = new Chapter12_Wizard();
		Chapter12_Character c = w;
		Chapter12_Wizard wi = (Chapter12_Wizard)c;
		Chapter08_Matango m = new Chapter08_Matango();
		
		wi.name = "アサカ";
		wi.attack(m);
		wi.fireball(m);
		System.out.println();
		
		
		Chapter12_Character[] cha = new Chapter12_Character[5];
		cha[0] = new Chapter12_Hero();
		cha[1] = new Chapter12_Hero();
		cha[2] = new Chapter12_Thief();
		cha[3] = new Chapter12_Wizard();
		cha[4] = new Chapter12_Wizard();
		
		// それぞれに対してアクションを起こす
		for(Chapter12_Character ch : cha) {
			ch.hp += 50;
			ch.attack(m);
			ch.run();
		}		
		
		
		
		
		
	}
}
