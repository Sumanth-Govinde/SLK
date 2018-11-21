package assignments;

public class assignment37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoDerived d1=new DemoDerived();
		d1.IncMethod();
		d1.disp();
	}

}
abstract class DemoClass{
	protected int var1=0;
	protected int var2=0;
	
	abstract void IncMethod();
	
}

class DemoDerived extends DemoClass{
	void IncMethod(){
		this.var1++;
		this.var2++;
	}
	void disp(){
		System.out.println("the two variables are\n variable 1:"+this.var1+"\nvariable 2:"+this.var2);
	}
}
