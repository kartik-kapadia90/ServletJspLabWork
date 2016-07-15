package com.javabootcamp.day7;

import java.util.Iterator;

public class Sequence implements Iterable{

	static int size = 10;
	static Object[] data = new Object[size];
	static int count = 0;

	public void add(Object o){
		if(count>=size){
			throw new ArrayIndexOutOfBoundsException("The data array is full");
		}
		else{
			data[count]=o;
			count++;
		}
	}

	public Object get(int index){
		return data[index];
	}

	public int size(){
		return count;
	}


	class SequenceIterator implements Iterator{

		private int progress =0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return progress<count;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			progress++;
			return data[progress-1];
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}


	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new SequenceIterator();
	}
}
