public class Main {
    public static void main(String[] args) {
        MyQueue mQueue = new MyQueue();
        mQueue.push(1);
        mQueue.push(2);
        mQueue.push(3);
        mQueue.push(4);
        System.out.println("Printing mQueue contents: ");
        while (!mQueue.empty()) {
            System.out.print(mQueue.pop() + ", ");
        }   
        System.out.println("end");
    }
}
