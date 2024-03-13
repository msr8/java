class Main {
    public static void main(String[] args) {
        Thread curr = Thread.currentThread();

        System.out.println("Current thread: " + curr.getName());
    }
}