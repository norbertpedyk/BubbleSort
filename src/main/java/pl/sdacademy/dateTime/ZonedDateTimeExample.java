package pl.sdacademy.dateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        String[] timeZones = TimeZone.getAvailableIDs();
        //for (String timeZone : timeZones) {
           // System.out.println(timeZone);
        // UTC, Europe/London, US/Central, Asia/Calcutta, Europe/Warsaw, GMT+1
        //}
        String[] dates = new String[]{
                "1999-12-31T23:30",
                "2015-02-28T17:45",
                "2015-07-21T17:45",
        };

        LocalDateTime[] times = new LocalDateTime[dates.length];
        for (int i = 0; i < dates.length; i++) {
            times[i] = LocalDateTime.parse(dates[i]); // zmienia stringi z dates[] na format LocalDateTime i umieszcza w times[]
            System.out.println("LocalDateTime: " + times[i]);
        }
        ZoneId utc = ZoneId.of("UTC");
        ZoneId[] zoneIds = new ZoneId[] {
                ZoneId.of("Europe/London"),
                ZoneId.of("US/Central"),
                ZoneId.of("Asia/Calcutta"),
                ZoneId.of("Europe/Warsaw"),
                ZoneId.of("GMT+1"),
        };
        for (LocalDateTime localDateTime : times) {
            ZonedDateTime utcDateTime = ZonedDateTime.of(localDateTime, utc); //dodaje nam do elementu dates[i] strefe czasową podaną w zoneIds[i]
            System.out.println("ZonedDateTime: " + utcDateTime);
            Instant timeStamp = utcDateTime.toInstant(); //Zmienia nam utcDateTime na Instant(time stamp) (w pętli tylko)
            //System.out.println(timeStamp); // 2015-02-28T17:45:00Z
            for (ZoneId zoneId : zoneIds) {
                ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(timeStamp, zoneId);
                System.out.printf("Instant ZonedDateTime: %s - %s\n", utcDateTime, zonedDateTime);
            }
        }



    }
}
