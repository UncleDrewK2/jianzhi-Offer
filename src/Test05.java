import java.util.Scanner;

/**
 * ��Ŀ��һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 * @author zlz
 * ʵ���Ͽ���쳲���������
 * ���Σ�һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 */
public class Test05 {
	//private static final char[] JumpFloor = null;
	public static int JumpFloor(int target){
		if(target<=2){
			return target;
		}
		return JumpFloor(target-1)+JumpFloor(target-2);
	}
	public static int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }else
            return (int)Math.pow(2,target-1);
        }
	public static void main(String[] args) {
		System.out.println(JumpFloor(5));//��Ŀ1
		System.out.println(JumpFloorII(3));//��Ŀ2
	}
}