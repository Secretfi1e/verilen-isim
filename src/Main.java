import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        String reng = scanner.nextLine();

        switch (reng){

            case "sari" -> System.out.println("Hazirlasin");
            case "qirmizi"-> System.out.println("Dayanin");
            case "yasil"-> System.out.println("Hereket edin");

            default -> System.out.println("error");


        }























    }
}