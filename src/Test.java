import java.util.Scanner;
/**
 * 迷路的牛牛：牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。虽然他手里有一张地图，
 * 但是他需要知道自己面向哪个方向，请你帮帮他。 
 * 输入实例：3 LRR
 * 输出：E
 * @author zlz 2018-5-30
 */
public class Test {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int M=sc.nextInt();//键盘输入整数并赋给M
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