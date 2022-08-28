package producer_cost;

import java.util.LinkedList;

/**
 * @author luorui
 * @company SCUT
 * @create 2022-04-14-13:53
 */
public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        MessageQueue queue = new MessageQueue(2);

        // 三个生产者向队列里存值
        for (int i = 0; i < 3; i++) {
            int id = i;
            new Thread(() -> {
                queue.put(new Message(id, "值" + id));
            }, "生产者" + i).start();
        }

        Thread.sleep(1000);

        // 一个消费者不停的从队列里取值
        new Thread(() -> {
            while (true) {
                queue.take();
            }
        }, "消费者").start();

    }
}


// 消息队列被生产者和消费者持有
class MessageQueue {
    private LinkedList<Message> list = new LinkedList<>();

    // 容量
    private int capacity;

    public MessageQueue(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 生产
     */
    public void put(Message message) {
        synchronized (list) {
            while (list.size() == capacity) {
                System.out.println("队列已满，生产者等待");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.addLast(message);
            System.out.println("生产消息:{}"+ message);
            // 生产后通知消费者
            list.notifyAll();
        }
    }

    public Message take() {
        synchronized (list) {
            while (list.isEmpty()) {
                System.out.println("队列已空，消费者等待");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message message = list.removeFirst();
            System.out.println("消费消息:{}"+ message);
            // 消费后通知生产者
            list.notifyAll();
            return message;
        }
    }


}
// 消息
class Message {

    private int id;

    private Object value;

    public Message(int id, Object value) {
        this.id = id;
        this.value = value;
    }
}
