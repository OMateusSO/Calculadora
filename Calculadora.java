import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int A = 0, B = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 1 numero:\n");
        A = scanner.nextInt();
        System.out.print("Digite 2 numero:\n");
        B = scanner.nextInt();

        System.out.print("Escolha um número de 1 a 4 para escolher a opreção que deseja usar:\n\n"
                + "1 - soma (+)\n"
                + "2 - subitração (-)\n"
                + "3 - multiplica (*)\n"
                + "4 - divisão (/)\n\n"
                + "Operação escolhida:");

        int op = scanner.nextInt();
        double R;
        switch (op) {
            case 1:
                R = soma(A, B);
                System.out.println("\nResultado: " + R);
                break;
            case 2:
                R = subitrai(A, B);
                System.out.println("\nResultado: " + R);
                break;
            case 3:
                R = multiplica(A, B);
                System.out.println("\nResultado: " + R);
                break;
            case 4:
                R = divide(A, B);
                System.out.println("\nResultado: " + R);
                break;
            default:
                System.out.print("\nNUMERO inválido");
                break;

        }

    }

    public static int soma(int A, int B) {
        return A + B;
    }

    public static int subitrai(int A, int B) {
        return A - B;
    }

    public static int multiplica(int A, int B) {
        return A * B;
    }

    public static int divide(int A, int B) {
        return A / B;
    }

}