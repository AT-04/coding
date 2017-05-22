package org.fundacionjala.coding.abel;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by AbelBarrientos on 5/22/2017.
 */
public class ReadFile {

    /**
     *
     */
    public ReadFile() {

    }

    /**
     *
     * @param fileName param
     * @return String
     */
    public String read(String fileName) {
        final StringBuffer stringBuffer = new StringBuffer();
        try {
            List<String> allLines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

            allLines.forEach(stream -> stringBuffer.append(stream));

            return stringBuffer.toString();
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }
}
