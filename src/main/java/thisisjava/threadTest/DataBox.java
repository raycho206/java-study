package thisisjava.threadTest;

public class DataBox {
    private String data;

    public synchronized String getData() {
        if (data == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String returnValue = data;
        System.out.println("ConsumerThread가 읽은 데이터: " + returnValue);
        data = null;
        notify();

        return returnValue;
    }

    public synchronized void setData(String data) {
        if (data != null) {
            this.data = data;
            System.out.println("ProducerThread가 생성한 데이터: " + data);
            notify();

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
