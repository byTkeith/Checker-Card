/*
 * Author Tendai Nyevedzanai
 * 
 */

import java.io.*;
import java.util.*;
public class Check {
    public static void main(String[] args) {
        ArrayList<String> cards=new ArrayList<>();//to add the card lines from the file
        ArrayList<String> matcher=new ArrayList<>();//stores value and counters if ther are equal
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
        int insertCounter=0;
        int skippedCounter=0;
        for(String eLine: cards){
            //int insertCounter=0;
            String[] sepCards=eLine.split(" ");//splits each line into separate cards
            for(String eCard: sepCards){//loops through all three cards
                String[] eCardChar=eCard.split(",");//splits each card to its respective characteristics
                int i;
                //int insertCounter=0;
                for(i=0;i<eCardChar.length;i++){
                    if(!matcher.contains(eCardChar[i])){
                        matcher.add(eCardChar[i]);//if the card characteristic does not exist in the array add it
                        insertCounter++;//when a value is added we increment to keep track of how many items are in the array.
                    }
                    else{ skippedCounter++;}
                }//System.out.println("the number of words inserted are: "+insertCounter);

            }
            if(insertCounter==9 || (insertCounter==3 && skippedCounter==6) ){
                System.out.println("Processing: "+eLine+"\nValid");

            }
            else {
                System.out.println("Processing: "+eLine+"\n"+"Invalid");
            }
            
            //System.out.println("the number of words inserted are: "+insertCounter+" skipped words are: "+ skippedCounter);
            insertCounter=0;
            skippedCounter=0;
            matcher.clear();
           
        }
        System.out.println("Done");
    }
}
