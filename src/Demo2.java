//1.1��Runnable�ӿڵ�ʵ����
class SecondThread implements Runnable{

    //1.2��д���е�run����
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"===="+i);
        }
    }    
}
public class Demo2 {
    
    public static void main(String[] args) {
        //2.����Runnable�Ľӿ�ʵ�����ʵ��
        SecondThread s1=new SecondThread();
        SecondThread s2=new SecondThread();
        //2.��Runnable�Ľӿ�ʵ�����ʵ����ΪThread��target������Thread����
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2,"Higgin");  //����Thread�����ͬʱ����Ϊ֮����
        
        //�����߳�
        t1.start();
        t2.start();
        
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"===="+i);
        }
    }
}