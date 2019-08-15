package arraysPractice1;

import arraysPractice.Student;

public class SteudenMarks {

	public static void main(String[] args) {
		int[] StudentMarks= {90,99,100};
		String[] DaysofTheWeek= {"Mo","Tue","Wed","Thu","Fri","sat","Sun"};
		
		String Minmuncharday=" ";
		for(int i=0;i<DaysofTheWeek.length;i++) {
			if(DaysofTheWeek[i].length()>Minmuncharday.length()) {
				Minmuncharday=DaysofTheWeek[i];
			
			}
		}
		System.out.println(Minmuncharday);
		Student student=new Student("Madhuri",StudentMarks);
		student.schoolName="Test";
        int number=student.getNumberOfMarks();
        int Maxnumber=student.getMaximumMark();
        int Minnumber=student.MinMaximumMark();
        
      // System.out.println(number);
       int sum=student.getTotalSumofMarks();
       
       //System.out.println(Minnumber);
       Student student1=new Student("Madhuri",StudentMarks);
       System.out.println(student1.schoolName);
	}

}
