package scr.carro;

public class Oojava {

    private String modelo;
    private String marca;
    private String cor;
    private String placa;

    private Boolean ligado;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void liga() {
        ligado = true;
    }

    public void desliga() {
        ligado = false;
    }

    public void acerela() {
        try {
            if (!ligado) {
                throw new Exception("O carro esta desligado");
            } else {
                System.out.println("Acerelando");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}