package scr.veiculo;

public class bicicleta extends veiculo{

    private Boolean pedalando = true;

    public void setPedalando(Boolean pedalando) {
        this.pedalando = pedalando;
    }

    public Boolean getPedalando() {
        return pedalando;
    }

    public void usando(){
            if (pedalando) {
                System.out.println("\nEsta pedalando");
            }
    }
}
