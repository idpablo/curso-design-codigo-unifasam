package service;

import model.Pessoa;

import java.math.BigDecimal;

public class Coordenador implements CalculaSalario {
    @Override
    public Pessoa calculaSalarioLiquido(Pessoa pessoa) {
        BigDecimal salarioLiquido = pessoa.getSalarioBruto()
                .add(new BigDecimal("100.00"))
                .subtract(new BigDecimal("50.00"));
        pessoa.setSalarioLiquido(salarioLiquido);
        return pessoa;
    }
}
