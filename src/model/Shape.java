package model;

import java.util.Random;

public class Shape{
	//atributos	
	
	protected int size;
	protected int posX;
	protected int posY;
	protected int directionY;
	
	public Shape(int size, int posX, int posY, String t[]) {
		
		}
	public void splitArray(String t[]) {

		for(int i=0; i < t.length ; i++) { 
			String [] tempArray = t[i].split(" "); // separar por espacios
			for (int j=0; j< tempArray.length; j++)
				System.out.println(tempArray[j]);
		}
	}
	
	
}

