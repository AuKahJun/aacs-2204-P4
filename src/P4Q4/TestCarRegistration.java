/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4Q4;

/**
 *
 * @author akj_2
 */
import java.util.Scanner;

public class TestCarRegistration {

   public static void main(String[] args) {
        cartype[] cartype = {new cartype("Toyota", "Vios", 1.5),
            new cartype("Nissan", "Teana", 2.0),
            new cartype("Honda", "City", 1.6)};

        registration[] registration = new registration[2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < registration.length; ++i) {
            System.out.println("\nRegistration number: " + registration.getCount());

            System.out.print("Enter the owner name : ");
            String name = scanner.nextLine();
            System.out.print("Enter the IC Number : ");
            String icNumber = scanner.nextLine();

            owner o = new owner(name, icNumber);

            System.out.print("Enter the plate No : ");
            String plateNo = scanner.nextLine();
            System.out.print("Enter the color : ");
            String color = scanner.nextLine();
            System.out.print("Enter the year : ");
            int year = scanner.nextInt();

            System.out.println("\nCar Types: ");

            for (int j = 0; j < cartype.length; j++) {
                System.out.printf("%d %s\n", j + 1, cartype[j].toString());
            }

            System.out.print("\nSelect car type [1.." + cartype.length + "]: ");
            int selection = scanner.nextInt();

            car car = new car(plateNo, color, year, cartype[selection - 1]);

            registration[i] = new registration(o, car);

            scanner.nextLine();
        }

        System.out.printf("%-6s %-15s %-15s %-10s %-10s %-8s %-10s %-10s %5s\n", 
          "Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
        for(int o = 0; o < registration.length; o++)
        {
            System.out.printf("%s\n", registration[o].toString());
        }
   }
}