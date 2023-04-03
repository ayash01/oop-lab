import java.util.Scanner;

class Employee1{
    int eNo, eSalary;
    String eName;

    void setDetails(int eNo, String eName, int eSalary){
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    void display(){
        System.out.println("Employee Details: ");
        System.out.println("\nEmployee number: " + this.eNo + "\nName: " + this.eName + "\nSalary: " + this.eSalary);
    }
}

class empDetails {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int number = input.nextInt();

        Employee1[] emp = new Employee1[number];

        for(int i = 0; i < number; i++) {
            System.out.printf("Enter the employee number, name, and salary of employee %d\n", i+1);
            int num = input.nextInt();
            String name = input.next();
            int salary = input.nextInt();

            emp[i] = new Employee1();
            emp[i].setDetails(num, name, salary);
        }

        System.out.println("Enter employee number to search: ");
        int search = input.nextInt();
        boolean found = false;

        for(int i = 0; i < number; i++){
            if (emp[i].eNo == search) {
                found = true;
                emp[i].display();
                break;
            }
        }
        if(!found)
            System.out.println("Employee not found!");
        input.close();
    }
}