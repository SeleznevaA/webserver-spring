package ru.pflb.webserver.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    public static boolean appendToLog(String log, String filePath) {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
            fr.write(getLogStr(log));
            fr.write("\n");
            fr.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    private static String getLogStr(String log) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDate = dateTime.format(formatter);

        return String.format("%s,%s", formatDate, log);
    }
}
