package Opps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
*
* @author 
*/
public class yome {
    
    static ArrayList< String > sms = new ArrayList< String >();
    static ArrayList< String > meaning = new ArrayList< String >();
    
    public static void readDictionary()
    {
       File file = new File("dictionary.txt");
       boolean flag = false;
       
       try {

            Scanner scanner = new Scanner(file);
            flag = true;
            String delims = ":";
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            //    System.out.println(line);
                String[] tokens = line.split(delims);
               sms.add(tokens[0]);
               meaning.add(tokens[1].toLowerCase());
            }
            scanner.close();
       } catch (FileNotFoundException e) {
            e.printStackTrace();
       }
    }
    
    static String S2E(String message)
    {
       String m = message.toUpperCase();
       for (int i = 0; i < sms.size(); i++) {
            if (m.equals(sms.get(i))) {
                return meaning.get(i);
            }
       }
       return message;
    }}