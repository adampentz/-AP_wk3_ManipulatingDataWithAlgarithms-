package cgcc.cs260.AP_wk3;

/** 
 * Create 2d image and then rotate it 0, 90, 180, and 270 degrees 
 */
		
public class Algos {
	/**
	 * member to store data array
	 */
    char[][] arr = new char[8][16];
    
    /** 
     * fill the 2d array with the triangle and glass
     */
    public void create() {    	
    	fillTriangle();
    	fillGlass();
    }
    public void create2() {  
    	twist180();
    }
    public void create3() {  
    	//flipTri270();
    	printArray270();
    }
    /**
     * print the 2d array to console
     */
	public void display() {
		for (int r = 0; r < 8; r++)
	    {
	        for (int c = 0; c < 16; c++)
	        {
	        	System.out.print(arr[r][c]);
	        }
	        System.out.println();
	    }
		
	}
	//flip inversely
	public void display2() {
		for (int r = 0; r < 8; r++)
	    {
	        for (int c = 0; c < 16; c++)
	        {
	        	System.out.print(arr[r][c]);
	        }
	        System.out.println();
	    }
		
	}
    
    /**
     * look at left side of array columns and fill with triangle
     */
    private void fillTriangle() {
	    for (int r = 0; r < 8; r++)
	    {
	        for (int c = 0; c < 8; c++)
	        {
	
	            if (r < c)
	            {
	                arr[r][c] = ' ';
	            }
	            else
	            {
	                arr[r][c] = '*';
	            }
	
	        }
	    }
    }

    /**
     * look at right side of array and fill with glass
     */
    private void fillGlass() {
	    for (int r = 0; r < 8; r++)
	    {
	        for (int c = 8; c < 16; c++)
	        {
	            if (r == 0)
	            {
	                arr[r][c] = '*';
	            }
	            else if (r == 1 && c > 8 && c < 15)
	            {
	                arr[r][c] = '*';
	            }
	            else if (r == 2 && c > 9 && c < 14)
	            {
	                arr[r][c] = '*';
	            }
	            else if (r > 2 && r < 7 && c > 10 && c < 13)
	            {
	                arr[r][c] = '*';
	            }
	            else if (r == 7 && c > 9 && c < 14)
	            {
	                arr[r][c] = '*';
	            }
	            else
	            {
	                arr[r][c] = ' ';
	            }
	        }
	    }
    }
    
    private void twist180() {
    	// turn image 90 degrees 
    	/**i want to print original image
    	 * then turn original 90 degrees
    	 * by changing to orinetation of the char array 
    	 */
    	//triangle
    	
    	for (int r = 0; r < 8; r++)
	    {
	        for (int c = 0; c < 16; c++)
	        {
	        	if (r > c)
	            {
	                arr[r][c] = ' ';
	            }
	            else
	            {
	                arr[r][c] = '*';
	            }
	        	
	        }
	    }
    	
    	//glass
    	
    	for (int r = 0; r < 8; r++)
	    {
	        for (int c = 8; c < 16; c++)
	        {
	            if (r == 0 && c > 9 && c < 14)
	            {
	                arr[r][c] = '*';
	            }
	
	            else if (r < 5 && r > 0 && c > 10 && c < 13)
	            {
	                arr[r][c] = '*';
	            }
	            
	            else if (r == 5 && c > 9 && c < 14)
	            {
	                arr[r][c] = '*';
	            }
	            
	            else if (r == 6 && c > 8 && c < 15)
	            {
	                arr[r][c] = '*';
	            }
	            
	            else if (r == 7 && c > 7 && c < 16)
	            {
	                arr[r][c] = '*';
	            }
	            else
	            {
	                arr[r][c] = ' ';
	            }
	        }
	    }
    	
	}
    
    //flip triangle 270 degrees
    private void flipTri270() {
    	for (int r = 0; r < 8; r++)
	    {
	        for (int c = 0; c < 16; c++)
	        {
	        	if (r < 8 && c < 8)
	            {
	                arr[r][c] = ' ';
	            }
	            else
	            {
	                arr[r][c] = '*';
	            }
	        	
	        }
	    }
    }
    
    //fix from class
    private char[][] transpose(){
		char[][] temp = new char[16][8];
		
		for(int r = 0; r < 16; r++) {
			for(int c = 0; c < 8; c++) {
				temp[r][c] = arr[c][r];
			}
		}
		
		return temp;
	}
	public void printArray270() {
		char[][] temp = transpose();
		for(int r = 15; r >= 0; r--) {
			for(int c = 0; c < 8; c++) {
				System.out.print(temp[r][c]);
			}
			System.out.println();
		}
	}
}