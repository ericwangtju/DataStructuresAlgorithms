package com.eric;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int array[] = new int[] {11, 22, 33};
		
		ArrayList list = new ArrayList();
		System.out.println(list.size());
//		list.get(-10);
		
		list.add(99);
		list.add(88);
		list.add(77);
		list.add(66);
		list.add(55);
		
		list.remove(-1);
		
		System.out.println(list);
	}

}
