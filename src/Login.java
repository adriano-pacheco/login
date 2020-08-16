import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);

        System.out.println("Digite o primeiro nome:");
        String nome = sacanner.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = sacanner.nextLine();

        System.out.println(nome.charAt(0) + "_" + sobrenome);
        boolean defaultPassword = false;

        while (defaultPassword == false){
            System.out.println("Insira uma senha:");
            String password = sacanner.nextLine();
            if (password.length() >= 8 && password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")){
                System.out.println("Cadastro realizado com sucesso!");
                defaultPassword = true;
            } else{
                System.out.println("Senha não valida, Por favor repita o processo.");
            }

        }
    }
}
