import java.io.*;

class CopyFile {
    public static void main(String[] args) {
        try {
            String inputFileName = "file.txt";
            String outputFileName = "newFile.txt";

            FileReader fileRead = new FileReader(inputFileName);
            FileWriter fileWrite = new FileWriter(outputFileName);

            int character;
            while ((character = fileRead.read()) != -1) {
                fileWrite.write(character);
            }

            System.out.println("Copied to " + outputFileName);

            fileRead.close();
            fileWrite.close();

        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

