package scr;

import javax.sound.midi.Soundbank;
import java.io.*;

public class createArq {
    public void Arq() {

        try {
            String name = "Curso.txt";
            OutputStream nameArq = new FileOutputStream(name);
            Writer writer = new OutputStreamWriter(nameArq);
            BufferedWriter arqWriter = new BufferedWriter(writer);

            System.out.println("Criando e gravando aquivo...");

            arqWriter.write("Nome: Pablo Bento Soares.");
            arqWriter.newLine();
            arqWriter.write("Curso: Boas Praticas no Desenvolvimento de Software.");
            arqWriter.close();

            System.out.printf("\nGravação concluida: " + name + "\n");


        }catch( IOException exc){
            exc.printStackTrace();
        }
    }
}