package cgcc.cs260.AP_wk3;


public class MainEntry {
	
	public static void main(String[] args) {
		Algos algos = new Algos();
		Matrix matrix = new Matrix();
		algos.create();
		algos.display();
		System.out.println(" ");
		matrix.matTri();
		matrix.matGls();
		System.out.println(" ");
		algos.create2();
		algos.display();
		System.out.println(" ");
		algos.create3();
		algos.display2();
		
	}
        
}
