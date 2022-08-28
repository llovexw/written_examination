package JUC;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-06-23-11:07
 */
public class Demo02 implements Runnable{
    @Override
    public void run() {

    }
//
//    @Override
//    public void run() {
//        if(index == 0){// 错开，让第一个先取左侧的筷子
//            synchronized (left){
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (right){
//                    try {
//                        Thread.sleep(1);
//                        System.out.println(index + "吃完了!");
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }else {
//            synchronized (right){
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                synchronized (left){
//                    try {
//                        Thread.sleep(1);
//                        System.out.println(index + "吃完了!");
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//    }
}
