class  Priority implements Runnable{
    int count; Thread thread; static boolean stop = false; static String currentName;
    Priority(String name ){
        thread = new Thread(this, name);
        count = 0;
        currentName = name;

    }
    @Override
    public void run() {
        System.out.println(thread.getName() + "start to operate");
        do {
           count ++; 
           if (currentName.compareTo(thread.getName()) !=0 ){
                currentName = thread.getName();
                System.out.println(currentName + "is exercuted");
           }
        } while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + currentName +" finishes running");
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        Priority mt1 = new Priority("Highest priority");
        Priority mt2 = new Priority("Low priority");
        Priority mt3 = new Priority("Thread #1 Normal priority");
        Priority mt4 = new Priority("Thread #2 Normal priority");
        Priority mt5 = new Priority("Thread #3 Normal priority");
        mt1.thread.setPriority(Thread.NORM_PRIORITY + 5);
        mt2.thread.setPriority(Thread.NORM_PRIORITY - 5);
    }
}
