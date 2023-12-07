package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Connection {
	public static void read(String csvpath) {
        String filePath = csvpath;

        List<String[]> records = new ArrayList<>();
        try {
            Path path = FileSystems.getDefault().getPath(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(path.toString()));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                records.add(values);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Menampilkan hasil pembacaan file CSV
        for (String[] record : records) {
            for (String value : record) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
