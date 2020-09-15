public interface IComputeEmpWage {

	public void addCompanyEmpWage(String company , int empRatePerHour , int numOfWorkingDays , int mxHoursPerMonth);
	
	public void computeEmpWage();
	
	public int getTotalWage(String company);
}
