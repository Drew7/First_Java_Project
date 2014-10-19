import java.util.Date;
import java.util.GregorianCalendar; 
public class HelloWorld {

	public static void main(String[] args) {
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
        int months = calcMonthes(birthDay, checkDay, birthMonth, checkMonth);
        int days = calcDays(birthDay, checkDay);
        
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
	private static int calcMonthes(GregorianCalendar birthDay, GregorianCalendar checkDay, int birthMonth, int checkMonth) { 
    	
        int months;
		if (checkMonth < birthMonth){
			months = checkMonth;
		} else {
			months = checkMonth - birthMonth;
		};
		return months;
    }
    
    private static int calcDays(GregorianCalendar birthDay, GregorianCalendar checkDay) { 
    	int days = checkDay.get(GregorianCalendar.DAY_OF_YEAR) - birthDay.get(GregorianCalendar.DAY_OF_YEAR);
    	return days;
    }
}
