package com.java.lap1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {
    private Map<String, String> map;
    private String pathEn = "menu-en.locale";
    private String pathVi = "menu-vi.locale";
    
    public Menu(String lang) {
        String path = "";
        if(lang.equals("EN"))
            path = pathEn;
        else if(lang.equals("VI"))
            path = pathVi;
        else
            System.exit(0);
        BufferedReader read;
        try {
            map = new HashMap<>();
            read = new BufferedReader(new FileReader(path));
            String st = read.readLine();
            while (st!=null) {          
                map.put(st.split("=")[0], st.split("=")[1]);
                st = read.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void printMenu() {
        System.out.println("---" + map.get("menu") + "--------------");
        System.out.println("1. " + map.get("add"));
        System.out.println("2. " + map.get("search"));
        System.out.println("3. " + map.get("update"));
        System.out.println("4. " + map.get("delete"));
        System.out.println("5. " + map.get("save"));
        System.out.println("6. " + map.get("lang"));
        System.out.println("7. " + map.get("exit"));
        System.out.println("-----------------");
    }
}
