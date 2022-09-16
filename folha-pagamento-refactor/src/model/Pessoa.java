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

    public Pessoa(Builder builder) {
        setNome(builder.nome);
        setCargo(builder.cargo);
        setDataNascimento(builder.dataNascimento);
        setDataAdmissao(builder.dataAdmissao);
        setIdade(builder.idade);
        setSalarioBruto(builder.salarioBruto);
        setSalarioLiquido(builder.salarioLiquido);
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

    public static final class Builder {
        private String nome;
        private TipoCargo cargo;
        private LocalDate dataNascimento;
        private LocalDate dataAdmissao;
        private Integer idade;
        private BigDecimal salarioBruto;
        private BigDecimal salarioLiquido;

        public Builder(){
        }

        public Builder nome (String nome){
            this.nome = nome;
            return this;
        }

        public Builder cargo (TipoCargo cargo){
            this.cargo = cargo;
            return this;
        }

        public Builder dataNascimento (LocalDate dataNascimento){
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder dataAdmissao (LocalDate dataAdmissao){
            this.dataAdmissao = dataAdmissao;
            return this;
        }

        public Builder idade (Integer idade){
            this.idade = idade;
            return this;
        }

        public Builder salarioBruto (BigDecimal salarioBruto){
            this.salarioBruto = salarioBruto;
            return this;
        }

        public Builder salarioLiquido (BigDecimal salarioLiquido){
            this.salarioLiquido = salarioLiquido;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(this);
        }
    }

}
