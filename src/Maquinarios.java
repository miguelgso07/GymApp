public class Maquinario {

    private String nome;
    private String categoria;
    private String descricao;
    private boolean disponivel;
    private int quantidade;

    public Maquinario(String nome, String categoria, String descricao,
                       boolean disponivel, int quantidade) {

        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.disponivel = disponivel;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}