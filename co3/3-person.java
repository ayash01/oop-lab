import java.util.Scanner;

class Person {
    String Name, Gender, Address;
    int Age;

    Person(String Name, String Gender, String Address, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
    }
}

class Employee2 extends Person {
    int Empid, Salary;
    String Company_name, Qualification;

    Employee2(String Name, String Gender, String Address, int Age, int Empid, int Salary, String Company_name, String Qualification) {
        super(Name, Gender, Address, Age);
        this.Empid = Empid;
        this.Salary = Salary;
        this.Company_name = Company_name;
        this.Qualification = Qualification;
    }
}

class Teacher2 extends Employee2 {
    String Subjects, Department;
    int Teacherid;

    Teacher2(String Name, String Gender, String Address, int Age, int Empid, int Salary, String Company_name, String Qualification, String Subjects, String Department, int Teacherid) {
        super(Name, Gender, Address, Age, Empid, Salary, Company_name, Qualification);
        this.Subjects = Subjects;
        this.Department = Department;
        this.Teacherid = Teacherid;
    }

    void display() {
        System.out.println("Name: " + Name + "\nGender: " + Gender + "\nAddress: " + Address + "\nAge: " + Age + "\nEmpid: " + Empid + "\nSalary: " + Salary + "\nCompany name: " + Company_name + "\nQualification: " + Qualification + "\nSubjects: " + Subjects + "\nDepartment: " +Department + "\nTeacher ID: " + Teacherid + "\n");
    }
}

class personInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int num = input.nextInt(), i;

        Teacher2[] teachers = new Teacher2[num];
        int id, age, sal, teacherid;
        String name, gender, addr, dept, company, qual, subs;

        for(i = 0; i < num; i++) {
            System.out.println("Enter details of teacher " + (i+1));
            name = input.next();
            gender = input.next();
            addr = input.next();
            age = input.nextInt();
            id = input.nextInt();
            sal = input.nextInt();
            company = input.next();
            qual = input.next();
            subs = input.next();
            dept = input.next();
            teacherid = input.nextInt();

            teachers[i] = new Teacher2(name, gender, addr, age, id, sal, company, qual, subs, dept, teacherid);
        }

        System.out.println("Teachers' details: ");
        for (i = 0; i < num; i++) {
            teachers[i].display();
        }
    }
}