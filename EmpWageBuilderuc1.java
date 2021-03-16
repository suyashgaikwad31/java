public class EmpWageBuilderObject {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private final int totalEmpWage;

    public EmpWageBuilderObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)  {

                this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this. maxHoursPerMonth =  maxHoursPerMonth;
    }

    public void computerEmpWage() {
	//variable
	int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
	//Computation
        while (totalEmpHrs <= maxHoursPerMonth &&
                        totalWorkingDays < numOfWorkingDays) {
                   totalWorkingDays++;
                int empcheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empcheck) {
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
          }
          totalEmpWage = totalEmpHrs * empRatePerHour;
       }
	@Override
	public String toString() {
	   return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
        }
        public static void main(String[] args) {
              EmpWageBuilderObject dMart = new EmpWageBuilderObject("DMart", 20, 2, 10);
	      EmpWageBuilderObject reliance = new EmpWageBuilderObject("Reliance", 10, 4, 20);
	      dMart.computerEmpWage();
	      System.out.println(dMart);
	      reliance.computerEmpWage();
	      System.out.println(reliance);

        }


}
