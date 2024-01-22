package onethreetwo;

import java.util.ArrayList;

public class Queue {
    private String array[] = new String[100];
    private int front = 0;
    private int rear = 0;

    public Queue(){
    }

    public int getSize() {
        return (rear - front + 100) % 100;
    }

    public void enqueue(String x) {
        if((rear + 1) % 100 == front) {
            return;
        }
        array[rear] = x;
        rear = (rear + 1) % 100;
    }

    public String dequeue() {
        if(rear == front) {
            return null;
        }
        String result = array[front];
        front = (front + 1) % 100;
        return result;
    }

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyOBservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public interface Observer {
        void update(Queue q);
    }
    
    public class MyObserver implements Observer{
        public void update(Queue q) {
            System.out.printf("Count:%s\n", q.getSize());
        }
    }
}

