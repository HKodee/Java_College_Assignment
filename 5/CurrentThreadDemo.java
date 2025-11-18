public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        System.out.println("Current Thread details: " + t);
        System.out.println("Current Thread Name: " + t.getName());
        
        t.setName("MyMainThread");
        System.out.println("New Thread Name: " + t.getName());
    }
}