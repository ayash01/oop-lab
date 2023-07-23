import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex c2) {
        return new Complex(this.real + c2.real, this.imaginary + c2.imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

class complexNumber {
    public static void main(String[] args) {
        int[] real = new int[2];
        int[] imaginary = new int[2];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the real and imaginary part of first complex number: ");
        real[0] = input.nextInt();
        imaginary[0] = input.nextInt();

        System.out.print("Enter the real and imaginary part of second complex number: ");
        real[1] = input.nextInt();
        imaginary[1] = input.nextInt();

        Complex complex1 = new Complex(real[0], imaginary[0]);
        Complex complex2 = new Complex(real[1], imaginary[1]);

        Complex sum = complex1.add(complex2);
        System.out.print("Sum of complex numbers: " + sum);

        input.close();
    }
}