import java.io.*;

public class CheckedApp{
    public static void main(String[] args) throws IOException{
        String fileName = "rooms.txt";

        //#region USING THROWS DECLARATION TO HANDLE EXCEPTIONS
        /*
        try { // try to read the file rooms.txt and catch the exception if it occurs
            readTxtFile(fileName);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        */
        //#endregion
        
        readTxtFile(fileName);
        
        System.out.println("Finish");
    }
    
    public static void readTxtFile(String fileName) throws IOException{
        // Don’t worry if you don’t understand this statement now. Just need
        // to know this is to create a reader object ready to read the text file.
        
        //#region USING TRY AND CATCH BLOCK TO HANDLE EXCEPTIONS
        /*
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            String line;
            do {
                line = bufferedReader.readLine();
                System.out.println(line);// print out each line
            } while(line != null);
            bufferedReader.close();// Always close it.  
        } catch (FileNotFoundException e) { // FileNotFoundException is a checked exception
            System.out.println("Exception: " + e.getMessage()); // print the exception message
            e.printStackTrace(); // print the stack trace
            System.out.println(e.toString()); // print the exception toString
        } catch (IOException e) { // IOException is a checked exception
            System.out.println("Exception: " + e.getMessage());
        }*/
        //#endregion

        //#region USING THROWS DECLARATION TO HANDLE EXCEPTIONS
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line;
        do {
            line = bufferedReader.readLine();
            System.out.println(line);// print out each line
        } while(line != null);
        bufferedReader.close();// Always close it.

        //#endregion
    }
}