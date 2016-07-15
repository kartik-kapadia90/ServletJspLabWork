package com.javabootcamp.day9;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		Sock s1 = new Sock(5, Color.BLACK);
		Sock s2 = new Sock(6, Color.BLUE);
		ClothingPair<Sock> sockPair= new ClothingPair<>(s1,s2);
		System.out.println(sockPair.isMatched());
		
		Glove g1 = new Glove(5, Color.BLACK);
		Glove g2 = new Glove(5, Color.BLACK);
		ClothingPair<Glove> glovePair= new ClothingPair<>(g1,g2);
		System.out.println(glovePair.isMatched());
		
		Fabric f1 = new Fabric(Color.CYAN);
		Fabric f2 = new Fabric(Color.GRAY);
		ClothingPair<Fabric> fabricPair = new ClothingPair<>(f1,f2);
		System.out.println(fabricPair.isMatched());
		
		GlassVase gv1 = new GlassVase(5);
		GlassVase gv2 = new GlassVase(5);
		ClothingPair<GlassVase> glassVasePair = new ClothingPair<>(gv1,gv2);
		System.out.println(glassVasePair.isMatched());
		
		
		/*String str1 = "This is";
		String str2 = "a pair";
		ClothingPair<String> stringPair = new ClothingPair<>(str1,str2);*/
		
	}
}
