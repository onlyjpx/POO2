package LAB3.qest2;

public class Main {
   public static void main(String[] args) {
      Calculadora calculadora = new CalculadoraAdapter(new CalculadoraBinaria());
        System.out.println("Soma: " + calculadora.somar(5, 3));
        System.out.println("Subtração: " + calculadora.subtrair(10, 4));
        System.out.println("Multiplicação: " + calculadora.multiplicar(6, 7));
   }
}