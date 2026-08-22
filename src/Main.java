import models.Cliente;
import models.Maquinarios;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("       BEM-VINDO AO GYMAPP");
        System.out.println("================================");


        // Cadastro de um cliente
        Cliente cliente1 = new Cliente();

        // Cadastro de um maquinário
        Maquinarios maquina1 = new Maquinarios(
                "Esteira",
                "Cardio",
                "Máquina para corrida e caminhada",
                true,
                5
        );


        System.out.println("\n--- MAQUINÁRIOS DA ACADEMIA ---");

        System.out.println("Nome: " + maquina1.getNome());
        System.out.println("Categoria: " + maquina1.getCategoria());
        System.out.println("Descrição: " + maquina1.getDescricao());
        System.out.println("Disponível: " + maquina1.isDisponivel());
        System.out.println("Quantidade: " + maquina1.getQuantidade());

    }
}