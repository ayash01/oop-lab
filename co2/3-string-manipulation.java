import java.util.Scanner;

class String_methods {
    public static String upperCase(String str) {
        return str.toUpperCase();
    }

    public static String lowerCase(String str) {
        return str.toLowerCase();
    }

    public static String concat(String a, String b) {
        return a.concat(b);
    }

    public static String[] split(String a) {
        return a.split("");
    }

    public static String replace(String str, char a, char b) {
        return str.replace(a, b);
    }

    public static int length(String str) {
        return str.length();
    }
}

class strMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch;
        String str1, str2;
        String[] strings;
        do {
            System.out.print("\nEnter string method to demonstrate:\n\n1. Uppercase\n2. Lowercase\n3. Concatenate two strings\n4. Split string into array\n5. Replace character in string\n6. Find length of string\n\n0. Exit\n\n-> ");
            ch = input.nextInt();
            switch (ch) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.print("Enter a string: ");
                    str1 = input.next();
                    System.out.println("\nUppercase: " + String_methods.upperCase(str1));
                }
                case 2 -> {
                    System.out.print("Enter a string: ");
                    str1 = input.next();
                    System.out.println("\nLowercase: " + String_methods.lowerCase(str1));
                }
                case 3 -> {
                    System.out.print("Enter first string: ");
                    str1 = input.next();
                    System.out.print("\nEnter second string: ");
                    str2 = input.next();
                    System.out.println("\nConcatenated: " + String_methods.concat(str1, str2));
                }
                case 4 -> {
                    System.out.print("Enter a string: ");
                    str1 = input.next();
                    String[] strArr = String_methods.split(str1);
                    for(int i = 0; i < str1.length(); i++)
                        System.out.print(strArr[i] + " ");
                }
                case 5 -> {
                    System.out.print("Enter a string: ");
                    str1 = input.next();
                    System.out.print("\nEnter character to replace: ");
                    char a = input.next().charAt(0);
                    System.out.print("Enter replacement character: ");
                    char b = input.next().charAt(0);
                    System.out.println("Replaced: " + String_methods.replace(str1, a, b));
                }
                case 6 -> {
                    System.out.print("Enter a string: ");
                    str1 = input.next();
                    System.out.println("\nLength: " + String_methods.length(str1));
                }
                default -> System.out.println("Invalid choice");
            }
        } while (true);
    }
}