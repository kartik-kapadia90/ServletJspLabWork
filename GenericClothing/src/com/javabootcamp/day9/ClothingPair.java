package com.javabootcamp.day9;

import java.util.ArrayList;

public class ClothingPair<E extends Sized & Colored> {

	ArrayList<E> list;
	@SuppressWarnings("unchecked")
	public ClothingPair(E element1, E element2 ){
		list = new ArrayList<E>();
		list.add(element1);
		list.add(element2);
	}

	public boolean isMatched(){

		
		
		
		if(list.get(0).getColor()!=null && list.get(1).getColor()!=null){
			return (list.get(0).getSize()==list.get(1).getSize()) && (list.get(0).getColor().equals(list.get(1).getColor()));
		}
		return (list.get(0).getSize()==list.get(1).getSize());


	}
}
