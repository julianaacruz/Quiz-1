package view;

import java.util.ArrayList;

import model.Shape;
import processing.core.PApplet;

public class Main extends PApplet{
		private String [] arrayWords;
		private Shape shape1;
		
		
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());}
		
	
		public void settings() {
			size (500,500);
		}	
		
		public void setup() {
			arrayWords = loadStrings ("../data/Shapes.txt");
			System.out.println(arrayWords.length);
			shape1= new Shape(0,0,0,arrayWords);
		}
		
		public void draw() {
			shape1.splitArray(arrayWords);
		}	

}
