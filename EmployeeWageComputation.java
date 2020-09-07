
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int empRatePerHour=20;
		int empCheck=(int)(Math.random()*10%3);
		int empHrs=0;
		switch(empCheck) {
		case 1:
			empHrs=8;
			break;
		case 2:
			empHrs=4;
			break;
		}
		
		System.out.println(empHrs*empRatePerHour);	
	}
	
}
