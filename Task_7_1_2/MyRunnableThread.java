public class MyRunnableThread implements Runnable{

    public String ip;
    public int port;

    public MyRunnableThread(String ip, int port) {
        super();
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        System.out.println(Main.checkProxy(ip, port));
    }
}
