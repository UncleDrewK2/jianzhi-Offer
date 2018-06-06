import java.util.Scanner;
/*
<<<<<<< HEAD
 * BFç®—æ³•ç®€å•ä½†æ•ˆçŽ‡è¾ƒä½Žï¼›Sä¸»ä¸²ï¼ŒTå­ä¸²ï¼›
 * KMPç®—æ³•æ˜¯å…¶æ”¹è¿›ï¼Œè¯•è¯•ï¼
 */
public class PatternMatching  {
	
	//BFç®—æ³•å®žçŽ°
=======
 * BFËã·¨¼òµ¥µ«Ð§ÂÊ½ÏµÍ£»SÖ÷´®£¬T×Ó´®£»
 * KMPËã·¨ÊÇÆä¸Ä½ø
 */
public class PatternMatching  {
	
	//BFËã·¨ÊµÏÖ
>>>>>>> first commit
	public static int bf(String S,String T){
		int i=0,j=0;
		while(i<S.length()&&j<T.length()){
			if(S.charAt(i)==T.charAt(j)){
				i++;
				j++;
			}else{
				i=i-j+1;
				j=0;
			}	
		}
		if(j==T.length()){
			return i-j;
		}else{
			return -1;
		}
	}
<<<<<<< HEAD
	//KMPç®—æ³•å®žçŽ°(å¾…å®Œå–„)
=======
	//KMPËã·¨ÊµÏÖ(´ýÍêÉÆ)
>>>>>>> first commit
	public static int kmp(String S,String T){
		int i=0,j=0;
		while(i<S.length()&&j<T.length()){
			if(S.charAt(i)==T.charAt(j)){
				i++;
				j++;
			}
			else{
				
			}
		}
		return 0;
		
	}
<<<<<<< HEAD
	//æµ‹è¯•
	public static void main(String[] args) {
		Scanner string=new Scanner(System.in);
	    System.out.println("è¯·è¾“å…¥ä¸»ä¸²ï¼š");
	    String s=string.nextLine();
	    System.out.println("è¯·è¾“å…¥å­ä¸²ï¼š");
	    String t=string.nextLine();
	    int n=bf(s,t);
	    System.out.println("å­ä¸²åœ¨ä¸»ä¸²ä¸­çš„ä½ç½®ï¼š"+n);
=======
	//²âÊÔ
	public static void main(String[] args) {
		Scanner string=new Scanner(System.in);
	    System.out.println("ÇëÊäÈëÖ÷´®£º");
	    String s=string.nextLine();
	    System.out.println("ÇëÊäÈë×Ó´®£º");
	    String t=string.nextLine();
	    int n=bf(s,t);
	    System.out.println("×Ó´®ÔÚÖ÷´®ÖÐµÄÎ»ÖÃ£º"+n);
>>>>>>> first commit
	}
}
