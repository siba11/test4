package arraysPractice;

public class Student {
    public static String schoolName;
	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name=name;
		this.marks=marks;
		
	}

	public int getNumberOfMarks() {
		
		return marks.length;
	}

	public int getTotalSumofMarks() {
		int sumofmarks=0;
		for(int i=0;i<marks.length;i++) {
			sumofmarks=marks[i]+sumofmarks;
		}
			
	   return sumofmarks;
	}

	public int getMaximumMark() {
		int Minnumber=0;
		for(int i=0;i<marks.length;i++) {
		if (marks[i]<Minnumber){
			Minnumber=marks[i];
		}
		       	
	}
		return Minnumber;
}

	public int MinMaximumMark() {
		int Minnumber=Integer.MAX_VALUE;
		System.out.println(Integer.MAX_VALUE);
		for(int i=0;i<marks.length;i++) {
		if (marks[i]<Minnumber){
			Minnumber=marks[i];
		}
		       	
	}
		return Minnumber;
	}
}