package arraysPractice;

public class SteudenMarks {

	public static void main(String[] args) {
		int[] StudentMarks= {90,99 ,100};
		Student student=new Student("Madhuri",StudentMarks);
		
        int number=student.getNumberOfMarks();
        int Maxnumber=student.getMaximumMark();
        //int Minnumber=student.MinMaximumMark();
       System.out.println(number);
       int sum=student.getTotalSumofMarks();
       
       System.out.println(Maxnumber);
	}

}
