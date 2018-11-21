package assignments;

import java.util.Scanner;

public class assignment20 {
	int[][] a;
	int m;
	int n;
	public assignment20(int r,int c){
		a=new int[r+1][c+1];
		m=r;
		n=c;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int m=s.nextInt();
		int n=s.nextInt();
		boolean f=true;
		assignment20 a1=new assignment20(m,n);	
		System.out.println("enter matrix elements");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a1.a[i][j]=s.nextInt();
		char c;
		
		while(f){
			System.out.println("enter your choice");
			c=s.next().charAt(0);
		switch(c){
			case 'a':a1.display();
					break;
			case 'b':a1.total();
					break;
			case 'c':System.out.println("enter the row to reverse:");
					int r=s.nextInt();
					a1.rRev(r);
					break;
			case 'd':System.out.println("enter the column to reverse:");
					r=s.nextInt();
					a1.cRev(r);
					break;
			case 'e':for(int i=0;i<n;i++)
						a1.cRev(i);
					a1.display();
					break;
			case 'f':for(int i=0;i<n;i++)
						a1.rRev(i);
					a1.display();
					break;
			case 'g':System.out.println("enter 1 for row sort , 2 for column sort");
					r=s.nextInt();
					if(r==1){
						System.out.println("enter row to be sorted");
						int ss=s.nextInt();
						a1.sort(r,ss);
						break;
					}
					else if(r==2){
						System.out.println("enter row to be sorted");
						int ss=s.nextInt();
						a1.sort(r,ss);
					}
						
			case 'h':f=false;
			}
		}
	}
	public void display(){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
					System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	
	public void total(){
		int i,j;
		for(i=0;i<m;i++)
			for(j=0;j<n;j++){
				a[i][m]+=a[i][j];
				a[m][i]+=a[j][i];
			}
	for(i=0;i<m+1;i++){
			for(j=0;j<n+1;j++){
				if(j==m)
					System.out.print("="+a[i][j]);
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void rRev(int r){
		 int t;
		 for(int j=0;j<n/2;j++){
			 t=a[r][j];
			 a[r][j]=a[r][n-j-1];
			 a[r][n-j-1]=t;
		 }
		 display();
	 }
	 public void cRev(int c){
		 int t;
		 for(int j=0;j<m/2;j++){
			 t=a[j][c];
			 a[j][c]=a[c][m-j-1];
			 a[c][m-j-1]=t;
		 }
		 display();
	 }
	 public void sort(int r,int ss){
		 if(r==1){
			 for(int i=0;i<m;i++)
				 for(int j=i+1;j<m;j++)
					 if(a[ss][j]<a[ss][i])
					 {
						 int t=a[ss][j];
						 a[ss][j]=a[ss][i];
						 a[ss][i]=t;
					 }
		 }
	 }
}
