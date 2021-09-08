package XunLian;

/**
 *  用Runable接口程序来模拟航班售票系统，
 *  实现5个售票窗口发售某次航班的50张机票，
 *  一个售票窗口使用一个线程来表示。
 */
public class ShiYian9 {
    static class ThreadSale implements Runnable {
        private int tickets = 50;
        public void run() {
            while (true) {
                if (tickets > 0)////循环结构
                {
                    try {
                        Thread.sleep((int) (10 * Math.random()));
                    } catch (InterruptedException e) {
                    }
                    System.out.println(Thread.currentThread().getName() + "售票机第" + tickets + "号");
                    ////该方法是Thread类中的类方法，可以用类名调用，该方法返回当前正在使用CPU资源的线程
                } else {
                    System.exit(0);
                }
            }
        }
    }

    public static class ShouPiao {
        public static void main(String[] args) {
            ThreadSale t = new ThreadSale();//模拟5个售票员
            Thread t1 = new Thread(t, "第1个售票员");
            Thread t2 = new Thread(t, "第2个售票员");
            Thread t3 = new Thread(t, "第3个售票员");
            Thread t4 = new Thread(t, "第4个售票员");
            Thread t5 = new Thread(t, "第5个售票员");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
        }
    }
}
