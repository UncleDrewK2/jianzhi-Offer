/**
 * Test01����һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
 * �ж��������Ƿ��и�������
 * @author zlz
 * ˼·һ�����ö�ά�������ϵ��£������ҵ����Ĺ��ɣ�
        ��ôѡȡ���Ͻǻ������½ǵ�Ԫ��a[row][col]��target���бȽϣ�
        ��targetС��Ԫ��a[row][col]ʱ����ôtarget�ض���Ԫ��a�����е����,��col--��
        ��target����Ԫ��a[row][col]ʱ����ôtarget�ض���Ԫ��a�����е��±�,
        ��row++��
 *˼·������ÿһ�п���������������飬���ö��ֲ��ң�ͨ������ÿһ�еõ��𰸣�
 */
public class Solution {
    public static  boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||(array.length==1&&array[0].length==0)){
            return false;
        }
        int rows = array.length; //���������
        int cols = array[1].length; //���������
        int row = 0;
        int col = cols-1;
        while (row >=0 && row < rows && col >=0 && col <cols ){
            if(array[row][col] == target){
                return true;
            }else if(array[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    //˼·��:���ֲ���
    public static boolean find(int number,int [][] array){
    	
		return false;
    	
    }    
    public static void main(String args[]){
        int [][] array = {
            {1,2,3,5,7},
            {3,5,8,9,12},
            {5,7,9,10,14},
            {9,12,14,15,18}
        } ;
       System.out.println(Find(7,array));  
       System.out.println(Find(90,array));
       
    }
}