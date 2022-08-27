package scr.createArq;
import java.io.*;

public class createArq {
    public void Arq() throws IOException{

        try {
            String name = "Curso.txt";

            //Declarando metodos de criação e escrita de arquivo
            OutputStream nameArq = new FileOutputStream(name);
            Writer writer = new OutputStreamWriter(nameArq);
            BufferedWriter arqWriter = new BufferedWriter(writer);

            System.out.println("Criando e gravando aquivo...");

            //Inserindo String no arquivo .txt Criado
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