import java.util.Scanner;
/*
<<<<<<< HEAD
 * BF算法简单但效率较低；S主串，T子串；
 * KMP算法是其改进，试试！
 */
public class PatternMatching  {
	
	//BF算法实现
=======
 * BF�㷨�򵥵�Ч�ʽϵͣ�S������T�Ӵ���
 * KMP�㷨����Ľ�
 */
public class PatternMatching  {
	
	//BF�㷨ʵ��
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
	//KMP算法实现(待完善)
=======
	//KMP�㷨ʵ��(������)
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
	//测试
	public static void main(String[] args) {
		Scanner string=new Scanner(System.in);
	    System.out.println("请输入主串：");
	    String s=string.nextLine();
	    System.out.println("请输入子串：");
	    String t=string.nextLine();
	    int n=bf(s,t);
	    System.out.println("子串在主串中的位置："+n);
=======
	//����
	public static void main(String[] args) {
		Scanner string=new Scanner(System.in);
	    System.out.println("������������");
	    String s=string.nextLine();
	    System.out.println("�������Ӵ���");
	    String t=string.nextLine();
	    int n=bf(s,t);
	    System.out.println("�Ӵ��������е�λ�ã�"+n);
>>>>>>> first commit
	}
}
