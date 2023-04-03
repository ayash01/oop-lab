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

class Employee extends Person {
    int Empid, Salary;
    String Company_name, Qualification;

    Employee(String Name, String Gender, String Address, int Age, int Empid, int Salary, String Company_name, String Qualification) {
        super(Name, Gender, Address, Age);
    }
}

class Teacher extends Employee {
    String Subjects, Department;
    int Teacherid;

    Teacher(String Name, String Gender, String Address, int Age, int Empid, int Salary, String Company_name, String Qualification, String Subjects, String Department, int Teacherid) {
        super(Name, Gender, Address, Age, Empid, Salary, Company_name, Qualification);
        this.Subjects = Subjects;
        this.Department = Department;
        this.Teacherid = Teacherid;
    }

    void display() {
        System.out.println("Name: " + Name + "\nGender: " + Gender + "\nAddress: " + Address + "\nAge: " + Age + "\nEmpid: " + Empid + "\nSalary: " + Salary + "\nCompany name: " + Company_name + "\nQualification: " + Qualification + "\nSubjects: " + Subjects + "\nDepartment: " +Department + "\nTeacher ID: " + Teacherid);
    }
}

class Main {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        
    }
}