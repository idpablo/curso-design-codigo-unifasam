package scr;
import java.io.*;

public class testeMain{
    public static void main(String[] args) throws IOException{

        createArq arq = new createArq();

        //Chama função reposavel por criar e escrever no arquivo.txt
        arq.Arq();
    }
}

