import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyLocalDate {
    public static Period calulateAge(int year, int month, int day, String zone){
        LocalDate utcDate = LocalDate.now(ZoneId.of("UTC"));
        String date = day+"-"+month+"-"+year+" 00:00:00";
        DateTimeFormatter f ;
        if(day<10 && month<10) f= DateTimeFormatter.ofPattern( "d-M-uuuu HH:mm:ss" ) ;
        else if(day<10 && month>=10) f= DateTimeFormatter.ofPattern( "d-MM-uuuu HH:mm:ss" ) ;
        else if(day>=10 && month<10) f= DateTimeFormatter.ofPattern( "dd-M-uuuu HH:mm:ss" ) ;
        else f = DateTimeFormatter.ofPattern( "dd-MM-uuuu HH:mm:ss" ) ;
        Instant ldt = LocalDateTime.parse(date, f).atZone(ZoneId.of(zone)).toInstant();
        LocalDate utcBirhtDate = ldt.atZone(ZoneId.of("UTC")).toLocalDate();
        
        return Period.between(utcBirhtDate, utcDate);
        //ZoneId.of("UTC")
        // Instant instant = Instant.now();  // gives GMT
        
    }

    public static void main(String[] args) {
        // for(String s: ZoneId.getAvailableZoneIds()){
        //     System.out.println(s);
        // }
        // System.out.println(ZoneId.systemDefault());


        // LocalDate birthDay = LocalDate.of(1993, 9, 2);
        // LocalTime nowTime = LocalTime.of(12,33,12,102);
        // LocalDateTime nowDateTime = LocalDateTime.now();
        // int ddd = birthDay.getDayOfMonth();
        // LocalDate nowDate = nowDateTime.toLocalDate();
        // Period p = Period.between(nowDate, birthDay);
       
        Scanner sc =new Scanner(System.in);
        System.out.println("enter year"); int yyyy = sc.nextInt();
        System.out.println("enter month"); int mm = sc.nextInt();
        System.out.println("enter date"); int dd = sc.nextInt();
        Period pp = calulateAge(yyyy,mm,dd,"Europe/Kirov");
        System.out.printf("age is: %d years,%d months,%d days \n",pp.getYears(),pp.getMonths(),pp.getDays());


        // System.out.printf("age is: %d years,%d months,%d days \n",p.getYears(),p.getMonths(),p.getDays());
        // System.out.println(nowDateTime);
        // System.out.println(nowDateTime.minusYears(12));
        // System.out.println(nowTime.minusHours(1200000));
        // System.out.println(birthDay.plusYears(1400));
        // System.out.println(birthDay);
        // System.out.println(ddd);

        //LocalDate utc = LocalDate.ofInstant(nowDate, MIT);
    }
}