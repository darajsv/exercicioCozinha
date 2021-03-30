public class Funcionario {
    private String nome;
    private String atividade;

    public Funcionario(String nome, String atividade) {
        this.nome = nome;
        this.atividade = atividade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAtividade() {
        return this.atividade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\tAtividade: " + this.getAtividade();
    }
}
