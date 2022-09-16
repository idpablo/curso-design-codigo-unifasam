package service;

import model.Pessoa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ImpressaoHolerite implements CalculaSalario {
    private CalculaSalario calculaSalario;

    public ImpressaoHolerite(CalculaSalario calculaSalario) {
        this.calculaSalario = calculaSalario;
    }

    @Override
    public Pessoa calculaSalarioLiquido(Pessoa pessoa) {
        Pessoa pessoaCalculada = calculaSalario.calculaSalarioLiquido(pessoa);

        try(PrintStream write = new PrintStream(new FileOutputStream("holerite.txt"))) {
            write.println(
         "Nome: " + pessoaCalculada.getNome() +
            " Cargo: " + pessoaCalculada.getCargo() +
            " Salario Bruto: " + pessoaCalculada.getSalarioBruto() +
            " Salario Liquido: " + pessoaCalculada.getSalarioLiquido());
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        return pessoaCalculada;
    }
}
