package ch26;

import java.io.File;
import java.util.Date;

public class FileSample {
    public static void main(String[] args) {
        FileSample fileSample = new FileSample();
        String pathName = "C:\\Users\\USER\\Desktop\\text";
        fileSample.checkPath(pathName);
        fileSample.makeDir(pathName);
        fileSample.checkFileMethods(pathName);
        fileSample.lastModified(pathName);
    }

    private void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName+ " is exists? = "+ file.exists());
    }

    private void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println("Make "+pathName+" result = "+file.mkdir());
    }

    private void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName+ " is directory? = "+file.isDirectory());
        System.out.println(pathName+ " is file? = "+file.isFile());
        System.out.println(pathName+ " is hidden? = "+file.isHidden());
    }

    private void lastModified(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName+" last modified = "+new Date(file.lastModified()));
    }
}
