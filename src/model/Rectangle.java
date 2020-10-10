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
	public void drawRect (int size, int posX, int posY) {
		loop();
		app.noStroke();
		app.fill(50);
		app.rectMode(PConstants.CENTER);
		app.rect(posX,posY,size,size);
	}

}
