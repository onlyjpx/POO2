package LAB3.qest2;

class CalculadoraAdapter implements Calculadora {
   private CalculadoraBinaria calculadoraBinaria;
   
   public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
       this.calculadoraBinaria = calculadoraBinaria;
   }
   
   public int somar(int a, int b) {
       return Integer.parseInt(calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b)), 2);
   }
   
   public int subtrair(int a, int b) {
       return Integer.parseInt(calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b)), 2);
   }
   
   public int multiplicar(int a, int b) {
       return a * b;
   }
}