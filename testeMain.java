import java.io.*;

public class testeMain {
    public static void main(String[] args) throws IOException {

        createArq arq = new createArq();

        arq.Arq();
        System.out.println();

        if (arq.equals(false)){
            System.out.printf("arquivo não foi criado");
        }
    }
}

