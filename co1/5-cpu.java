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

class cpuInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CPU cpu = new CPU();

        System.out.print("Enter price of CPU: ");
        cpu.price = Integer.parseInt(input.nextLine());

        CPU.Processor processor = cpu.new Processor();

        System.out.print("Enter number of cores: ");
        processor.cores = Integer.parseInt(input.nextLine());

        System.out.print("Enter processor manufacturer: ");
        processor.manufacturer = input.nextLine();

        CPU.Processor.RAM ram = new CPU.Processor.RAM();

        System.out.print("Enter RAM manufacturer: ");
        ram.manufacturer = input.nextLine();

        System.out.print("Enter size of RAM (in GB): ");
        ram.memory = Integer.parseInt(input.nextLine());

        System.out.println("\nCPU Price: "+cpu.price+"\nProcessor cores: "+processor.cores+"\nProcessor manufacturer: "+processor.manufacturer+"\nRAM manufacturer: "+ram.manufacturer+"\nRAM size: "+ram.memory+"GB");
    }
}