package _01_Custom_ArrayList;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;

	public ArrayList() {
		array = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
		T[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[array.length] = val;
		array = newArray;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		boolean isAdded = false;
		T[] newArray = (T[]) new Object[array.length+1];
		for (int i = 0; i < array.length; i++) {
			if ((i == loc) && !isAdded) {
				newArray[i] = val;
				i-=1;
				isAdded = true;
			}
			else if (!isAdded){
				newArray[i] = array[i];
			}
			else {
				newArray[i+1] = array[i];
			}
		}
		array = newArray;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] newArray = (T[]) new Object[array.length];
		for (int i = 0; i < array.length; i++) {
			if (i == loc) {
			newArray[i] = val;
			}
			else {
				newArray[i]=array[i];
			}
		}
		array = newArray;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		boolean isRemoved = false;
		T[] newArray = (T[]) new Object[array.length-1];
		for (int i = 0; i < array.length-1; i++) {
			if ((i == loc) && !isRemoved) {
				isRemoved = true;
			}
			else if (!isRemoved){
				newArray[i] = array[i];
			}
			else {
				newArray[i] = array[i-1];
			}
			System.out.println(Arrays.toString(newArray));
		}
		array = newArray;
	}
	
	public boolean contains(T val) {
		
		return false;
	}

	public int size()  {
		return 0;
	}
}