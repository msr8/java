class MyThread extends Thread {
    public void run() {
        while(true) {
            try   {Thread.sleep(500);}
            catch (InterruptedException e) {break;}
            System.out.println("Hello from a thread!");
        }
    }
}



class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        System.out.println("thread.isDaemon() = " + thread.isDaemon());

        System.out.println("\nStarting the thread and exiting the program after 2.2 seconds...");
        thread.start();
        try   {Thread.sleep(2200);}
        catch (InterruptedException e) {}
    }
}