package JUC;

import java.util.concurrent.*;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-04-27-13:00
 */
public class Demo01 {

    public static void main(String[] args) {

        // 获取CPU核数
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService threadPool= new ThreadPoolExecutor(
                2,
                Runtime.getRuntime().availableProcessors(),
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                // new ThreadPoolExecutor.CallerRunsPolicy()); // 队列溢出，抛出异常
                //new ThreadPoolExecutor.CallerRunsPolicy());    // 哪来的去哪里
                //new ThreadPoolExecutor.DiscardPolicy());        // 队列满了，丢掉任务，不会抛出异常
                new ThreadPoolExecutor.DiscardOldestPolicy());  // 队列满了，尝试和最早的竞争也不会抛出异常

        try {
            for (int i=1;i<=9;i++){
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"ok");
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }
}
