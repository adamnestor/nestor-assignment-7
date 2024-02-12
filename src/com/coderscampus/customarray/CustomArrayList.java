package com.coderscampus.customarray;

import java.util.Arrays;

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

// add to specific index method
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}

		ensureCapacity();
		size++;
		for (int i = index; i < size; i++) {
			items[index + 1] = items[index];
		}
		items[index] = item;

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

// remove Method
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}

		@SuppressWarnings("unchecked")
		T element = (T) items[index];

		for (int i = index; i < size; i++) {
			items[index] = items[index + 1];
		}
		size--;

		return element;
	}

// Method created to assist with add method	
	private void ensureCapacity() {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
	}

}
