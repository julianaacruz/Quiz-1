package view;

import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet{
		private String [] arrayWords;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());}
		
	
		public void settings() {
			size (500,500);
		}	
		
		public void setup() {
			arrayWords = loadStrings ("../data/Shapes.txt");
		}
		
		public void draw() {
	}

}
