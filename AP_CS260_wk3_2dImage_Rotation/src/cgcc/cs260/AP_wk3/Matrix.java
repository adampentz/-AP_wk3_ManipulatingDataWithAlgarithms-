package cgcc.cs260.AP_wk3;

public class Matrix {
	//180 degree triangle
	public void matTri() {
	final String[][] matrix = {
	         { "*", "*", "*", "*", "*", "*", "*", "*" },
	         { "*", "*", "*", "*", "*", "*", "*", " " },
	         { "*", "*", "*", "*", "*", "*", " ", " " },
	         { "*", "*", "*", "*", "*", " ", " ", " " },
	         { "*", "*", "*", "*", " ", " ", " ", " " },
	         { "*", "*", "*", " ", " ", " ", " ", " " },
	         { "*", "*", " ", " ", " ", " ", " ", " " },
	         { "*", " ", " ", " ", " ", " ", " ", " " },
	         { " ", " ", " ", " ", " ", " ", " ", " " },
	      };
	      for (int i = 0; i < matrix.length; i++) {         //this equals to the row in our matrix.
	         for (int j = 0; j < matrix[i].length; j++) {   //this equals to the column in each row.
	            System.out.print(matrix[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	      }
	}
	//90 degree glass
	public void matGls() {
		final String[][] matrix = {
		         { " ", " ", " ", " ", " ", " ", "*", " " },
		         { " ", " ", " ", " ", " ", " ", "*", " " },
		         { " ", " ", " ", " ", " ", "*", "*", " " },
		         { "*", " ", " ", " ", "*", "*", "*", " " },
		         { "*", "*", "*", "*", "*", "*", "*", " " },
		         { "*", "*", "*", "*", "*", "*", "*", " " },
		         { "*", " ", " ", " ", "*", "*", "*", " " },
		         { " ", " ", " ", " ", " ", "*", "*", " " },
		         { " ", " ", " ", " ", " ", " ", "*", " " },
		         { " ", " ", " ", " ", " ", " ", "*", " " }
		      };
		      for (int i = 0; i < matrix.length; i++) {         
		         for (int j = 0; j < matrix[i].length; j++) {   
		            System.out.print(matrix[i][j] + " ");
		         }
		         System.out.println(); 
		      }
		}
}
