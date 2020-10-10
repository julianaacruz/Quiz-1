package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Rectangle extends Shape{
	//atributos 
	public PApplet app;

	public Rectangle(int size, int posX, int posY, String t[],PApplet app) {
		super(size, posX, posY, t);
		this.app = app;
	}

}
