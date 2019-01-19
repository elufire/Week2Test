package com.example.rickb.week2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RickyLinkedList rickyList;
    String givenString;
    QueueUsingStack rickyQueue;
    ArrayList<Integer> queueList;
    CustomArrayList customArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Default constructor - let's put "0" into head element.
       rickyList = new RickyLinkedList();
       rickyQueue = new QueueUsingStack();

       queueList = new ArrayList<>();
       queueList.add(1);
        queueList.add(2);
        queueList.add(3);
        QueueUsingStack.Queue gQueue = new QueueUsingStack.Queue();
        rickyQueue.enQueue(gQueue, queueList.get(0));
        rickyQueue.enQueue(gQueue, queueList.get(1));
        rickyQueue.enQueue(gQueue, queueList.get(2));
        System.out.println(rickyQueue.deQueue(gQueue) +" "+  rickyQueue.deQueue(gQueue)+" " + rickyQueue.deQueue(gQueue));
                givenString = "Hallo";
        rickyList.add("1");
        rickyList.add("2");
        rickyList.add("3");
        rickyList.add("4");
        rickyList.add("5");

        /*
         * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
         * corresponding wrapper class.
         */


        for(int i=0; i<rickyList.size();i++){
            System.out.println(rickyList.get(i) + "\n");
        }



    }

    public RickyLinkedList convertString(String string){
        RickyLinkedList tempList = new RickyLinkedList();
        for(int i=0; i<string.length();i++){
            tempList.add(string.charAt(i));
        }
        return tempList;
    }

}
