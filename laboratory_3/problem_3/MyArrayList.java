package problem_3;
import java.util.ArrayList;

public class MyArrayList<E> implements MyCollection<E>{
	private ArrayList<E> list;

    public MyArrayList() {
        list = new ArrayList<>();
    }

    public boolean add(E element) {
        return list.add(element);
    }

    public boolean remove(E element) {
        return list.remove(element);
    }

    public boolean contains(E element) {
        return list.contains(element);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    public Object[] toArray() {
        return list.toArray();
    }

    public E get(int index) {
        return list.get(index); 
    }

    public void printAll() {
        for (E item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
	

}
