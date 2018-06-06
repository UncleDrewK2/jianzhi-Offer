//1.1定Runnable接口的实现类
class SecondThread implements Runnable{

    //1.2重写其中的run方法
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"===="+i);
        }
    }    
}
public class Demo2 {
    
    public static void main(String[] args) {
        //2.创建Runnable的接口实现类的实例
        SecondThread s1=new SecondThread();
        SecondThread s2=new SecondThread();
        //2.用Runnable的接口实现类的实例作为Thread的target，创建Thread对象
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2,"Higgin");  //创建Thread对象的同时可以为之命名
        
        //启动线程
        t1.start();
        t2.start();
        
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"===="+i);
        }
    }
}