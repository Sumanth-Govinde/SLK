package assignments;

import java.util.Scanner;

public class assignment19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[][] a=new int[4][4];
		int i,j;		
		System.out.println("enter matrix elements");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				a[i][j]=s.nextInt();
		for(i=0;i<3;i++){
			a[i][3]=a[i][0]+a[i][1]+a[i][2];
			a[3][i]=a[0][i]+a[1][i]+a[2][i];
		}
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				if(j==3)
					System.out.print("="+a[i][j]);
				else
					System.out.print(a[i][j]+" ");
			}
			if(i==4)
				System.out.println("--------");
			System.out.println();
		}
			
	}

}
