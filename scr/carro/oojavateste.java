package scr.carro;

import java.sql.SQLOutput;

public class oojavateste {
    public static void main(String[] args) {
        System.out.printf("Teste carro");

        Oojava oo = new Oojava();

        oo.setModelo("Gol");
        oo.setMarca("Volksvage,");
        oo.setCor("Rosa");
        oo.setPlaca("RF3PIFG");
        oo.setLigado(true);


        System.out.println("O carro");
        System.out.println("\nModelo: " + oo.getModelo());
        System.out.println("Marca: " + oo.getMarca());
        System.out.println("Cor: " + oo.getCor());
        System.out.println("Placa: " + oo.getPlaca());


        System.out.println("Ligandado o carro");
            oo.liga();
        System.out.println("Acelerando");
            oo.acerela();
        System.out.println("Desligando o carro");
            oo.desliga();

    }
}
