/**
 * ��ת�������Сֵ������һ���ǵݼ�����������һ����ת��������������СԪ�ء����磺{3,4,5,1,2}
 * Ϊ{1,2,3,4,5,}��һ����ת�����������СֵΪ1��
 * @author zlz
 *
 */
public class Test04 {
	public static void main(String[] args) {
		int [] array={3,4,5,2,1};
		System.out.println(minNumberInRotateArray1(array));
		//System.out.println(minNumberInRotateArray2(array));
	}
	//����һ
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
