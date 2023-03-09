import java.util.Scanner;

class CPU {
    int price;

    class Processor {
        int cores;
        String manufacturer;

        static class RAM {
            int memory;
            String manufacturer;
        }
    }
}

class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CPU cpu = new CPU();

        System.out.println("Enter price of the CPU");
        int price = Integer.parseInt(input.nextLine());
        cpu.price = price;

        CPU.Processor processor = cpu.new Processor();

        System.out.println("Enter number of cores: ");
        int cores = Integer.parseInt(input.nextLine());
        processor.cores = cores;

        System.out.println("Enter processor manufacturer: ");
        String manufacturer = input.nextLine();
        processor.manufacturer = manufacturer;

        CPU.Processor.RAM ram = new CPU.Processor.RAM();

        System.out.println("Enter RAM manufacturer: ");
        String ram_manufacturer = input.nextLine();
        ram.manufacturer = ram_manufacturer;

        System.out.println("Enter size of RAM (in GB): ");
        int memory = Integer.parseInt(input.nextLine());
        ram.memory = memory;

        System.out.println("\nCPU Price: "+cpu.price+"\nProcessor cores: "+processor.cores+"\nProcessor manufacturer: "+processor.manufacturer+"\nRAM manufacturer: "+ram.manufacturer+"\nRAM size: "+ram.memory+"GB");
    }
}