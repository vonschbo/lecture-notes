package comp1110.lectures.J16;

/**
 * Created by comp1110 on 10/20/15.
 */
public class Workers implements Runnable {
    int jobnnumber = 0;

    static final int WORK_ITEMS = 1000;
    static final int THREADS = 4;

    private void pretendtoworkhard(int itemnumber) {
        // eg have a customer go through a checkout
        try {
            Thread.sleep(1);  // not really working hard...
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized  // mutual exclusion -- only one thread can execute this method at a time
    int incJobNumber() {
        return jobnnumber++;  // the three steps of the increment all happen or none happen
    }

    @Override
    public void run() {
        int mytasks = 0;
        int myjobnumber;

        while ((myjobnumber = incJobNumber()) < WORK_ITEMS) {
            pretendtoworkhard(myjobnumber);
            mytasks++;
        }
        System.out.println(Thread.currentThread().getName() + " did "+mytasks+ " tasks");
    }

    public static void main(String[] args) {
        Workers workers = new Workers();
        Thread[] threads = new Thread[THREADS];
        for(int i = 0; i < THREADS; i++)
            threads[i] = new Thread(workers, "Worker "+i);

        // one thread running now (the main thread)

        for(int i = 0; i < THREADS; i++)
            threads[i].start();  // start each worker thread

        // THREADS + 1 threads running now
        System.out.println(Thread.currentThread().getName() + " is twiddling its thumbs");

        try {
            for(int i = 0; i < THREADS; i++)
               threads[i].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // one thread running now (the main thread)

        System.out.println("All done!!");
    }
}
