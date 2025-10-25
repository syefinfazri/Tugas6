import java.util.Scanner;
import java.util.Stack;

public class BalikKalimat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Masukkan kalimat: ");
        String teks = input.nextLine();

        for (int i = 0; i < teks.length(); i++) {
            stack.push(teks.charAt(i));
        }

        String hasil = "";
        while (!stack.isEmpty()) {
            hasil += stack.pop();
        }

        System.out.println("\n=== HASIL PEMBALIKAN KALIMAT ===");
        System.out.println("Kalimat Asli   : " + teks);
        System.out.println("Kalimat Dibalik: " + hasil);
        System.out.println("Jumlah Karakter: " + teks.length());

        input.close();
    }
}
