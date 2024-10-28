package poo;
import classOnes.Vehicle;

public class pooVehicle {
    public static void main(String[] args) {
        //values
        Vehicle vehicle1;
        vehicle1 = new Vehicle();
        vehicle1.setPlate("335KQW");
        vehicle1.setBrand("Honda");
        vehicle1.setColor("Blue");
        vehicle1.setModel(2008);
        vehicle1.setChassis("CKHW8923P9YU23");
        vehicle1.setWeight(16000);
        vehicle1.setType("Sedan");
        vehicle1.setCapacity("8");
        //printing values
        System.out.println("\n"+"VEHICLE'S VALUES");
        System.out.println("-------------------------------");
        System.out.println("Plate: " + vehicle1.getPlate());
        System.out.println("Color: " + vehicle1.getColor());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Chassis: " + vehicle1.getChassis());
        System.out.println("Capacity: " + vehicle1.getCapacity());
        System.out.println("Type: " + vehicle1.getType());
        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Weight: " + vehicle1.getWeight());
        vehicle1.validateTimeUsage(2024);
        vehicle1.validatePCM();
        System.out.println("The kms average per year is: "
                + vehicle1.validateKs(45000,
                2024)+"Kms");
        System.out.println("-------------------------------");
    }
}
