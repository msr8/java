class myThread extends Thread {
    myThread() {
        System.out.println("this.isAlive() during initialisation: " + this.isAlive());
    }

    public void run() {
        System.out.println("this.isAlive() during runtime: " + this.isAlive());
    }
}

class Main {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
    }
}