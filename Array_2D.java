package percentage_calculator;

import java.util.Scanner;

public class Array_2D {
   public static void main(String args[]) {
	   
	   //advance Q-> Print the spiral order matrix
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter numbr of rows and column:");
	   int row = sc.nextInt();
	   int col = sc.nextInt();
	   int matrix[][] = new int[row][col];
	   
	   System.out.println("Enter values");
	   for(int i=0; i<row;i++) {
		   for(int j=0;j<col;j++) {
			   matrix[i][j] = sc.nextInt();
		   }
	   }
	   
	   System.out.println("The Spiral Order matrix is: ");
	   int rowStart =0;
	   int rowEnd =row-1;
	   int colStart =0;
	   int colEnd = col-1;
	   
	   // to print spiral order matrix
	   while(rowStart<=rowEnd && colStart<=colEnd) {
		   //1
		   for(int column=colStart;column<=colEnd;column++) {
			   System.out.print(matrix[rowStart][column]+" ");
		   }
		   rowStart++;
		   
		   //2
		   for(int R=rowStart;R<=rowEnd;R++) {
			   System.out.print(matrix[R][colEnd]+" ");
		   }
		   colEnd--;
		   
		   //3
		   for(int column=colEnd;column>=colStart;column--) {
			   System.out.print(matrix[rowEnd][column]+" ");
		   }
		   rowEnd--;
		   
		   //4
		   for(int R=rowEnd;R>=rowStart;R--) {
			   System.out.print(matrix[R][colStart]+" ");
		   }
		   colStart++;
		   System.out.println();
	   }
	   
   }
	
}
