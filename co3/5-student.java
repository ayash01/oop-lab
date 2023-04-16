import java.util.Scanner;

class Student {
    int roll_no;
    String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

class Sports extends Student {
    int sports_marks;

    Sports(int roll_no, String name, int sports_marks) {
        super(roll_no, name);
        this.sports_marks = sports_marks;
    }
}

class Result extends Sports {
    int academic_marks;

    Result(int roll_no, String name, int sports_marks, int final_marks) {
        super(roll_no, name, sports_marks);
        this.academic_marks = final_marks;
    }

    void displayResult() {
        System.out.print("\nRoll number: " + roll_no + "\nName: " + name + "\nSports Marks: " + sports_marks + "\nAcademic Marks: " + academic_marks + "\n\nTotal marks: " + (sports_marks+academic_marks) + "\n");
    }
}

class studentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int roll_no = input.nextInt();
        System.out.print("Enter student name: ");
        String name = input.next();
        System.out.print("Enter sports marks: ");
        int sports = input.nextInt();
        System.out.print("Enter academic marks: ");
        int academic = input.nextInt();

        Result stud1 = new Result(roll_no, name, sports, academic);
        stud1.displayResult();

        input.close();
    }
}