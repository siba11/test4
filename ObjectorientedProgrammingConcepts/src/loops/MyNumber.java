package loops;

public class MyNumber {
	private int num;
MyNumber(int num) {
	this.setNum(num);
}

	public boolean isPrime() {
		for(int i=2;i<=getNum()-1;i++) {
		if(getNum() % i==0){
		return false;	
		}
	}
		return true;
	

}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}