package tdd;

import java.util.ArrayList;
import java.util.Iterator;


public class CircularListImpl implements CircularList{
    private ArrayList<Integer> circularList;
    private int index=0;

    public CircularListImpl() {
        circularList= new ArrayList<>();
     }
 
 
     public ArrayList<Integer> getCircularList() {
         return circularList;
     }
 
     public void setCircularList(ArrayList<Integer> circularList) {
         this.circularList = circularList;
     }
 
    
    @Override
    public boolean isEmpty() {
        return circularList.isEmpty();
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        Iterator<Integer> i = circularList.iterator();
        return i;      
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        Iterator<Integer> i = circularList.iterator();
        return i;
    }

    

    @Override
    public void reset() {
       circularList = new ArrayList<>();
        
    }

    @Override
    public int size() {
        return circularList.size();
    }

   
    @Override
    public void add(int element) {
        circularList.add(element);
        
    }

    
    
}
