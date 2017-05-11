package thisisjava.threadTest;

public class ThreadTest {

    public static void main(String[] args) {
//        Thread thread1 = new Thread() {
//            @Override
//            public void run() {
//                printThreadName(Thread.currentThread());
//            }
//        };
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                printThreadName(Thread.currentThread());
//            }
//        });
//
//        Runnable runnable3 = new Runnable() {
//            @Override
//            public void run() {
//                printThreadName(Thread.currentThread());
//            }
//        };
//        Thread thread3 = new Thread(runnable3);
//
//        Thread thread4 = new Thread(() -> {
//            printThreadName(Thread.currentThread());
//        });
//
//        Thread thread5 = new Thread(() -> {
//            printThreadName(Thread.currentThread());
//        });
//
////        System.out.println("메인스레드의 이름은 " + Thread.currentThread().getName());
////        System.out.println("작업스레드(thread1)의 이름은 " + thread1.getName());
//        thread1.setName("thread1");
//        thread2.setName("thread2");
//        thread3.setName("thread3");
//        thread4.setName("thread4");
//        thread5.setName("thread5");
////        System.out.println("작업스레드(thread1)의 변경된 이름은 " + thread1.getName());
//
//        thread1.setPriority(Thread.MAX_PRIORITY);
//        thread2.setPriority(9);
//        thread3.setPriority(4);
//        thread4.setPriority(2);
//        thread5.setPriority(Thread.MIN_PRIORITY);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        System.out.println("메인스레드의 우선순위는 " + Thread.currentThread().getPriority());
//        System.out.println("작업스레드(thread1)의 우선순위는 " + thread1.getPriority());
//        System.out.println("작업스레드(thread2)의 우선순위는 " + thread2.getPriority());
//        System.out.println("작업스레드(thread3)의 우선순위는 " + thread3.getPriority());
//        System.out.println("작업스레드(thread4)의 우선순위는 " + thread4.getPriority());
//        System.out.println("작업스레드(thread5)의 우선순위는 " + thread5.getPriority());

//        for (int i = 0; i < 10; i++) {
//            Toolkit toolkit = Toolkit.getDefaultToolkit();
//            toolkit.beep();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        for (int i = 0; i < 2000000; i++) {
//            System.out.println(i + "번째 완료");
//        }

//        PrintThread2 printThread2 = new PrintThread2();
//        printThread2.start();
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        printThread2.interrupt();

//        ThreadGroup group = Thread.currentThread().getThreadGroup();
//        String groupName = group.getName();
//        System.out.println("groupName: " + groupName);
//
//        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
//        Set<Thread> threads = map.keySet();
//        for (Thread thread : threads) {
//            System.out.println("Name: " + thread.getName() + ((thread.isDaemon()) ? "(데몬)" : "(주)"));
//            System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
//            System.out.println();
//        }
//
//        System.out.println("----------------------------------------------");
//
//        group.list();

//        int processCount = Runtime.getRuntime().availableProcessors();
//        System.out.println("processCount: " + processCount);
//        Executors.newFixedThreadPool(processCount);

//        ExecutorService threadPool = new ThreadPoolExecutor(
//                3,
//                100,
//                120L,
//                TimeUnit.SECONDS,
//                new SynchronousQueue<>());
//
//        Callable<T> task = new Callable<T>() {
//            @Override
//            public T call() throws Exception {
//                return T;
//            }
//        };

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        for (int i = 0; i < 2; i++) {
//            Runnable runnable = new Runnable() {
//                @Override
//                public void run() {
//                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
//                    int poolSize = threadPoolExecutor.getPoolSize();
//                    String threadName = Thread.currentThread().getName();
//                    System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);
//
//                    int value = Integer.parseInt("3");
//                }
//            };
//
//            Future future = executorService.submit(runnable, 5);
//            try {
//                System.out.println("future: " + future.get());
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        executorService.shutdown();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread2.start();

    }

    private static class MusicRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("음악 재생 Runnable");
        }
    }

//    private static class PrintThread2 extends Thread {
//        @Override
//        public void run() {
//            while (true) {
//                System.out.println("실행중...");
//                if (Thread.interrupted()) {
//                    break;
//                }
//            }
//        }
//    }
//
//    private static void printThreadName(Thread thread) {
//        for (int i = 0; i < 3; i++) {
//            System.out.println("작업스레드 " + thread.getName());
//        }
//    }

}
