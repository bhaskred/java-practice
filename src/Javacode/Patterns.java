package Javacode;

/*1 1 2 3 4 5 6 7 56 57 58 59 60 61 62 
  2 2 1 2 3 4 5 6 7 70 71 72 73 74 75 76 
  3 3 3 1 2 3 4 5 6 7 84 85 86 87 88 89 90 
  4 4 4 4 1 2 3 4 5 6 7 98 99 100 101 102 103 104 
  5 5 5 5 5 1 2 3 4 5 6 7 112 113 114 115 116 117 118 
  6 6 6 6 6 6 1 2 3 4 5 6 7 126 127 128 129 130 131 132 
  7 7 7 7 7 7 7 1 2 3 4 5 6 7 140 141 142 143 144 145 146 
*/
/*import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int count=n*n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print(i +" ");
		}

			for(int j=1; j<=n; j++) {
			System.out.print(j +" ");
			count++;
		}
			for(int j=1; j<=n; j++) {
			System.out.print(count + " ");
			count= 1+count;
			}
			System.out.println();
		}	
	}
}
*/
/*
1 6 11 17 21
public class Patterns {
	public static void main(String[] args) {
		int count=1;
		for(int i=1; i<=5; i++) {
			System.out.print(count + " ");	
			count=count+5;
		}
			
	}
}
*/
/*
25 20 15 10 5
public class Patterns {
	public static void main(String[] args) {
		int count=25;
		for(int i=1; i<=5; i++) {
			System.out.print(count + " ");	
			count=count-5;
		}
			
	}
}
*/
/*
//1 2 3 4 5 
public class Patterns {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");	
		}
			
	}
}
*/

/*
GQT GQT GQT GQT GQT 
GQT GQT GQT GQT GQT 
GQT GQT GQT GQT GQT 
GQT GQT GQT GQT GQT 
GQT GQT GQT GQT GQT 
public class Patterns {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			System.out.print("GQT ");	
		}
			System.out.println();
		}	
	}
}
*/
/*
* 
* * 
* * * 
* * * * 
* * * * *  

public class Patterns {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("* ");	
		}
			System.out.println();
		}	
	}
}
*/
/*
* * * * * 
* * * * 
* * * 
* * 
*  

public class Patterns {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
			System.out.print("* ");	
		}
			System.out.println();
		}	
	}
}
*/

/*
              * # # # # # # # 0 
            * * # # # # # # # 0 0 
          * * * # # # # # # # 0 0 0 
        * * * * # # # # # # # 0 0 0 0 
      * * * * * # # # # # # # 0 0 0 0 0 
    * * * * * * # # # # # # # 0 0 0 0 0 0 
  * * * * * * * # # # # # # # 0 0 0 0 0 0 0  
*/
/*
public class Patterns {
	public static void main(String[] args) {
		int n=7;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("* ");	
		}
			for(int j=i; j<=n-1; j++) {
			System.out.print("  ");	
		}
			for(int j=1; j<=n; j++) {
			System.out.print("# ");	
		}
			for(int j=i; j<=n; j++) {
			System.out.print("0 ");	
		}
			for(int j=1; j<=i-1; j++) {
			System.out.print("  ");	
		}
			for(int j=1; j<=n; j++) {
			System.out.print("# ");	
		}
			for(int j=1; j<=i-1; j++) {
			System.out.print("  ");	
		}
			for(int j=i; j<=n; j++) {
			System.out.print("* ");	
		}
			for(int j=1; j<=n; j++) {
			System.out.print("# ");	
		}
			for(int j=i; j<=n-1; j++) {
			System.out.print("  ");	
		}
			for(int j=1; j<=i; j++) {
			System.out.print("0 ");	
		}
			System.out.println();
		}
	}
}
*/
import java.util.Scanner;

public class Patterns {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int count = 1;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
		System.out.print("*" +" ");
		}
			for (int j=i; j<n; j++) {
		System.out.print("@" +" ");
		}
			for (int j=i; j<=n; j++) {
		System.out.print("*" +" ");
		}
			for (int j=1; j<i; j++) {
		System.out.print("@" +" ");
		}
		System.out.println();	
	}
}
}

