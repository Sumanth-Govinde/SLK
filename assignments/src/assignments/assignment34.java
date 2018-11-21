package assignments;

public class assignment34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b=new book();
		b.assign_details();
		b.Disp();

	}

}
class publisher{
	String pName="noName";
	public void Disp(){
		System.out.println("Publisher name:"+pName);
	}
	
}
class book extends publisher{
	String bName;
	double price;
	public void Disp(){
		System.out.println("book name:"+bName);
		System.out.println("price :"+price+"Rs");
		super.Disp();
	}
	public void assign_details(){
		this.bName="Wutering Heights";
		this.price=35.75;
	}
}
