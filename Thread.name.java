class myThread extends Thread {
    public void run() {
        System.out.println("My name is " + this.getName());
    }
}

class Main {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.setName("Thread 1");
        t1.start();
    }
}