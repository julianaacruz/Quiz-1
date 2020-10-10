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
	public void drawShape (int size, int posX, int posY, int dir) {
		move (dir);
		loop();
		app.noStroke();
		app.fill(0);
		app.rectMode(PConstants.CENTER);
		app.rect(posX,posY,size,size);
	}

}
