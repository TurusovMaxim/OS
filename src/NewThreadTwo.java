public class NewThreadTwo {
    public static void main(String[] args) {
        NewThread InstanceNewThread = new NewThread();
        System.out.println("The process has been started");
        try {
            InstanceNewThread.run();
            System.out.println("The process has been stopped.");
            Thread.sleep(2000);

        } catch (InterruptedException e){
            System.out.println("The process interrupted.");
        }

    }
}
