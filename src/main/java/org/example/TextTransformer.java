package org.example;

import java.io.*;
import java.util.Objects;


public class TextTransformer implements Transformable {

    @Override
    public void transform(String filein, String fileout) throws FileNotFoundException {
        try {
            FileReader csvReader = new FileReader(filein);
            BufferedReader bufCsvReader = new BufferedReader(new FileReader(filein));
            FileWriter txtWriter = new FileWriter(fileout);
            String readRow;
            String writeRow;

            while ((readRow = bufCsvReader.readLine()) != null) {
                String[] data = readRow.split(",");
                // <Сердитый (Дружелюбный)> кот <Имя> весом <n>кг.
                writeRow = (data[2].equals("true;") ? "Сердитый" : "Дружелюбный") + " кот " + data[0] + " весом " + data[1] + " кг.";
                txtWriter.append(writeRow);
                txtWriter.append("\n");
            }
            txtWriter.flush();
            txtWriter.close();
            csvReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
