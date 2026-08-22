import models.Cliente;
import models.Maquinario;

public class Main {

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println("       BEM-VINDO AO GYMAPP");
        System.out.println("===============================");

        // Cadastro de um cliente
        Cliente cliente1 = new Cliente(
                "Miguel",
                "123.456.789-00",
                21,
                "81999999999",
                "miguel@email.com",
                "Hipertrofia"
        );

        // Cadastro de um maquinário
        Maquinario maquina1 = new Maquinario(
                "Esteira",
                "Cardio",
                "Máquina para corrida e caminhada",
                true,
                5
        );

        System.out.println("\n--- CLIENTE CADASTRADO ---");
        System.out.println("Nome: " + cliente1.getNome());

        System.out.println("\n--- MAQUINÁRIOS DA ACADEMIA ---");
        System.out.println("Nome: " + maquina1.getNome());
        System.out.println("Categoria: " + maquina1.getCategoria());
        System.out.println("Descrição: " + maquina1.getDescricao());
        System.out.println("Disponível: " + maquina1.isDisponivel());
        System.out.println("Quantidade: " + maquina1.getQuantidade());
    }
}
System.out.println("Teste realizado pelo notebook!");