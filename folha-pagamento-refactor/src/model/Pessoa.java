package model;

import service.TipoCargo;
import java.time.LocalDate;
import java.math.BigDecimal;

public class Pessoa {
    private String nome;
    private TipoCargo cargo;
    private LocalDate dataNascimento;
    private LocalDate dataAdmissao;
    private Integer idade;
    private BigDecimal salarioBruto;
    private BigDecimal salarioLiquido;

    public Pessoa(String nome, TipoCargo cargo, LocalDate dataNascimento, LocalDate dataAdmissao, Integer idade, BigDecimal salarioBruto, BigDecimal salarioLiquido) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.idade = idade;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCargo getCargo() {
        return cargo;
    }

    public void setCargo(TipoCargo cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public BigDecimal getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(BigDecimal salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public BigDecimal getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(BigDecimal salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public static class Builder(){
        private String nome;
        private TipoCargo cargo;
        private LocalDate dataNascimento;
        private LocalDate dataAdmissao;
        private Integer idade;
        private BigDecimal salarioBruto;
        private BigDecimal salarioLiquido;

        public Builder(){
        }

        public nome(String nome){
            this.nome = nome;
        }
    }
}
