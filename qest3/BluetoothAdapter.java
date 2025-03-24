package LAB3.qest3;

class BluetoothAdapter implements ConectorAudio {
   private CaboP2 caboP2;
   public BluetoothAdapter(CaboP2 caboP2) {
       this.caboP2 = caboP2;
   }
   public void conectar() {
       System.out.println("Adaptando conexão para Bluetooth...");
       caboP2.conectarP2();
   }
}