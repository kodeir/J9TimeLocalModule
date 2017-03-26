package com.example.timelocal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Sergei "Kodeir" Riabinin on 26/03/17.
 */
public class TimeLocal {

    public static String now() {
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now());
    }
}
