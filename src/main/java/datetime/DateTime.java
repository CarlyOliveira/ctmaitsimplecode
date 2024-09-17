package main.java.datetime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTime {

    public static void main(String[] args) {
    
        // with zone and offset
        var t = ZonedDateTime.now(ZoneId.of("UTC")).toString();
        System.out.println("ZonedDateTime: " + t);

        // only offset
        var s = ZonedDateTime.now(ZoneOffset.UTC).toString();
        System.out.println("ZonedDateTime with pattern OffSet  " + s);

        // izi parse
        var tx = ZonedDateTime.parse(t);
        System.out.println("no problem for parse with offset and zone" + tx);

        //izi parse
        var sx = ZonedDateTime.parse(s);
        System.out.println("no problem for parse with only offset: " + sx);

        // izi change zoned for offset
        var to = tx.toOffsetDateTime();

        // but i wanna work without zone
        System.out.println("No problem, ZonedDateTime parsed to OffsetDateTime: " + to);
    }
}
