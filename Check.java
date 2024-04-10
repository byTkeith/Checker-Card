/*
 * Author Tendai Nyevedzanai
 * 
 */

import java.io.*;
import java.util.*;
public class Check {
    public static void main(String[] args) {
        ArrayList<String> cards=new ArrayList<>();//to add the card lines from the file
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the name of the cards file:");
        String filename= scanner.nextLine();
        try{File file= new File(filename);
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                cards.add(scanner.nextLine());
            }

        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }finally{
             if(scanner!=null){
                scanner.close();
             }
             
        }
    }
}
