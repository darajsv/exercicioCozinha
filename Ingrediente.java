import java.time.LocalDate;

public class Ingrediente {
    private String nome;
    private LocalDate dataValidade;

    public Ingrediente(String nome, LocalDate dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataValidade() {
        return this.dataValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\tData de Validade: " + this.getDataValidade();
    }
}
