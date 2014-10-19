import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
 

public class DatesSubstraction {
 
    private static String formatDate(Calendar calendar) {
        Formatter formatter = new Formatter();
        formatter.format(" %1$tF %1$tr", calendar);
        return formatter.toString();
    }
 
    public static void main(String[] args) {
        // Получаем текущую дату
        Date date = new Date(); // Лучше использовать Calendar.getInstance()
 
        // Формируем календарь на основе текущей даты
        Calendar currentCalendar = Calendar.getInstance();
        // Устанавливаем значение календаря в соответствии с датой
        currentCalendar.setTime(date);
 
        System.out.println("Current date is: " + formatDate(currentCalendar));
 
        // Формируем календарь, который будет нам показывать 1-е число следующего месяца
        // от текущей даты
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
 
        // Для формирования следующего месяца устанавливаем сначал
        // первое число (время: 00:00:00.00), а потом переходим на следующий месяц
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.MONTH, 1);
 
        System.out.println("Date for next month is: " + formatDate(calendar));
       
        // Находим разницу между двумя календарями в милисекундах
        long diff = calendar.getTimeInMillis() - currentCalendar.getTimeInMillis();
       
        // в секундах
        long seconds = diff / 1000;
        // в минутах
        long minutes = seconds / 60;
        // в часах
        long hours = minutes / 60;
        // в днях
        long days = hours / 24;
       
        System.out.println("Difference in seconds: " + seconds);
        System.out.println("Difference in minutes: " + minutes);
        System.out.println("Difference in hours: " + hours);
        System.out.println("Difference in days: " + days);
    }
}