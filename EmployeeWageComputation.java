
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int empRatePerHour=20;
		int empHrs=0;
		int wage=0;
		int totalempHours=0;
		
		for(int i=0;i<30;i++) {
		
			if(totalempHours>=100)break;
			
			int empCheck=(int)(Math.random()*10%3);
			switch(empCheck) {
			case 1:
				empHrs=8;
				wage+=empHrs*empRatePerHour;
				totalempHours+=empHrs;
				break;
			case 2:
				empHrs=4;
				wage+=empHrs*empRatePerHour;
				totalempHours+=empHrs;
				break;
			}
		}
		
		System.out.println(wage);	
	}
	
}
