public class StudentMarkTest{
	public static void main(String[]args){
	  StudentMark student1 = new StudentMark("Jumoke Joseph", 95.5);
	  StudentMark student2 = new StudentMark("Ejirooghene Joseph", 40.0);

System.out.printf("%s's grade is: %s%n", student1.getName(), student1.getGrade());
System.out.printf("%s's grade is: %s%n", student2.getName(), student2.getGrade());

	}
}