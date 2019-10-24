package ru.pflb.webserver.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    public static boolean appendToLog(String log, String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            initFile(filePath);
        }

        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);

            fr.write("\n");
            fr.write(getLogStr(log));
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

    private static boolean initFile(String filePath) {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
            fr.write("dateTime,logData");
            fr.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
