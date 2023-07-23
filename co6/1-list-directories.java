import java.util.Scanner;
import java.io.File;

class listDir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full path to directory: ");
        String path = input.next();

        System.out.print("Enter filename to search: ");
        String key = input.next();

        File directory = new File(path);

        if(!directory.exists() || !directory.isDirectory())
            System.out.println("Invalid file or directory");
        else {
            boolean found = false;
            File[] files = directory.listFiles();

            for(File file: files){
                if(file.isDirectory())
                    System.out.printf(file.getName());
                if(file.isFile()){
                    System.out.println(file.getName());
                    if(file.getName().equals(key))
                        found = true;
                }
            }
            if (found)
                System.out.printf("File %s found\n", key);
            else
                System.out.println("File not found");
        }
    }
}