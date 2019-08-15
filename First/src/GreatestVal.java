
public class GreatestVal {
private int[] x;
	public GreatestVal(int[] x) {
		this.x=x;
		
		
	}

 public int greatestnum() {
	 int greayetestnumber=0;
	 for (int i=0;i<x.length;i++) {
		 if(greayetestnumber<x[i]) {
			 greayetestnumber=x[i];
	 }
	 
 }
	 return greayetestnumber;
}
}
