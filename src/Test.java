import java.util.Scanner;
/**
 * ��·��ţţ��ţţȥ�Ġ���ʦ�Ҳ��Σ����ŵ�ʱ�����򱱷���������������·�ˡ���Ȼ��������һ�ŵ�ͼ��
 * ��������Ҫ֪���Լ������ĸ��������������� 
 * ����ʵ����3 LRR
 * �����E
 * @author zlz 2018-5-30
 */
public class Test {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int M=sc.nextInt();//������������������M
	String str=sc.next();
	
	int direction=FinalDirection(M,str);
	switch(direction){
	case 0:
		System.out.println('N');
		break;
	case 1:
	case -3:
		System.out.println('E');
		break;
	case 2:
	case -2:
		System.out.println('S');
		break;
	case 3:
	case -1:
		System.out.println('W');
		break;
		}
	}
	
	private static int FinalDirection(int M, String str) {
		int turnLeft=0,turnRight=0;
		for(int i=0;i<M;i++){
			if(str.charAt(i)=='L'){
				turnLeft++;
			}else{
				turnRight++;
			}
		}
		return (turnRight-turnLeft)%4;
	}
}