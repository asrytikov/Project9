package p6;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("D:\\someDir");

        if (file.isDirectory()){
            for (File item:file.listFiles()) {
                if (item.isDirectory()){
                System.out.println(item.getName() + "\t folder");
            }else{
                    System.out.println(item.getName() + "\t file");
                }
            }
        }

        File dir = new File("D:\\someDir\\NewDir");
        boolean created = dir.mkdir();
        if (created){
            System.out.println("New folder");
        }
        File newDir = new File("D:\\someDir\\NewDir2");
        dir.renameTo(newDir);

        boolean deleted = newDir.delete();
        if (deleted){
            System.out.println("DELETE");
        }

    }

}
