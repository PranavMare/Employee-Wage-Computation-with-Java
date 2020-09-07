
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Wage Computation");
		
		int isPresent=1;
		int empCheck=(int)(Math.random()*10%2);
		if(isPresent==empCheck)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");	
		
		int wageperHour=20;
		int fullDayHour=8;
		int wage=0;
		if(empCheck==1) {
			wage=wageperHour*fullDayHour;
		}				
	}
}
