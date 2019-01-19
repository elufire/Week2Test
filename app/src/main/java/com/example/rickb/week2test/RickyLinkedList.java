package com.example.rickb.week2test;


public class RickyLinkedList {

    private static int counter;
    private Node head;


    public RickyLinkedList() {

    }


    public void add(Object data) {


        if (head == null) {
            head = new Node(data);
        }

        Node rickyTemp = new Node(data);
        Node rickyCurrent = head;


        if (rickyCurrent != null) {

            while (rickyCurrent.getNext() != null) {
                rickyCurrent = rickyCurrent.getNext();
            }

            rickyCurrent.setNext(rickyTemp);
        }

        incrementCounter();
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public void add(Object data, int index) {
        Node rickyTemp = new Node(data);
        Node rickyCurrent = head;

        if (rickyCurrent != null) {

            for (int i = 0; i < index && rickyCurrent.getNext() != null; i++) {
                rickyCurrent = rickyCurrent.getNext();
            }
        }

        rickyTemp.setNext(rickyCurrent.getNext());
        rickyCurrent.setNext(rickyTemp);
        incrementCounter();
    }

    public Object get(int index)

    {
        if (index < 0)
            return null;
        Node rickyCurrent = null;
        if (head != null) {
            rickyCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (rickyCurrent.getNext() == null)
                    return null;

                rickyCurrent = rickyCurrent.getNext();
            }
            return rickyCurrent.getData();
        }
        return rickyCurrent;

    }
    public boolean remove(int index) {

        if (index < 1 || index > size())
            return false;

        Node rickyCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (rickyCurrent.getNext() == null)
                    return false;

                rickyCurrent = rickyCurrent.getNext();
            }
            rickyCurrent.setNext(rickyCurrent.getNext().getNext());
            decrementCounter();
            return true;

        }
        return false;
    }

    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Node rickyCurrent = head.getNext();
            while (rickyCurrent != null) {
                output += "[" + rickyCurrent.getData().toString() + "]";
                rickyCurrent = rickyCurrent.getNext();
            }

        }
        return output;
    }

    private class Node {

        Node next;

        Object data;

        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        @SuppressWarnings("unused")
        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }

        public Object getData() {
            return data;
        }

        @SuppressWarnings("unused")
        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }

    }
}