package chapter5.ch05;

public class MyListQueueTest {

    public static void main(String[] args) {
        MyLinkedQueue linkedQueue = new MyLinkedQueue();
        linkedQueue.enQueue("A");
        linkedQueue.enQueue("B");
        linkedQueue.enQueue("C");

        linkedQueue.printAll();

        System.out.println(linkedQueue.deQueue());
        System.out.println(linkedQueue.deQueue());

    }
}
