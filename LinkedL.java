package company;

import java.util.LinkedList;

public class LinkedL {

    LinkedList <Integer> linkedList = new LinkedList<Integer>();
    int index = 10000;

    LinkedList <Integer> addLinkedList () {

        long linkedListTimeAdd = System.currentTimeMillis();

        for (int i = 0; i<10000000; i++ )
        {
            linkedList.add(i);

        }
        long linkedListTimeAddResult = System.currentTimeMillis() - linkedListTimeAdd;
        printItemLinkedListTimeAddResult(linkedListTimeAddResult);
        return linkedList;
    }

    LinkedList <Integer> addItemLinkedList (LinkedList<Integer> linkedList) {

        long linkedListTimeReAdd = System.currentTimeMillis();
        linkedList.add (index,288);

        long linkedListTimeReAddResult = System.currentTimeMillis() - linkedListTimeReAdd;
        printItemLinkedListTimeReAddResult(linkedListTimeReAddResult);

        return linkedList;
    }



    LinkedList <Integer> removeItemLinkedList (LinkedList<Integer> linkedList) {

        long linkedListTimeRemove = System.currentTimeMillis();

        linkedList.remove(index);
        long linkedListTimeRemoveResult = System.currentTimeMillis()-linkedListTimeRemove;
        printItemLinkedListTimeRemove (linkedListTimeRemoveResult);
        return linkedList;
    }

    long getTimeItemLinkedList (LinkedList<Integer> linkedList) {
        long linkedListTimeGet = System.currentTimeMillis();

        linkedList.get(index);

        long linkedListTimeGetResult = System.currentTimeMillis()- linkedListTimeGet;
        printItemLinkedListTimeGet (linkedListTimeGetResult);

        return linkedListTimeGet;
    }


    void printItemLinkedListTimeAddResult (long linkedListTimeAddResult) {

        System.out.println("Time for filling in LinkedList = " + linkedListTimeAddResult);

    }

    void printItemLinkedListTimeReAddResult (long linkedListTimeReAddResult) {

        System.out.println("Time for adding of item " + index +" in already existing LinkedList = " + linkedListTimeReAddResult);

    }


    long printItemLinkedListTimeRemove (long linkedListTimeRemoveResult) {

        System.out.println("Time for removing of item " + index + " in LinkedList = " + linkedListTimeRemoveResult);

        return linkedListTimeRemoveResult;
    }

    long printItemLinkedListTimeGet (long linkedListTimeGetResult) {

        System.out.println("Time for getting of item " + index + " in LinkedList = " + linkedListTimeGetResult);

        return linkedListTimeGetResult;
    }

}
