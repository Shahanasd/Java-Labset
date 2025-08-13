
import java.io.IOException;

class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+"*"+5+"="+(i*5));
        }
        System.out.println("End of 1st thread");
    }
}
class B extends Thread{
    public void run(){
        for(int j=1;j<=7;j++){
            System.out.println(j+"*"+7+"="+(j*7));
        }
        System.out.println("End of 2nd thread");
    }
}
class C extends Thread{
    public void run(){
        for (int k = 1; k <=3; k++) {
            System.out.println(k+"*"+3+"="+(k*3));    
        }
        System.out.println("End of 3rd thread");
    }
}
public class MultithreadingEg{
    public static void main(String[] args)throws IOException,InterruptedException {
        A ThreadA=new A();
        B ThreadB=new B();
        C ThreadC=new C();
        ThreadA.start();
        ThreadA.join();
        ThreadB.start();
        ThreadB.join();
        ThreadC.start();
        ThreadC.join();
    }
}