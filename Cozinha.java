import java.util.ArrayList;
import java.util.Arrays;

public class Cozinha {
    private String tipoCulinaria;
    private int numeroCozinheiros;
    private int horarioAbertura;
    private int horarioFechamento;
    private String pratoPrincipal;
    private ArrayList<Ingrediente> ingredientes;
    private ArrayList<Funcionario> funcionarios;

    public Cozinha(String tipoCulinaria, int numeroCozinheiros, int horarioAbertura, int horarioFechamento,
            String pratoPrincipal) {

        this.tipoCulinaria = tipoCulinaria;
        this.numeroCozinheiros = numeroCozinheiros;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
        this.pratoPrincipal = pratoPrincipal;
        ingredientes = new ArrayList<Ingrediente>();
        funcionarios = new ArrayList<Funcionario>();
    }

    public String getTipoCulinaria() {
        return this.tipoCulinaria;
    }

    public int getNumeroCozinheiros() {
        return this.numeroCozinheiros;
    }

    public int getHorarioAbertura() {
        return this.horarioAbertura;
    }

    public int getHorarioFechamento() {
        return this.horarioFechamento;
    }

    public String getPratoPrincipal() {
        return this.pratoPrincipal;
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void adicionarIngrediente(Ingrediente... ingredientes) {
        this.ingredientes.addAll(Arrays.asList(ingredientes));
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarFuncionario(Funcionario... funcionarios) {
        this.funcionarios.addAll(Arrays.asList(funcionarios));
    }

    public void removerIngrediente(Ingrediente ingrediente) {
        this.ingredientes.remove(ingrediente);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : this.funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void listarIngredientes() {
        for (Ingrediente ingrediente : this.ingredientes) {
            System.out.println(ingrediente);
        }
    }

    @Override
    public String toString() {
        return "Tipo de Culinaria: " + this.getTipoCulinaria() + "\nHorario de Abertura: " + this.getHorarioAbertura()
                + "\tHorario de Fechamento: " + this.getHorarioFechamento() + "\nPrato Principal: "
                + this.getPratoPrincipal();

    }
}
