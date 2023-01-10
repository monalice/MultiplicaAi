import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("De qual numero deseja a tabela de multipicacao? ");

        Scanner in = new Scanner( System.in );
        int num = Integer.parseInt(in.nextLine());

        System.out.println("Tabela de multiplicacao de " + num);

        for(int i = 0; i <= 10; i++){
            int mult = num * i;
            System.out.println(num + " * " + i + " = " + mult);
        }
    }
}
