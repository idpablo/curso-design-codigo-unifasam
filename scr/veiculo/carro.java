package scr.veiculo;

public class carro extends veiculo {

    private String placa;

    private Boolean ligado;


    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
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