import java.time.LocalDate;

class Main {
    public static void main(String[] args) {

        Cozinha mineira = new Cozinha("Mineira", 4, 14, 20, "Feijoada");

        Funcionario funcionario = new Funcionario("Dara Vieira", "chefe");
        mineira.adicionarFuncionario(funcionario);
        funcionario = new Funcionario("Ângelo Savioti", "cozinheiro");
        mineira.adicionarFuncionario(funcionario);
        funcionario = new Funcionario("Kris Oliveira", "Garçom");
        mineira.adicionarFuncionario(funcionario);
        funcionario = new Funcionario("Pedro Soares", "Ajudante");
        mineira.adicionarFuncionario(funcionario);

        Ingrediente ingrediente = new Ingrediente("Feijão", LocalDate.of(2021, 05, 23));
        mineira.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Farinha", LocalDate.of(2021, 07, 20));
        mineira.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Arroz", LocalDate.of(2021, 06, 02));
        mineira.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Carne de Porco", LocalDate.of(2021, 04, 01));
        mineira.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Linguiça", LocalDate.of(2021, 04, 03));
        mineira.adicionarIngrediente(ingrediente);

        Cozinha chinesa = new Cozinha("Chinesa", 3, 10, 21, "Yakissoba");

        funcionario = new Funcionario("Rupaul Andre Charles", "chefe");
        chinesa.adicionarFuncionario(funcionario);
        funcionario = new Funcionario("Vanessa Vanjie Mateo", "cozinheiro");
        chinesa.adicionarFuncionario(funcionario);
        funcionario = new Funcionario("Bianca del Rio", "Garçom");
        chinesa.adicionarFuncionario(funcionario);

        ingrediente = new Ingrediente("Champigon", LocalDate.of(2021, 05, 23));
        chinesa.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Brocolis", LocalDate.of(2021, 07, 20));
        chinesa.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Macarrão", LocalDate.of(2021, 06, 02));
        chinesa.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Carne", LocalDate.of(2021, 04, 01));
        chinesa.adicionarIngrediente(ingrediente);

        Cozinha italiana = new Cozinha("Italiana", 3, 13, 22, "Espaguete");

        funcionario = new Funcionario("Priyanka", "chefe");
        italiana.adicionarFuncionario(funcionario);
        funcionario = new Funcionario("Brooke Lynn Hytes", "cozinheiro");
        italiana.adicionarFuncionario(funcionario);

        ingrediente = new Ingrediente("Molho", LocalDate.of(2021, 05, 23));
        italiana.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Macarrão", LocalDate.of(2021, 07, 20));
        italiana.adicionarIngrediente(ingrediente);
        ingrediente = new Ingrediente("Carne", LocalDate.of(2021, 06, 02));
        italiana.adicionarIngrediente(ingrediente);

        System.out.println("\n------------------------------------------------------------------------------------");

        System.out.println(mineira);
        System.out.println("\nIngredientes: ");
        mineira.listarIngredientes();
        System.out.print("\nNumero de Funcionarios: ");
        System.out.println(mineira.getNumeroCozinheiros());
        mineira.listarFuncionarios();

        System.out.println("\n------------------------------------------------------------------------------------");

        System.out.println(chinesa);
        System.out.println("\nIngredientes: ");
        chinesa.listarIngredientes();
        System.out.print("\nNumero de Funcionarios: ");
        System.out.println(chinesa.getNumeroCozinheiros());
        chinesa.listarFuncionarios();

        System.out.println("\n------------------------------------------------------------------------------------");

        System.out.println(italiana);
        System.out.println("\nIngredientes: ");
        italiana.listarIngredientes();
        System.out.print("\nNumero de Funcionarios: ");
        System.out.println(italiana.getNumeroCozinheiros());
        italiana.listarFuncionarios();

    }

}
