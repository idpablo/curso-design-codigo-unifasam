package service;

import model.Pessoa;

import java.math.BigDecimal;

public class Diretor  implements CalculaSalario{
    public Pessoa calculaSalarioLiquido(Pessoa pessoa) {
       BigDecimal salarioLiquido = pessoa.getSalarioBruto()
                .add(new BigDecimal("100.00"))
                .subtract(new BigDecimal("800.00"));
       pessoa.setSalarioLiquido(salarioLiquido);
        return pessoa;
    }
}
