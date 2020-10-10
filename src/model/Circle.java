package model;

import processing.core.PApplet;

public class Circle extends Shape{
	//atributos 
	public PApplet app;

	public Circle(int size, int posX, int posY, String t[], PApplet app) {
		super(size, posX, posY,t);
		this.app = app;
	}
	public void drawCircle(int size, int posX, int posY) {
		loop();
		app.noStroke();
		app.fill(50);
		app.ellipse(posX,posY,size,size);
	}
}
