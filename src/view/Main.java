package view;

import java.util.ArrayList;

import model.Circle;
import model.Rectangle;
import model.Shape;
import processing.core.PApplet;

public class Main extends PApplet{
		private String [] arrayWords;
		private Shape shape1;
		private Rectangle rect1;
		private Circle circle1;
		int y1=30, y2=40, y3=50;

		
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());}
		
	
		public void settings() {
			size (500,500);
		}	
		
		public void setup() {
			arrayWords = loadStrings ("../data/Shapes.txt");
			System.out.println(arrayWords.length);
			shape1= new Shape(0,0,0,arrayWords); // IMPRIME EN CONSOLA LOS ELEMENTOS DEL ARREGLO
			rect1 = new Rectangle(0,0,0,arrayWords,this);
			circle1 = new Circle(0,0,0,arrayWords,this);

			
		}
		
		public void draw() {
			background(255);
			shape1.splitArray(arrayWords);
			rect1.drawRect(50, 400, y1);
			y1-=1;
			if (y1<0-y1) {
				y1=500+y1;
			}
			circle1.drawCircle(30,300,y2);
			y2+=1;
			if (y2>height+y1) {
				y2=0;
			}
			rect1.drawRect(20, 350, y3);
			y3+=1;
			if (y3>height+y1) {
				y3=0;
			}
		}	

}
