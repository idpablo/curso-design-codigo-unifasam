package java;

public class MeuApp {
    public static void main(String[] args) {

        //polimorofismo
        CrudDAO funcionariodao = new FuncionarioDAO();
        funcionariodao.salvar(funcionariodao);

        //instanceOff
        FuncionarioDAO funcionario = new FuncionarioDAO();

        if (funcionario instanceof CrudDAO){
            funcionario.salvar(funcionario);
            System.out.println("Executado");
        }else{
            System.err.println("A classe funcionarioDAO não implementa CrudDAO, nenhum procedimento foi realizado");
        }
    }
}
