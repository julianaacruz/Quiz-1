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
		int y1=30, y2=40, y3=50, y4=200, y5=100, y6=50, y7=300;

		
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
			if (y1<0) {
				y1=500;
			}
			circle1.drawCircle(30,300,y2);
			y2+=1;
			if (y2>height) {
				y2=0;
			}
			rect1.drawRect(20, 350, y3);
			y3+=1;
			if (y3>height) {
				y3=0;
			}
			circle1.drawCircle(10,100,y4);
			y4-=1;
			if (y4<0) {
				y4=500;
			}
			
			circle1.drawCircle(60,250,y5);
			y5+=1;
			if (y5>height) {
				y5=0;}
			
			rect1.drawRect(80, 50, y6);
			y6+=1;
			if (y6>height) {
				y6=0;
			}
			
			rect1.drawRect(10, 100, y7);
			y7-=1;
			if (y7<0) {
				y7=500;
			}
		}	
		
		public void mousePressed(){
			if (mouseButton== RIGHT) {
				boolean p=true;
				if(p==true) {
				rect1.drawRect((int)random(100),(int)random(500),(int)random(500));}
			}
			
		}

}
