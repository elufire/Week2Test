package com.example.rickb.week2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public static void main(String [] args){
        RickyLinkedList rickyList;
        String givenString;
        QueueUsingStack rickyQueue;
        ArrayList<Integer> queueList;
        givenString = "Hallo";
        rickyList = new RickyLinkedList();
        rickyQueue = new QueueUsingStack();
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(55);
        tree.insert(16);
        tree.insert(96);
        tree.insert(88);
        tree.insert(14);
        tree.insert(78);
        tree.insert(80);
        tree.insert(77);
        System.out.println("Binary Search Tree Preorder: ");
        tree.preorder();
        System.out.println(" ");
        queueList = new ArrayList<>();
        queueList.add(1);
        queueList.add(2);
        queueList.add(3);
        QueueUsingStack.Queue gQueue = new QueueUsingStack.Queue();
        rickyQueue.enQueue(gQueue, queueList.get(0));
        rickyQueue.enQueue(gQueue, queueList.get(1));
        rickyQueue.enQueue(gQueue, queueList.get(2));
        System.out.println("Queue using stacks: ");
        System.out.println(rickyQueue.deQueue(gQueue) +" "+  rickyQueue.deQueue(gQueue)+" " + rickyQueue.deQueue(gQueue));
        System.out.println(" ");

        System.out.println("Custom Linked list: ");
        rickyList.add("1");
        rickyList.add("2");
        rickyList.add("3");
        rickyList.add("4");
        rickyList.add("5");

        for(int i=0; i<rickyList.size();i++){
            System.out.println(rickyList.get(i) + "\n");
        }

//        for(int i=0; i<givenString.length();i++){
//            customArrayList.addElement(givenString.charAt(i));
//        }

    }

    public RickyLinkedList convertString(String string){
        RickyLinkedList tempList = new RickyLinkedList();
        for(int i=0; i<string.length();i++){
            tempList.add(string.charAt(i));
        }
        return tempList;
    }

}
