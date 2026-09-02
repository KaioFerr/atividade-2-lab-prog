import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String cpf;
        System.out.println("""
                Digite uma opção:
                1 - registrar usuário
                2 - fazer login
                """);
        int opcao = scan.nextInt();
        switch (opcao){
            case 1:
                cpf = scan.next();
                String nome = scan.next();
                biblioteca.cadastrarUsuario(cpf, nome);

            case 2:
                cpf = scan.next();
                System.out.println(biblioteca.loginoPorCPF(cpf));
        }
    }
}