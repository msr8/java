class Main {
    public static void main(String[] args) {
        System.out.println("Waiting for 3 seconds");
        
        try   {Thread.sleep(3000);}
        catch (InterruptedException e) {}

        System.out.println("Done");
    }
}