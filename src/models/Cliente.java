package models;

public class Cliente {

    private String nome;
    private String cpf;
    private int idade;
    private String telefone;
    private String email;
    private String objetivo;

    public Cliente(String nome, String cpf, int idade,
                   String telefone, String email, String objetivo) {

        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.objetivo = objetivo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getObjetivo() {
        return objetivo;
    }
}