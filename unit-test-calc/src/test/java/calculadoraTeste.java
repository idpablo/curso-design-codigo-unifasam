import org.junit.Test;

public class calculadoraTeste {

    int a = 20;
    int b = 2;

    @Test
    public void somar(){

        calculadora calc = new calculadora();

        calc.somar(a,b);
    }
    @Test
    public void subtrair(){

        calculadora calc = new calculadora();

        calc.subtrair(a,b);
    }
    @Test
    public void multiplicar(){

        calculadora calc = new calculadora();

        calc.multiplicar(a,b);
    }
    @Test
    public void dividir(){

        calculadora calc = new calculadora();

        calc.dividir(a,b);
    }

}
