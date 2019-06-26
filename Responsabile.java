import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Responsabile {
    protected String nome;
    protected String cognome;
    protected String cod;

    public boolean Assunzione(String nome, String cognome, String lavoro) {
        FileWriter Assunzioni;
        Scanner a = new Scanner(System.in);
        int cont = 0;

        System.out.println("Quante persone vuoi assumere?");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();

        try {
            Assunzioni = new FileWriter("Assunzioni.txt", true);
            while (num > 0) {
                cont = 0;
                num--;
                while (cont < num) {

                    System.out.println("Inserisci nome nuovo dipendente");
                    String nom = a.nextLine();
                    System.out.println("Inserisci cognome nuovo dipendente");
                    String cognom = a.nextLine();
                    System.out.println("Inserisci lavoro nuovo dipendente");
                    String lavor = a.nextLine();
                    Assunzioni.write(nom + " ");
                    Assunzioni.write(cognom + " ");
                    Assunzioni.write(lavor + " ");

                    cont++;
                }
            }
            Assunzioni.close();


            System.out.println("Dati scritti e file chiuso");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}