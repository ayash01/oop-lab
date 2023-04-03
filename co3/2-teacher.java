import java.util.Scanner;

class Employee {
    int Empid, Salary;
    String Name, Address;

    Employee(int Empid, String Name, int Salary, String Address) {
        this.Empid = Empid;
        this.Name = Name;
        this.Salary = Salary;
        this.Address = Address;
    }
}

class Teacher extends Employee {
    String department, Subjects;

    Teacher(int Empid, String Name, int Salary, String Address, String department, String Subjects) {
        super(Empid, Name, Salary, Address);
        this.department = department;
        this.Subjects = Subjects;
    }

    void display() {
        System.out.println("ID: " + Empid + "Name: " + Name + "Salary: " + Salary + "Address: " + Address);
    }
}

class TeacherDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of teachers: ");
        int num = input.nextInt(), i;

        Teacher[] teachers = new Teacher[num];

        int id, sal;
        String name, addr, dept, subs;

        for(i = 0; i < num; i++) {
            System.out.println("Enter details of teacher " + i+1);
            id = input.nextInt();
            name = input.next();
            sal = input.nextInt();
            addr = input.next();
            dept = input.next();
            subs = input.next();

            teachers[i] = new Teacher(id, name, sal, addr, dept, subs);
        }

        System.out.println("Teachers' details: ");
        for (i = 0; i < num; i++) {
            teachers[i].display();
        }

        input.close();
    }
}
