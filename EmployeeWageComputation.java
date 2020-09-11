
public class EmployeeWageComputation {

		public static int calucalateWage(int empCheck,int empRatePerHour){
			int wage=0;
			switch(empCheck) {
				case 1:
					wage=8*empRatePerHour;
					break;
				case 2:
					wage=4*empRatePerHour;
					break;
			}
			return wage;
		}

	public static void main(String[] args) {

		int empRatePerHour=20;
		int wage=0;
		int totalWorkdays=0;
		int totalWorkHours=0;
		for(int i=0;i<31;i++) {
			if(totalWorkdays>=20 || totalWorkHours>=100)break;

			int empCheck=(int)(Math.random()*10%3);
			/* empCheck=1---->Full Time
			   empCheck=2---->Part Time */
			wage+= calucalateWage(empCheck,empRatePerHour);

			if(empCheck==1)totalWorkHours+=8;
			if(empCheck==2)totalWorkHours+=4;
			if(empCheck==1||empCheck==2)totalWorkdays++;
		}
		System.out.println(wage);
		System.out.println(totalWorkHours);
		System.out.println(totalWorkdays);
	}
}



