package problem_3;

public class MyCollectionTest {
	public static void main(String[] args) {
		MyArrayList<String> myList = new MyArrayList<>();

	    myList.add("Apple");
	    myList.add("Banana");
	    myList.add("Cherry");

	    System.out.println("List contains 'Banana': " + myList.contains("Banana"));
	    myList.remove("Banana");
	    System.out.println("List contains 'Banana' after removal: " + myList.contains("Banana"));

	    System.out.println("List size: " + myList.size());

	    System.out.print("Elements in list: ");
	    myList.printAll();

	    Object[] array = myList.toArray();
	    System.out.println("Array contents:");
	    for (Object item : array) {
	        System.out.println(item);
	    }

	    myList.clear();
	    System.out.println("Is list empty after clear? " + myList.isEmpty());
	    
	}

    

}
