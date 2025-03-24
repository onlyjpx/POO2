package LAB3.qest3;

public class Main {
   public static void main(String[] args) {
      ConectorAudio bluetoothAdapter = new BluetoothAdapter(new CaboP2());
        bluetoothAdapter.conectar();
   }
}