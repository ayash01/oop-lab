import java.util.Scanner;
import java.io.*;

class fileReadWrite {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String content = input.nextLine();

        FileWriter fileWriter = new FileWriter("output.txt");

        for (int i = 0; i < content.length(); i++)
            fileWriter.write(content.charAt(i));
        fileWriter.close();

        System.out.println("Successfully written to file");

        try {
            int character;
            FileReader fileRead = new FileReader("output.txt");
            System.out.print("\nFile contents: ");
            while ((character = fileRead.read()) != -1)
                System.out.print((char) character);
            fileRead.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        System.out.println();
    }
}