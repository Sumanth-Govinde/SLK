
public class MyExceptionClass {
	public static void main(String args[]) throws Exception{

//	public static void main(String[] args) {
		int x,y,total=0;
		x=100;
		y=0;
		
		try{
			y=Integer.parseInt(args[0]);
			total=x/y;
		}catch(ArithmeticException e){
			System.out.println("Could not divide number by zero");
			return;
		}catch(NumberFormatException e1){
			System.out.println("Not a proper number");
			return;
		}catch (ArrayIndexOutOfBoundsException aiobe) {
			// TODO: handle exception
			System.out.println("Zero arguments passed");
			//throw aiobe;
			throw new Exception("sss",new Throwable());
			
		}catch (Exception e3) {
			// TODO: handle exception
			System.out.println("X: "+x);
			System.out.println("Y: "+y);
		}
		System.out.println("Total: "+total);
	}

}
