import javax.swing.JInternalFrame;
/*
 * 
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.
 * �򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */

public class Test02 {
	public static int replaceBlank(char[] string,int usedlength){
		//�ж��Ƿ�Ϊ�Ϸ����ַ���
		if(string==null||string.length<usedlength){
			return -1;
		}
		//ͳ�ƿո�
		int writeCount=0;
		for(int i=0;i<string.length;i++){
			if(string[i]==' '){
				writeCount++;
			}
		}
		//����ת������ַ�������
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
