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
        // �������� ������� ����
        Date date = new Date(); // ����� ������������ Calendar.getInstance()
 
        // ��������� ��������� �� ������ ������� ����
        Calendar currentCalendar = Calendar.getInstance();
        // ������������� �������� ��������� � ������������ � �����
        currentCalendar.setTime(date);
 
        System.out.println("Current date is: " + formatDate(currentCalendar));
 
        // ��������� ���������, ������� ����� ��� ���������� 1-� ����� ���������� ������
        // �� ������� ����
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
 
        // ��� ������������ ���������� ������ ������������� ������
        // ������ ����� (�����: 00:00:00.00), � ����� ��������� �� ��������� �����
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.MONTH, 1);
 
        System.out.println("Date for next month is: " + formatDate(calendar));
       
        // ������� ������� ����� ����� ����������� � ������������
        long diff = calendar.getTimeInMillis() - currentCalendar.getTimeInMillis();
       
        // � ��������
        long seconds = diff / 1000;
        // � �������
        long minutes = seconds / 60;
        // � �����
        long hours = minutes / 60;
        // � ����
        long days = hours / 24;
       
        System.out.println("Difference in seconds: " + seconds);
        System.out.println("Difference in minutes: " + minutes);
        System.out.println("Difference in hours: " + hours);
        System.out.println("Difference in days: " + days);
    }
}