public interface ISalary {
   public int salaryToPay(int hours, int rate);
   public default int salaryForOverTime(int hours, int rate){
    return hours * rate;
   }
   public static boolean isBonus(int yearsOfExperience){
        return yearsOfExperience > 3 ? true:false;
   }
}