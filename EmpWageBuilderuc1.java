public class EmpWageBuilderMultiCompany {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

        public static int computerEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)  {
                //Variables
                int empHrs = 0;
                int totalEmpHrs = 0;
                int totalWorkingDays = 0;
                // Computation
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
          int totalEmpWage = totalEmpHrs * empRatePerHour;
          System.out.println("Total Emp Wage: " + totalEmpWage);
          return totalEmpWage;
       }
        public static void main(String[] args) {
                computerEmpWage("DMart", 20, 2, 10);
		computerEmpWage("Reliance", 10, 4, 20);
        }
}
