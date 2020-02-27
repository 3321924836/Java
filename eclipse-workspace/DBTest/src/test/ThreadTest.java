package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import redis.clients.jedis.Jedis;
 
public class ThreadTest {
 
    public static void main(String[] args) {
    	/*Jedis jedis = new Jedis("10.7.16.93",6379);
        jedis.auth("123123");
        System.out.println("Server is running: "+jedis.ping());
        String ssRescive;
        while(true) {
        	ssRescive = (jedis.brpop(0, "site-list1","site-list2")).toString();
    	}*/
 
        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            strList.add("String" + i);
        }
        int threadNum = strList.size() < 5 ? strList.size() : 5;
        
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, threadNum, 300,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.CallerRunsPolicy());
                
        for (int i = 0; i < threadNum; i++) {
            executor.execute(new AnalyzeStringThread(i,strList,threadNum));
        }
        executor.shutdown();
        
    }
}
 
class AnalyzeStringThread implements Runnable {
 
    private int num;
 
    private List<String> strList;
 
    private int threadNum;
 
    public AnalyzeStringThread(int num, List<String> strList, int threadNum) {
        this.num = num;
        this.strList = strList;
        this.threadNum = threadNum;
    }
 
    public void run() {
        int length = 0;
        for(String str : strList){
            if (length % threadNum == num) {
                System.out.println("Ïß³Ì±àºÅ£º" + num + "£¬×Ö·û´®£º" + str);
            }
            length ++;
        }
    }
}