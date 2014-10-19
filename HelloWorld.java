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
		
        int years = calcYears(birthDay, checkDay);
        int months = calcMonthes(birthDay, checkDay);
        int days = calcDays(birthDay, checkDay);
        
		System.out.println("My daughter is " + years + " years "  + months + " months " + days + " days ");
		
	
	}
	private static int calcYears(GregorianCalendar birthDay, GregorianCalendar checkDay) { 
        int years = checkDay.get(GregorianCalendar.YEAR) - birthDay.get(GregorianCalendar.YEAR); 
       
        int checkMonth = checkDay.get(GregorianCalendar.MONTH); 
        int birthMonth = birthDay.get(GregorianCalendar.MONTH); 
        if ( checkMonth < birthMonth ) { 
            years --; 
        } else  if (checkMonth == birthMonth 
                && checkDay.get(GregorianCalendar.DAY_OF_MONTH) < birthDay.get(GregorianCalendar.DAY_OF_MONTH)) { 
        
            years --; 
        } 
        return years; 
    } 
	private static int calcMonthes(GregorianCalendar birthDay, GregorianCalendar checkDay) { 
    	int months = checkDay.get(GregorianCalendar.MONTH) - birthDay.get(GregorianCalendar.MONTH);
    	return months;
    }
    
    private static int calcDays(GregorianCalendar birthDay, GregorianCalendar checkDay) { 
    	int days = checkDay.get(GregorianCalendar.DATE) - birthDay.get(GregorianCalendar.DATE);
    	return days;
    }
}
