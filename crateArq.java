import java.io.*;

public class crateArq {
    public static void main(String[] args) {


        try{
            File arquivo = new File("saida/Curso.txt");

            arquivo.createNewFile();

            if (arquivo.isFile() == true){

                OutputStream os = new FileOutputStream("file1.txt");
                Writer wr = new OutputStreamWriter(os);
                BufferedWriter arq = new BufferedWriter(wr);

                arq.write("Nome: Pablo Bento Soares");
                arq.newLine();
                arq.write("Curso: Boas Praticas de Programação - Prodata");
            }
            
        } catch (Exception c){
            c.printStackTrace();
        }
    }
}

