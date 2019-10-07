package deque;

public class DequeImpl implements Deque {
    private int front;
    private int rear;

    private int[] queue;
    private int items;
    private int maxSize;

    public DequeImpl(int size) {
        this.queue = new int[size];
        this.front = -1;
        this.rear = 0;
        this.items = 0;
        this.maxSize = size;
    }

    @Override
    public boolean isEmpty() {
        return (items == 0);
    }

    @Override
    public boolean isFull() {
        return (items == maxSize);
    }

    @Override
    public int size() {
        return items;
    }

    @Override
    public void insertLeft(int i) {
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = maxSize - 1;
        } else {
            front -= 1;
        }

        queue[front] = i;
        items++;
    }

    @Override
    public void insertRight(int i) {
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == (maxSize - 1)) {
            rear = 0;
        } else {
            rear += 1;
        }
        queue[rear] = i;
        items++;
    }

    @Override
    public int removeLeft() {
        int template = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            if (front == (maxSize - 1)) {
                front = 0;
            } else {
                front += 1;
            }
        }
        items--;
        return template;
    }

    @Override
    public int removeRight() {
        int template = queue[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            if (rear == 0) {
                rear = maxSize - 1;
            } else {
                rear -= 1;
            }
        }
        items--;
        return template;
    }

    @Override
    public int peekLeft() {
        return queue[front];
    }

    @Override
    public int peekRight() {
        return queue[rear];
    }

    public void displayDeque() {
        for (int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
