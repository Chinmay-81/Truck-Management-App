package org.example;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TruckService truckService = new TruckService();
        System.out.println("Welcome to Truck Service App");
        System.out.println("===============================");

        while (true) {
            System.out.println("Select what you want to do:");
            System.out.println("Press 1 : Insert\nPress 2 : Show a detail\nPress 3 : Update\nPress 4 : Show all details\nPress 5 : Delete a record\nPress 6: To Exit");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter model: ");
                    String model = sc.next();
                    System.out.print("Enter capacity: ");
                    int capacity = sc.nextInt();
                    System.out.print("Enter driver's name: ");
                    String driverName = sc.next();
                    Truck truck = new Truck(name, model, capacity, driverName);
                    truckService.addTruck(truck);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();
                    Truck truckById = truckService.getTruckById(id);
                    if (truckById != null) {
                        System.out.println(truckById);
                    } else {
                        System.out.println("Truck with ID " + id + " not found.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter Id to update: ");
                    int upid = sc.nextInt();
                    Truck updatingTruck = truckService.getTruckById(upid);
                    if (updatingTruck != null) {
                        System.out.print("Enter updated name: ");
                        String updatedName = sc.next();
                        updatingTruck.setName(updatedName);
                        System.out.print("Enter updated model: ");
                        String updatedModel = sc.next();
                        updatingTruck.setModel(updatedModel);
                        System.out.print("Enter updated capacity: ");
                        int updatedCapacity = sc.nextInt();
                        updatingTruck.setCapacity(updatedCapacity);
                        System.out.print("Enter updated driver's name: ");
                        String updatedDriverName = sc.next();
                        updatingTruck.setDriverName(updatedDriverName);
                        truckService.updateTruck(updatingTruck);
                        System.out.println("Updated truck data: " + truckService.getTruckById(upid));
                    } else {
                        System.out.println("Truck with ID " + upid + " not found.");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("All trucks in DB:");
                    for (Truck allTruck : truckService.getAllTrucks()) {
                        //directly
                        System.out.println(allTruck);
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Enter Id to Delete: ");
                    int delid = sc.nextInt();
                    Truck truckToDelete = truckService.getTruckById(delid);
                    if (truckToDelete != null) {
                        truckService.deleteTruck(delid);
                        System.out.println("Data of truck with ID " + delid + " deleted successfully.");
                    } else {
                        System.out.println("Truck with ID " + delid + " not found.");
                    }
                    System.out.println();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Wrong Entry...");
            }
        }
    }
}
