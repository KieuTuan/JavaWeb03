package lap1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class FileUtils {
    public void listFolder(String path) {
        File file = new File(path);
        String[] directories = file.list((File current, String name) -> new File(current, name).isDirectory());
        System.out.println(Arrays.toString(directories));
    }
    
    public void listFiles(String path) {
        File file = new File(path);
        String[] isFile = file.list((File current, String name) -> new File(current, name).isFile());
        System.out.println(Arrays.toString(isFile));
    }
    
    public void listFileImg(String path) {
        File file = new File(path);
        String[] img = file.list((File current, String name) -> new File(current, name).isFile());
        
        String extension = "";
        for (String img1 : img) {
            int n = img1.lastIndexOf(".");
            if (n > 0) {
                extension = img1.substring(n+1);
            }
            if (extension.equals("png") || extension.equals("jpg") || extension.equals("jpeg")) {
                System.out.println(img1);
            }
        }
    }
    
    public void listFileExt(String path, String ext) {
        File file = new File(path);
        String[] fileExt = file.list((File current, String name) -> new File(current, name).isFile());
        
        String extension = "";
        for (String fext1 : fileExt) {
            int n = fext1.lastIndexOf(".");
            if (n > 0) {
                extension = fext1.substring(n+1);
            }
            if (extension.equals(ext)) {
                System.out.println(fext1);
            }
        }
    }
    
    public void lastModifiedTime(String path) {
        File file = new File(path);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(file.lastModified()));
    }
    
    /**
     * @param type Kb or Mb
     */
    public void getSize(String path, String type){
        File file = new File(path);
        if(type.equals("Kb"))
            System.out.println(file.length()/1024);
        else
            System.out.println(file.length()/(1024*1024));
    }
}
