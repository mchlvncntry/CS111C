import java.util.Arrays;

public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {

    private T[] listArray;
    private int numberOfElements;

    public ArrayHeadTailList(int initialCapacity) {
    // if initialCapacity < 1, can set initialCapacity to 1 or greater?
    // if initialCapacity < 1) { initialCapacity = some default value? }
    
    // This format is based on array-based implementation from Module 4
        T[] tempList = (T[]) new Object[initialCapacity];
        listArray = tempList;
        numberOfElements = 0;
        // listArray - (T[]) new Object[initialCapacity];
    }
    
    @Override
    public T removeBack() {
        if (!isEmpty()) {
            return listArray[numberOfElements - 1];
        } else {
            return null;
        }
        // Simplified below
        //return (!isEmpty()) ? listArray[numberOfElements - 1] : null;
    }

    }
    
    @Override
    public T getEntry(int position) {
        if (!isEmpty() && (position > -1 && position <= numberOfElements)) {
            return listArray[position];
        } else {
            return null; // according to interface specification
        }
    }
    
    @Override
    public int contains(T anEntry) {
        for (int i = 0; i < numberOfElements; i++) {
            if (listArray[i].equals(anEntry) {
                return i;
            }
        }
        return -1; // according to interface specification
                
        /* if (isEmpty()) {
               return -1;
           } else {
               for (T element : listArray) {
                   if (element.equals(anEntry) {
                       return element;
                   }
               }
           }     
        */
    }
    
    // Removes elements But does it retain the capacity??
    @Override
    public void clear() {
        for (int i = 0; i < numberOfElements; i++) {
            listArray[i] = null;
        }
        numberOfElements = 0;
        // If capacity is retained
        /*
        listArray = numberOfElements == 0 ? (T[]) new Object[some default value here] : (T[]) new Object[numberOfElements];
        numberOfElements = 0;
        */
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        return (numberOfElements == 0);
        /* if (numberOfElements == 0) {
               return true;
           } else {
               return false;
           }
        */
    }

}
