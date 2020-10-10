package model;

import processing.core.PApplet;

public class Circle extends Shape{
	//atributos 
	public PApplet app;

	public Circle(int size, int posX, int posY, String t[], PApplet app) {
		super(size, posX, posY,t);
		this.app = app;
	}
	public void drawShape () {
		move (1);
		loop();
		app.noStroke();
		app.fill(0);
		app.ellipse(posX,posY,size,size);
	}
}
