import java.util.Scanner;
import java.lang.String;

public class Main_azienda {


    public static void main(String[] args) {
        System.out.printf("Inserisci il codice in dotazione\n");
        Scanner input = new Scanner (System.in);
        String cod = input.nextLine();

        switch(cod) {
            case "1":
                System.out.println("Ciao");

                break;
            case "2":
                System.out.println("Ciaone");
                break;
            case "3":
                System.out.println("Ciaonene");
                break;
            default:
                System.out.println("Hai inserito il codice sbagliato");
        }
    }



    }
