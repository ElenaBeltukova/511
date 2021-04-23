class MyThread extends Thread {
    public String ip;
    public int port;

    public MyThread(String ip, int port) {
        super();
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        System.out.println(Main.checkProxy(ip, port));
    }
}
