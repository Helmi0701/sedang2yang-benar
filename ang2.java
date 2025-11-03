import java.util.Scanner;

public class ang2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();

        double volume = hitungVolume(r, t);
        System.out.println("Volume tabung adalah: " + volume);
    }

    public static double hitungVolume(double radius, double tinggi) {
        return Math.PI * radius * radius * tinggi;
    }


    }

