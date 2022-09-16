import model.Pessoa;
import service.CalculaSalario;
import service.TipoCargo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TesteFolhaPagamento {
    public static void main(String[] args) {
         try(Scanner entrada = new Scanner(System.in)){

             System.out.printf("Salario Bruto: ");
             BigDecimal salarioBruto = entrada.nextBigDecimal();

             System.out.println("Informe o Cargo: \n 1 - Cordenador\n 2 - Diretor");
             int opcaoCargo = entrada.nextInt();
             TipoCargo tipoCargo = TipoCargo.values()[opcaoCargo -1];

             CalculaSalario calculaSalario = tipoCargo.getCargo();

             Pessoa pessoa = new Pessoa.Builder()
                     .nome("Pablo")
                     .cargo(tipoCargo)
                     .dataAdmissao(LocalDate.now())
                     .salarioBruto(salarioBruto)
                     .build();

             Pessoa pessoaPagar = calculaSalario.calculaSalarioLiquido(pessoa);

             System.out.printf("O Sario liquido do "
             .concat(pessoaPagar.getNome())
             .concat(" com o cargo:")
             .concat(pessoaPagar.getCargo().name())
             .concat("é R$%.2f"),
             pessoaPagar.getSalarioLiquido());
         }
    }
}
