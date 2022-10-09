package org.example;

import java.io.*;

public class StreamTransformer implements Transformable {
    @Override
    public void transform(String filein, String fileout) throws FileNotFoundException {
        String readRow;
        String writeRow;
        try {
            FileInputStream fis = new FileInputStream(filein);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            FileOutputStream fos = new FileOutputStream(fileout, true);
            while ((readRow = br.readLine()) != null) {
                String[] data = readRow.split(",");
                writeRow = (data[2].equals("true;") ? "Сердитый" : "Дружелюбный") + " кот " + data[0] + " весом " + data[1] + " кг.\n";
                byte[] buffer = writeRow.getBytes();
                fos.write(buffer, 0, buffer.length);
            }
            fis.close();
            br.close();
            fos.close();

        } catch (IOException ex) {
           ex.printStackTrace();
        }

    }
}
