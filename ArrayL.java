package company;

import java.util.ArrayList;

public class ArrayL {

    ArrayList <Integer> arrayList = new ArrayList<Integer>();
    int index = 10000;

    ArrayList <Integer> addArrayList () {

        long arrayListTime = System.currentTimeMillis();

        for (int i = 0; i<10000000; i++ )
        {
            arrayList.add(i);

        }
        long arrayListTimeAddResult = System.currentTimeMillis() - arrayListTime;
        printItemArrayListTimeAddResult(arrayListTimeAddResult);
        return arrayList;
    }

    ArrayList <Integer> addItemArrayList (ArrayList<Integer> arrayList) {

        long arrayItemAddTime = System.currentTimeMillis();
        arrayList.add (index,288);

        long arrayItemTimeAddResult = System.currentTimeMillis() - arrayItemAddTime;
        printItemArrayListTimeReAddResult(arrayItemTimeAddResult);

        return arrayList;
    }


    ArrayList <Integer> removeItemArrayList (ArrayList<Integer> arrayList) {

        long arrayListTimeRemove = System.currentTimeMillis();

        arrayList.remove(index);

        long arrayListTimeRemoveResult = System.currentTimeMillis()-arrayListTimeRemove;
        printItemArrayListTimeRemove (arrayListTimeRemoveResult);
        return arrayList;
    }

    long getTimeItemArrayList (ArrayList<Integer> arrayList) {
        long arrayListTimeGet = System.currentTimeMillis();

        arrayList.get(index);
        long arrayListTimeGetResult = System.currentTimeMillis()- arrayListTimeGet;
        printItemArrayListTimeGet (arrayListTimeGetResult);

        return arrayListTimeGet;
    }


    void printItemArrayListTimeAddResult (long arrayListTimeAddResult) {

        System.out.println("Time for filling in ArrayList = " + arrayListTimeAddResult);

    }

    void printItemArrayListTimeReAddResult (long arrayListTimeReAddResult) {

        System.out.println("Time for adding of item " + index +" in already existing ArrayList = " + arrayListTimeReAddResult);

    }

    long printItemArrayListTimeRemove (long arrayListTimeRemoveResult) {

        System.out.println("Time for removing of item " + index + " in ArrayList = " + arrayListTimeRemoveResult);

        return arrayListTimeRemoveResult;
    }

    long printItemArrayListTimeGet (long arrayListTimeGetResult) {

        System.out.println("Time for getting of item " + index + " in ArrayList = " + arrayListTimeGetResult);

        return arrayListTimeGetResult;
    }

}
