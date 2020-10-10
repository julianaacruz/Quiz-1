package model;

import java.util.Random;

public class Shape{
	//atributos	
	
	protected int size;
	protected int posX;
	protected int posY;
	protected int directionY;
	protected int shapeType;
	
	public Shape(int size, int posX, int posY, String t[]) {
		
		}
	public void splitArray(String t[]) {

		for(int i=0; i < t.length ; i++) { 
			String [] tempArray = t[i].split(" "); // separar por espacios
			for (int j=0; j< tempArray.length; j++) {
			
				System.out.println(tempArray[j]);
			}
		}
	}
	
	public void drawShape(int size, int posX, int posY, int directionY) {
		
		
		
	}
	
	public void move (int directionY) {
		
		posY= posY + directionY;	
	}
	
	public void loop () {
			if (posY >= 500 + size) {
			posY=0-size;
		}
	}
	
	
}

