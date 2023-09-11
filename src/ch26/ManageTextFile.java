package ch26;

import java.io.*;

public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manager = new ManageTextFile();
        int numberCnt = 10;
        String fullPath = "C:"+ File.separator + "Users" + File.separator + "USER" + File.separator + "Desktop" + File.separator+"text" + File.separator+ "numbers.txt";
        System.out.println(fullPath);
        manager.writeFile(fullPath, numberCnt);
    }

    private void writeFile(String fileName, int numberCnt) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int loop = 0; loop <= numberCnt; loop++) {
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }
            System.out.println("Write success !!!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
