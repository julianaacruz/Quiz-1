package model;

import processing.core.PApplet;

public class Circles extends Shapes{
	//atributos 
	public PApplet app;

	public Circles(float size, float posX, float posY, PApplet app) {
		super(size, posX, posY);
		this.app = app;
	}
}
