
public class runinterface {

	public static void main(String[] args) {
		Flyable[] flyingobjects={new Bird(),new Aeroplane()};
		System.out.println(flyingobjects.length);
		for(int i=0;i<flyingobjects.length;i++) {
			flyingobjects[i].fly();
			
		}

}
}
