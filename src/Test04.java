/**
 * 旋转数组的最小值，输入一个非递减排序的数组的一个旋转，输出该数组的最小元素。例如：{3,4,5,1,2}
 * 为{1,2,3,4,5,}的一个旋转，该数组的最小值为1。
 * @author zlz
 *
 */
public class Test04 {
	public static void main(String[] args) {
		int [] array={3,4,5,2,1};
		System.out.println(minNumberInRotateArray1(array));
		//System.out.println(minNumberInRotateArray2(array));
	}
	//方法一
	public static int minNumberInRotateArray1(int [] array){
		if(array.length==0)
			return 0;
		for(int i=0;i<array.length-1;i++){
			if(array[i]>array[i+1]){
				return array[i+1];
			}
		}
		return array[0];
		
	}
	
}
