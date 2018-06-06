import javax.swing.JInternalFrame;
/*
 * 
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */

public class Test02 {
	public static int replaceBlank(char[] string,int usedlength){
		//判断是否为合法的字符串
		if(string==null||string.length<usedlength){
			return -1;
		}
		//统计空格
		int writeCount=0;
		for(int i=0;i<string.length;i++){
			if(string[i]==' '){
				writeCount++;
			}
		}
		//计算转换后的字符串长度
		int targetLength=writeCount*2+usedlength;
		int temp=targetLength;
		if(targetLength>string.length){
			return -1;
		}
		
		if(writeCount==0){
			return usedlength;
		}
		usedlength--;
		targetLength--;
		
		while(usedlength>=0&&usedlength<targetLength){
			if(string[usedlength] ==' '){
				string[targetLength--]='0';
				string[targetLength--]='2';
				string[targetLength--]='%';
			}else{
				string[targetLength--] = string[usedlength];
			}
			usedlength--;
		}
		return temp;
		
	}
	public static void main(String[] args) {
		char[] string=new char[50];

        string[0] = 'w';
        string[1] = 'e';
        string[2] = ' ';
        string[3] = 'a';
        string[4] = 'r';
        string[5] = 'e';
        string[6] = ' ';
        string[7] = 'h';
        string[8] = 'a';
        string[9] = 'p';
        string[10] = 'p';
        string[11]='y';

        int length = replaceBlank(string, 12);
        System.out.println(new String(string, 0, length));
	}
}
