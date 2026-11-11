import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    // 1.7.1 
    static String inverseaza(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // 1.7.2
    static void afiseazaStatistici(String nume, List<Integer> lista) {
        System.out.println(nume + ": " + lista);
        if (lista.isEmpty()) {
            System.out.println("  Lista este goala, nu exista min/max.");
            return;
        }
        System.out.println("  Min = " + Collections.min(lista) + ", Max = " + Collections.max(lista));
    }

    // 1.7.3 a)
    static void afiseazaDreptunghi(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 1.7.3b)
    static void afiseazaDiagonale(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 1.7.1
        System.out.println("=== 1.7.1 ===");
        String rezultat = inverseaza("A inceput scoala.");
        System.out.println(rezultat);

        // 1.7.2
        System.out.println("\n=== 1.7.2 ===");
        Random rand = new Random();
        List<Integer> prima = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            prima.add(5 + rand.nextInt(21));
        }

        List<Integer> a2a = new ArrayList<>();
        for (int x : prima) {
            if (x >= 10 && x <= 20) {
                a2a.add(x);
            }
        }

        afiseazaStatistici("Prima lista", prima);
        afiseazaStatistici("A doua lista", a2a);

        // 1.7.3
        System.out.println("\n=== 1.7.3 a) ===");
        afiseazaDreptunghi(4, 5);

        System.out.println("\n=== 1.7.3 b) ===");
        afiseazaDiagonale(7);
    }
}
