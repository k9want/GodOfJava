package ch27;

import java.io.*;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath =  "C:"+ File.separator + "Users" + File.separator + "USER" + File.separator + "Desktop" + File.separator+"text" + File.separator+ "serial.obj";
        SerialDTO dto = new SerialDTO("GodOfJava", 10, true, 100);
        manager.saveObject(dto, fullPath);
        manager.loadObject(fullPath);
    }

    private void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            SerialDTO dto = (SerialDTO) ois.readObject();
            System.out.println(dto);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void saveObject(SerialDTO dto, String fullPath) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
            System.out.println("Write Success !!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
