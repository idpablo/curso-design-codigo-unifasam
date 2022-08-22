import java.io.*;

public class createArq {
    public void Arq() {

        try {

            OutputStream nameArq = new FileOutputStream("Curso.txt");
            Writer writerArq = new OutputStreamWriter(nameArq);
            BufferedWriter arq = new BufferedWriter(writerArq);

            arq.write("Nome: Pablo Bento Soares");
            arq.newLine();
            arq.write("Curso: Design Codigo UniFasam");
            arq.close();

        }catch( IOException exc){
            exc.printStackTrace();
        }
    }
}