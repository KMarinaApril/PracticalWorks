package company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayL arrayL = new ArrayL ();
        ArrayList <Integer> arrayList = arrayL.addArrayList();

        LinkedL linkedL = new LinkedL();
        LinkedList <Integer> linkedList = linkedL.addLinkedList();

        arrayL.addItemArrayList(arrayList);
        linkedL.addItemLinkedList(linkedList);


        arrayL.removeItemArrayList(arrayList);
        linkedL.removeItemLinkedList(linkedList);

        arrayL.getTimeItemArrayList(arrayList);
        linkedL.getTimeItemLinkedList(linkedList);


    }
}
