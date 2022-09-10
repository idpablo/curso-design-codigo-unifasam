package service;

import model.Pessoa;

import java.math.BigDecimal;

public class CalculaSalario {

    private TipoCargo tipoCargo;

    public CalculaSalario(TipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public Pessoa calculaSalarioLiquido(Pessoa pessoa) {
        BigDecimal salarioLiquido = BigDecimal.ZERO;

        if (tipoCargo.CORDENADOR.equals(tipoCargo)) {
            salarioLiquido = pessoa.getSalarioBruto()
                    .add(new BigDecimal("100.00"))
                    .subtract(new BigDecimal("50.00"));
        }
        if (tipoCargo.DIRETOR.equals(tipoCargo)) {
            salarioLiquido = pessoa.getSalarioBruto()
                    .add(new BigDecimal("250.00"))
                    .subtract(new BigDecimal("60.00"));
        }
        pessoa.setSalarioLiquido(salarioLiquido);
        return pessoa;
    }
}
