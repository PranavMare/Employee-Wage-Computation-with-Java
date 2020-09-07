
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Wage Computation");
		
		int empCheck=(int)(Math.random()*10%2);
		if(1==empCheck)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");	
		
		int wageperHour=20;
		int fullTimeHour=8;
		int fulltimewage=0;
		if(empCheck==1) {
			System.out.println(fulltimewage=wageperHour*fullTimeHour);
			
		}				
		
		int partTimeHour=4;
		int partimeCheck=(int)(Math.random()*10%2);
		int parttimeWage=0;
		if(partimeCheck==1) {
			System.out.println(parttimeWage=partTimeHour*wageperHour);
		}
		
		
	}
	
}
