
public class MyAnonyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISample isObj=new ISample() {
			
			String sName;


			public void open(String sName) {
				// TODO Auto-generated method stub
				this.sName=sName;
				System.out.println(this.sName+" Opening....");
			}			
			
			public void close() {
				// TODO Auto-generated method stub
				System.out.println(sName + " Closing....");
				welcome();
			}
			
			public void welcome() {
				System.out.println("Welcome to java");
				display();
				(new MyAnonyClass()).disp();
				
				//below may work if MyAnonyClass is not in main class
				//MyAnonyClass.this.disp();
			}
		};
		isObj.open("Sample.txt");
		//o.welcome(); //cannot call this
		/*
		 * Code for working with file
		 */
		isObj.close();
	}

	public static void display()
	{
		System.out.println("Static display function frm container class ");
	}
	
	public static void disp()
	{
		System.out.println("Instant disp function frm container class ");
	}
	
	interface ISample{
		public void open(String sName);
		public void close();
	}
}
