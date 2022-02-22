import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Leser stÃ¸rrelsen pÃ¥ labyrinten og prosentandel blokkerte ruter
        Scanner scanner = new Scanner(System.in);
        System.out.print("n?: ");
        int n = scanner.nextInt();
        System.out.print("% blokkerte ruter?: ");
        int prosentBlokkert = scanner.nextInt();

        // Oppretter ny labyrint
        labyrint lab = new labyrint(n, prosentBlokkert);

        // Leter etter vei fra Ã¸vre venstre hjÃ¸rne
        boolean funnetVei = lab.finnVei(0, 0);

        // Skriver ut labyrinten (og evt. funnet vei)
        System.out.println(lab);
        if (!funnetVei)
            System.out.println("Fant ingen vei gjennom labyrinten");
    }
}
