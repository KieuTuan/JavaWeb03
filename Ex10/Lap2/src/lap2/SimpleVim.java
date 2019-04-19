package lap2;

import java.io.*;
import java.util.Scanner;

public class SimpleVim {
    File file;
    
    public SimpleVim() {
    }

    public SimpleVim(String path) {
        file = new File(path);
    }
    
    
    public void createFile() throws IOException {
        file.createNewFile();
    }
    
    public void write() throws UnsupportedEncodingException, FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(file);
        String st = input.nextLine();;
        do {
            writer.println(st);
            st = input.nextLine();
        } while (!st.equals(""));
        writer.close();
    }
}
