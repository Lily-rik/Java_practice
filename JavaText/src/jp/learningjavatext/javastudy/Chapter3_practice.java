package jp.learningjavatext.javastudy;

class Chapter3_practice {
	// 1. ④
	
	// 2. ③
	
	//3. class Renshu33 {
	//		 public static void main(String[] args) {
	//			 System.out.println("Renshu!!!");
	//		 }  // }が１つ足りないのが誤り
	//	 }
	 

	/*4. class Renshu34 {
	 * 		 public static void main(String[] args) {
	 * 			 System.out.println("Hello Java World!!");
	 * 			 System.out.print();  // printは()を引数にはできないためエラーが出る
	 * 	 	 }
	 * 	 }
	 */
	
	/*4. 正答
	 *	 class Renshu34 {
	 * 		 public static void main(String[] args) {
	 * 			 System.out.print("Hello Java World!!");
	 * 			 System.out.println();  //printlnは()を引数に使用できる 
	 *		 }
	 *	 }
	 */	
	
	/*5. class Renshu35 {
	 * 		 public static void main(String[] args) {
	 * 			 System.out.println('*');
	 * 			 System.out.println("***"); 
	 * 			 System.out.println("*****");
	 *			 System.out.println("*******");
	 *			 System.out.println("*********");
	 * 			 System.out.println('*');
	 *  		 System.out.println('*');   
	 *  		 System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");  
	 *	 	 }
	 * 	 }
	 */
	
	/*5. 正答
	 * 		 class Renshu35 {
	 *			 public static void main(String[] args) {
	 *				 System.out.println("       *");  // 空白も１文字として数えるため文字列扱いとなる。よって'ではなく"を使用する
	 *				 System.out.println("      ***"); 
	 *				 System.out.println("     *****");
	 *				 System.out.println("    *******");
	 *				 System.out.println("   *********");
	 *				 System.out.println("       *");
	 *				 System.out.println("       *");   
	 *				 System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");  
	 *			 }
	 *		 }
	 */	
	
	/*6. class Renshu36 {
	 * 		 public static void main(String[] args) {
	 * 			 System.out.print("Good morning.\n");
	 * 			 System.out.print("Good afternoon.\n");
	 * 			 System.out.print("Good evening.");
	 * 		 } 
	 * 	 }
	 */
}