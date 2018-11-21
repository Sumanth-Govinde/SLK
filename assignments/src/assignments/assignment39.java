package assignments;

public class assignment39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square(5);
		s.disp();
		Rectangle r=new Rectangle(3, 6);
		r.disp();
		

	}

}
abstract class Shape{
	abstract void calc_area();
	abstract void disp();
}
class Square extends Shape{
	int side;
	double area;
	public Square(int s){
		this.side=s;
	}
	public void calc_area(){
		this.area=this.side*this.side;
	}
	
	public void disp(){
		calc_area();
		System.out.println("area of square:"+this.area);
	}
}

class Rectangle extends Shape{
	int length;
	int breadth;
	double area;
	public Rectangle(int l,int b){
		this.length=l;
		this.breadth=b;
	}
	public void calc_area(){
		this.area=this.length*this.breadth;
	}
	
	public void disp(){
		calc_area();
		System.out.println("area of Rectangle:"+this.area);
	}
}
