package _01_Custom_ArrayList;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;

	public ArrayList() {
		array = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		for (int i = 0; i < loc; i++){
			if (i == loc - 1){
				return array[i];
			}
		}
		return null;
	}
	
	public void add(T val) {
		T[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[array.length] = val;
		array = newArray;
		System.out.println(val);
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}

	public int size()  {
		return 0;
	}
}