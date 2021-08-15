package com.eric;

public class ArrayList {
	private int size;
	private int[] elements;
	private static final int DEFAULT_CAPACITY = 10;
	private static final int ELEMENT_NOT_FOUND = -1;

	public ArrayList(int capacity) {
		capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
		System.out.println(capacity);
		elements = new int[capacity];
	}

	public ArrayList() {
		this(DEFAULT_CAPACITY);
//		elements = new int[10];
	}

	/*
	 * 清楚所有元素
	 */
	public void clear() {
		size = 0;
	}

	/*
	 * 元素的数量
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * 是否为空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 是否包含某个元素
	 * 
	 * @return
	 */
	public boolean contains(int element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}

	/**
	 * 添加一个元素到尾部
	 * 
	 * @param element
	 */
	public void add(int element) {
		System.out.println(element);
		elements[size] = element;
		size++;
	}

	/**
	 * 获取index位置的元素
	 * 
	 * @param index
	 * @return
	 */
	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index" + index + ".Size:" + size);
		}
		return elements[index];
	}

	/**
	 * 设置index位置的元素
	 * 
	 * @param index
	 * @return
	 */
	public int set(int index, int element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index" + index + ".Size:" + size);
		}
		int old = elements[index];
		elements[index] = element;
		return old;
	}

	/**
	 * 在index位置插入一个元素
	 * 
	 * @param index
	 * @param element
	 */
	public void add(int index, int element) {

	}

	/**
	 * 删除index位置的元素
	 * 
	 * @param index
	 * @return
	 */
	public int remove(int index) {

		for (int i = index + 1; i <= size - 1; i++) {
			elements[i - 1] = elements[i];
		}
		size--;
		return 0;
	}

	/**
	 * 查看元素的索引
	 * 
	 * @param element
	 * @return
	 */
	public int indexOf(int element) {
		for (int i = 0; i < size; i++) {
			if (elements[i] == element)
				return i;
		}
		return ELEMENT_NOT_FOUND;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("size=").append(size).append(",[");
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				stringBuilder.append(",");
			}
			stringBuilder.append(elements[i]);
		}
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}
