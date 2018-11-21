package assignments;

public class assignment33 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		System.out.println("entre the number of items");
		if(calc(n))
			System.out.println("20%discount");
		else
			System.out.println("10% discount");
		
	}
	static boolean calc(int n){
		return n>2?true:false;
	}

}
