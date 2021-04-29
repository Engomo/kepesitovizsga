package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Wrong parameters!");
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
            Iterator<Map.Entry<String, String>> iterator = contacts.entrySet().iterator();

//            while (iterator.hasNext()) {
//                Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
//                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");

            for (Object key : contacts.keySet()) {
                writer.write(key.toString() + ": " + contacts.get(key) + "\n");
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }
}
