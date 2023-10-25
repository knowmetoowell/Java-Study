package fileIO;

import java.io.File;
import java.io.IOException;

public class CreateFileObject {
    public static void main(String[] args) throws IOException {
        File tempDir = new File("C:/temp");
        if (!tempDir.exists()) {
            tempDir.mkdir();
        }
        System.out.println("tempDir.exists() = " + tempDir.exists());

        File newFile = new File("C:/temp/newFile.txt");
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
        System.out.println("newFile.exists() = " + newFile.exists());
        System.out.println();

        File newFile2 = new File("C:\\temp\\newFile.txt");
        File newFile3 = new File("C:/temp/newFile.txt");
        File newFile4 = new File("C:" + File.separator + "temp" + File.separator + "newFile.txt");
        System.out.println(newFile2.exists());
        System.out.println(newFile3.exists());
        System.out.println(newFile4.exists());
        System.out.println();

        File newFile5 = new File("C:/abc/newFile.txt");
        File newFile6 = new File("C:/abc/bcd/newFile.txt");
        System.out.println("newFile5.getAbsolutePath() = " + newFile5.getAbsolutePath());
        System.out.println("newFile6.getAbsolutePath() = " + newFile6.getAbsolutePath());

        System.out.println(System.getProperty("user.dir"));
        File newFile7 = new File("newFile1.txt");
        File newFile8 = new File("bcd/newFile2.txt");
        System.out.println(newFile7.getAbsolutePath());
        System.out.println(newFile8.getAbsolutePath());
        System.out.println();




        File file = new File("C:/Windows");
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getParent() = " + file.getParent());
        File File2 = new File("C:/temp/abc");
        File File3 = new File("C:/temp/abc/cde");
        System.out.println("File2.mkdir() = " + File2.mkdir());
        System.out.println("File3.mkdir() = " + File3.mkdir());
        System.out.println("File3.mkdirs() = " + File3.mkdirs());

        File[] fnames = file.listFiles();
        for (File fname : fnames) {
            System.out.println((fname.isDirectory()? "폴더: ":"파일: ") + fname.getName());
        }
    }
}
