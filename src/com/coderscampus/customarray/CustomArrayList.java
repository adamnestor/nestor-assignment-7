package com.coderscampus.customarray;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0; 

// add method
	@Override
	public boolean add(T item) {
		ensureCapacity(); 

		items[size] = item; 
		size++; 

		return true;
	}

// getSize Method
	@Override
	public int getSize() {
		return size;
	}

// get Method
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}

		@SuppressWarnings("unchecked")
		T element = (T) items[index]; 
		return element;
	}

// Method created to assist with add method	
	private void ensureCapacity() {
		if (size == items.length) { 
			int newCapacity = items.length * 2;
			Object[] newItems = new Object[newCapacity]; 
			System.arraycopy(items, 0, newItems, 0, size);
			items = newItems; 
		}
	}

}
