package csku.datastructure;


/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollection  implements Collection {
    private Object[] elementData;
    private int size;
    public ArrayCollection(int c) {
        elementData = new Object[c];
        size = 0;
    }
    public ArrayCollection() {

    }

    public void add(Object element) {
        if(element == null) throw new IllegalArgumentException();
        elementData[size++] = element;
    }

    public void remove(Object element) {

    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean contains(Object element) {
        return false;
    }

//    public boolean contains(Object element) {
//        return indexOf(element) != -1;
//    }

    public int size() {
        return size;
    }
}
