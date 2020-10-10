package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Rectangle extends Shapes{
	//atributos 
	public PApplet app;

	public Rectangle(float size, float posX, float posY, PApplet app) {
		super(size, posX, posY);
		this.app = app;
	}

}
