package io.github.anantharajuc.java.date_time;

import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * https://www.baeldung.com/java-8-date-time-intro
 */
@Log4j2
public class DateTime {
    public static void main(String[] args) {

        /*instance of current date created from the system clock.*/
        LocalDate localDate = LocalDate.now();

        log.info("localDate "+ localDate);
        log.info("localDate.getDayOfMonth     : "+ localDate.getDayOfMonth());
        log.info("localDate.getDayOfWeek      : "+ localDate.getDayOfWeek());
        log.info("localDate.getMonthValue     : "+ localDate.getMonthValue());
        log.info("localDate.getMonth          : "+ localDate.getMonth());
        log.info("localDate.lengthOfMonth     : "+ localDate.lengthOfMonth()+" \n");

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        log.info("LocalDate.now().plusDays(1) : "+ tomorrow);

        LocalTime localTime = LocalTime.now();
        log.info("localTime                   : "+ localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("localDateTime               : "+ localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = localDateTime.format(dateTimeFormatter);
        log.info("dd-MM-yyyy HH:mm:ss         : "+ formattedDateTime);
    }
}
