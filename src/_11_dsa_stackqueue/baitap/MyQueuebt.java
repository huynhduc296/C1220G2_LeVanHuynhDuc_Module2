package _11_dsa_stackqueue.baitap;

public class MyQueuebt {
    public static void main(String[] args) {
        MyQueuebt queuebt=new MyQueuebt();
        queuebt.enQueue(10);
        queuebt.enQueue(20);
        queuebt.deQueue();
        queuebt.deQueue();
        queuebt.enQueue(30);
        System.out.println("Dequeued item is " + queuebt.deQueue().data);
    }
    private Node rear;
    private Node front;
    private int size = 0;

    public MyQueuebt() {
        this.rear = null;
        this.front = null;
    }

    public class Node {
        public int data;
        public Node link;


        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public void enQueue(int data) {
        Node node = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = node;
            size++;
        } else {
            this.rear.link = node;
            this.rear = node;
            this.rear.link = this.front;
            size++;
        }
    }

    public Node deQueue() {
        if (this.front == null) {
            return null;
        } else if (this.front == this.rear) {
            Node node = front;
            this.front = this.rear = null;
            size--;
            return node;
        } else {
            Node node = this.front;
            this.front = this.front.link;
            this.rear.link = this.front;
            size--;
            return node;
        }
    }

    public int getSize() {
        return size;
    }

    public void disPlay() {
        Node temp = this.front;
        if (this.front != null) {
            for (int i = 0; i < size; i++) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        } else {
            System.out.println("null");
        }

    }
}

