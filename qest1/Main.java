public class Main {
   public static void main(String[] args) {
       Ave pato = new Pato();
       Ave pavaoAdaptado = new PavaoAdapter(new Pavao());
       
       pato.voar();
       pato.emitirSom();
       
       pavaoAdaptado.voar();
       pavaoAdaptado.emitirSom();
   }
}