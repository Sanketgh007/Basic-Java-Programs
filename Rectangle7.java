import java.awt.*;
public class Rectangle7 {
	    private double height;
	    private double width;
	    public  Rectangle7(double height,double width){
	        this.height=height;
	        this.width=width;
	    }
	    public double getheight(){
	        return height;
	    }
	    public void setheight(double height){
	        //this.height=height;
	    }
	    public  double getWeidth(){
	        return width;
	    }
	    public void setWeidth(double width){
	        this.width=width;
	    }
	    public double getArea(){
	        return height*width;
	    }
	    public double getPerimeter(){
	        return 2*(height+width);
	    }
	    public static void main(String[] args) {
	        Rectangle7 r1 = new Rectangle7(7,12);
	        Rectangle7 r2 = new Rectangle7(10,12);
	        System.out.println(r2.getArea());
	        r1.setheight();
	        System.out.println(r1.getheight());

	    }
	}

