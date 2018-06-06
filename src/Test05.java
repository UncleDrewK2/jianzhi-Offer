import java.util.Scanner;

/**
 * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author zlz
 * 实际上考察斐波那契数列
 * 变形：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
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
		System.out.println(JumpFloor(5));//题目1
		System.out.println(JumpFloorII(3));//题目2
	}
}