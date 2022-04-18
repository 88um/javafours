import java.util.*;
import java.io.*;  
 

public class Generate{ 
    public static char[] items = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    public static FileWriter writer;
    public static BufferedWriter bw;

    public static void main(String[] args) throws IOException {  
      writer = new FileWriter("users.txt");
        bw = new BufferedWriter(writer);
        int number = intInput("[+] How many 4Ls to generate: ");
        for (int i=0;i<number;i++){
        String word = generateWord();
        fileLog(word);
        }bw.close();
    } 

    public static int intInput(String arg){
        System.out.print(arg);
        int response = sc.nextInt();
        return response;
    }

    public static String generateWord(){
        String word = "";
        for (int i =0; i<4;i++){
            char letter = items[rand.nextInt(items.length)];
            word+=letter;}
        return word;
    }
    public static void fileLog(String username){
        try {
            File fourletters = new File("users.txt");
            if (fourletters.createNewFile()) {
             System.out.println();
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          try {
            bw.write(username);
            bw.newLine();
            System.out.println("\nGenerated User => "+username);
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    
    }


} 

