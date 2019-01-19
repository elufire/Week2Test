package com.example.rickb.week2test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomArrayList<E> {
    private E[] array;

    public CustomArrayList(Class<E> c, int s) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final E[] array = (E[]) Array.newInstance(c, s);
        this.array = array;
    }

    public E get(int i) {
        return array[i];
    }
    public void addElement(E rand){
        int tempLength = array.length;
//        int counter =1;
        if(tempLength == 0){
            array = java.util.Arrays.copyOf(array, 1);
            array[0] = rand;
        }else if (tempLength == 1){
            array[0] = rand;
        }
        else if(array[tempLength-1] != null) {
            array = java.util.Arrays.copyOf(array, array.length * 2);
            array[tempLength] = rand;
        }else{
            for (int counter =1;counter<=tempLength; counter++ ){
                if (tempLength-counter == 0){
                    array[0] = rand;
                }else if(array[tempLength-counter] == null){
                    continue;
                }
                else{
                    array[(tempLength - counter)+1] = rand;
                    break;
                }
            }

        }

    }

//    public void remove(E remElement){
//        int length = array.length;
//        //(E[]) newarray = (E[]) Array.newInstance(array.getClass(), length - 1);
//        ArrayList<E>arrayList = new ArrayList<E>();
//        for(E item : array) {
//            if (!remElement.equals(item))
//                arrayList.add(item);
//        }
//        java.util.Arrays.
//            array =(E[]) arrayList.toArray();
//    }
    public static void main(String[] args){
            CustomArrayList<Integer>  customArrayList= new CustomArrayList<Integer>(Integer.class, 3);
            Integer[] intArray = customArrayList.array;

            customArrayList.addElement(5);
        System.out.println(customArrayList.get(0));
    }
}
