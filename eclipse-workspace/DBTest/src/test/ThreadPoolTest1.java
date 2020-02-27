package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest1 {
	public static void main(String[] args) {
		 
       /* List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            strList.add("String" + i);
        }*/
        int threadNum = 5;
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, threadNum, 300,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.CallerRunsPolicy());
                
        for (int i = 0; i < threadNum; i++) {
            executor.execute(new runThread(i));
        }
        executor.shutdown();
        
    }
}


class runThread implements Runnable {
	 
    private int num;

 
    public runThread(int num) {
        this.num = num;
    }
 
    public void run() {
                System.out.println("Ïß³Ì£º" + num + "£¬testing£º");
    }
}