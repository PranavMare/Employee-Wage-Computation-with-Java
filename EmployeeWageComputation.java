
public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		int empRatePerHour=20;
		int wage=0;
		int totalWorkdays=0;
		int totalWorkHours=0;
		for(int i=0;i<31;i++) {
			if(totalWorkdays>=20 || totalWorkHours>=100)break;
			
			int empCheck=(int)(Math.random()*10%3);
			switch(empCheck) {
			case 1:
				totalWorkHours+=8;
				wage+=8*empRatePerHour;
				totalWorkdays++;
				break;
			case 2:
				totalWorkHours+=4;
				wage+=4*empRatePerHour;
				totalWorkdays++;
				break;
			}
		}	
		System.out.println(wage);
	}
}



