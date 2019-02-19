import java.time.LocalDate;
import java.time.Period;

public class DateTimeControler {


public int getAgeFromStringDate(String date){
    LocalDate birthdate = LocalDate.parse(date);
    LocalDate today = LocalDate.now();
    Period age = Period.between(birthdate,today);
    System.out.println(age);
    return age.getYears();

}
    public LocalDate dareComparator (String dl, String d2) {
    LocalDate date1 = LocalDate.parse(dl);
    LocalDate date2 = LocalDate.parse(d2);
    return date1.isBefore(date2) ? date1 : date2;}
    public static void main(String[] args) {
        DateTimeControler dtc = new DateTimeControler();
        System.out.println("Twój wiek dokładny to: " + dtc.getAgeFromStringDate("2000-10-01") + " lat");

    }

}
