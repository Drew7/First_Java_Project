import java.util.Date;
import java.util.GregorianCalendar; 
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("*    * ***** *     *      ****     *   *     *     ***** *****  **");
		System.out.println("*    * *     *     *     *    *    *  *     * *      *   *      **");
		System.out.println("****** ***** *     *     *    *    **      *****     *   *****  **");
		System.out.println("*    * *     *     *     *    *    *  *   *     *    *   *      ");
		System.out.println("*    * ***** ***** *****  ****  ,, *   * *       *   *   *****  **");
		System.out.println("                                 ,");
		
		
		GregorianCalendar birthDay = new GregorianCalendar(2012,07,20);
		GregorianCalendar checkDay = new GregorianCalendar();
		Date currentDate = checkDay.getInstance().getTime();
		checkDay.setTime(currentDate);
		
		int checkMonth = checkDay.get(GregorianCalendar.MONTH); 
        int birthMonth = birthDay.get(GregorianCalendar.MONTH);
        
        int years = calcYears(birthDay, checkDay, birthMonth, checkMonth);
        int months = calcMonths(birthDay, checkDay, birthMonth, checkMonth);
        int days = calcDays(birthDay, checkDay, birthMonth, checkMonth);
        
		System.out.println("My daughter is " + years + " years "  + months + " months " + days + " days ");
		
	
	}
	private static int calcYears(GregorianCalendar birthDay, GregorianCalendar checkDay, int birthMonth, int checkMonth) { 
        int years = checkDay.get(GregorianCalendar.YEAR) - birthDay.get(GregorianCalendar.YEAR); 
             
        if ( checkMonth < birthMonth ) { 
            years --; 
        } else  if (checkMonth == birthMonth 
                && checkDay.get(GregorianCalendar.DAY_OF_MONTH) < birthDay.get(GregorianCalendar.DAY_OF_MONTH)) { 
        
            years --; 
        } 
        return years; 
    } 
	private static int calcMonths(GregorianCalendar birthDay, GregorianCalendar checkDay, int birthMonth, int checkMonth) { 
    	
        int months;
		if (checkMonth < birthMonth){
			months = checkMonth;
		} else {
			months = checkMonth - birthMonth;
		};
		return months;
    }
    
    private static int calcDays(GregorianCalendar birthDay, GregorianCalendar checkDay, int birthMonth, int checkMonth) { 
    	    	
    	int days;// = checkDay.get(GregorianCalendar.DAY_OF_YEAR) - birthDay.get(GregorianCalendar.DAY_OF_YEAR);
		int checkDayOfMonth = checkDay.get(GregorianCalendar.DAY_OF_MONTH);
		int checkDayOfBirth = birthDay.get(GregorianCalendar.DAY_OF_MONTH);
    	
    	if (checkMonth == birthMonth){
    		if(checkDayOfMonth<checkDayOfBirth ){
    			days = checkDayOfMonth; 
    		} else {
    			days = checkDayOfMonth - checkDayOfBirth;
    		}; 
    	} else if (checkMonth < birthMonth){
    		days = checkDayOfMonth;
    	} else {
    		
    		int daysInBirthMonth;
            switch (birthMonth) {
                case 1:  daysInBirthMonth = 31;
                         break;
                case 2:  daysInBirthMonth = 28;
                         break;
                case 3:  daysInBirthMonth = 31;
                         break;
                case 4:  daysInBirthMonth = 30;
                         break;
                case 5:  daysInBirthMonth = 31;
                         break;
                case 6:  daysInBirthMonth = 30;
                         break;
                case 7:  daysInBirthMonth = 31;
                         break;
                case 8:  daysInBirthMonth = 31;
                         break;
                case 9:  daysInBirthMonth = 30;
                         break;
                case 10: daysInBirthMonth = 31;
                         break;
                case 11: daysInBirthMonth = 30;
                         break;
                case 12: daysInBirthMonth = 31;
                         break;
                default: daysInBirthMonth = 30;
                         break;
            }
    		days = checkDayOfMonth + daysInBirthMonth - checkDayOfBirth;
    	};
    	
    	return days;
    }
}
