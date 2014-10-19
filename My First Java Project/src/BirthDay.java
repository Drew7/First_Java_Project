import java.util.GregorianCalendar; 
public class BirthDay { 
    
	public static void main(String[] args) { 
       
		GregorianCalendar birthDay = new GregorianCalendar(1986,02,07); 
   
		GregorianCalendar checkDay = new GregorianCalendar(2014,10,10); 
       
        int years = calcYears(birthDay, checkDay);
        int monthes = calcMonthes(birthDay, checkDay);
        int days = calcDays(birthDay, checkDay);
 
        System.out.println("¬ам исполнилось: " + years + " лет " + monthes + " мес€цев " + days + " дней "); 
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
    	int monthes = checkDay.get(GregorianCalendar.MONTH) - birthDay.get(GregorianCalendar.MONTH);
    	return monthes;
    }
    
    private static int calcDays(GregorianCalendar birthDay, GregorianCalendar checkDay) { 
    	int days = checkDay.get(GregorianCalendar.DATE) - birthDay.get(GregorianCalendar.DATE);
    	return days;
    }}