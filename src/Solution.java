/**
 * Test01：在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * @author zlz
 * 思路一：利用二维数组由上到下，由左到右递增的规律，
        那么选取右上角或者左下角的元素a[row][col]与target进行比较，
        当target小于元素a[row][col]时，那么target必定在元素a所在行的左边,即col--；
        当target大于元素a[row][col]时，那么target必定在元素a所在列的下边,
        即row++；
 *思路二：把每一行看成有序递增的数组，利用二分查找，通过遍历每一行得到答案，
 */
public class Solution {
    public static  boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||(array.length==1&&array[0].length==0)){
            return false;
        }
        int rows = array.length; //数组的行数
        int cols = array[1].length; //数组的列数
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
    //思路二:二分查找
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