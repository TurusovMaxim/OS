import static java.lang.Thread.sleep;

//Here I also looked at how multithreading works.
class ProcessOne implements Runnable {

    ProcessOne() {
        Thread child = new Thread("ParentThread"); //add "this" for the full work of multithreading
        child.start();
    }

    public void run() {
        try {
            System.out.println("Child thread started");
            sleep(200);

        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}


class Parent {
    public static void main(String args[]) {
        new ProcessOne();
        try {
            System.out.println("The main thread started");
            sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}