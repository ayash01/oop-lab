import java.io.*;

class EvenOddFiles {
    public static void main(String[] args) {
        try {
            FileReader fileRead = new FileReader("file.txt");
            FileWriter oddFileWriter = new FileWriter("odd.txt");
            FileWriter evenFileWriter = new FileWriter("even.txt");

            int number;
            while ((number = fileRead.read()) != -1) {
                char character = (char) number;
                if (character % 2 == 0)
                    evenFileWriter.write(character);
                else
                    oddFileWriter.write(character);
            }
            oddFileWriter.close();
            evenFileWriter.close();
            fileRead.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
