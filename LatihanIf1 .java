import java.util.Scanner;

public class LatihanIf1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Suka matematika? (y/t): ");
        String matematika = input.nextLine();

        if (matematika.equalsIgnoreCase("y")) {
            System.out.print("Suka komputer? (y/t): ");
            String komputer = input.nextLine();

            if (komputer.equalsIgnoreCase("y")) {
                System.out.println("Jurusan = Teknik Informatika");
            } else {
                System.out.println("Jurusan = Pendidikan Matematika");
            }

        } else {
            System.out.print("Suka Ekonomi? (y/t): ");
            String ekonomi = input.nextLine();

            if (ekonomi.equalsIgnoreCase("y")) {
                System.out.println("Jurusan = Ilmu Ekonomi");
            } else {
                System.out.println("Jurusan = Sastra");
            }
        }

        input.close();
    }
}
