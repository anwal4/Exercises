package EXERCISES.LESSON3;

import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Ex43 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        System.out.println(time.plusHours(10));
        System.out.println(offsetDateTime.minusWeeks(3));

        System.out.println(offsetDateTime
                .withOffsetSameLocal(ZoneOffset.UTC));

        System.out.println(offsetDateTime.toZonedDateTime()
                .withZoneSameInstant(ZoneId.of("America/Phoenix")));
        System.out.println(offsetDateTime
                .withOffsetSameInstant(ZoneOffset.of("-4")));
        System.out.println(ZoneId.getAvailableZoneIds());
    }
}
