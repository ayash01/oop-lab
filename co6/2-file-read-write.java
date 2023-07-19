import java.util.Scanner;
import java.io.*;

class fileReadWrite {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String content = input.nextLine();

        FileWriter fileWriter = new FileWriter("output.txt");

        for(int i = 0; i < content.length(); i++)
            fileWriter.write(content.charAt(i));
        fileWriter.close();

        System.out.println("Successfully written to file");

        try {
            int character;
            FileReader fileReader = new FileReader("output.txt");
            System.out.print("File contents: ");
            while( ( character = fileReader.read() ) != -1)
                System.out.printf("%c",character);
            fileReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Unable to read file");
        }
        System.out.println();
    }
}