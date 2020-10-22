package pkg8.practicatdahanoi;

public class PracticaTDAHanoi {

    
    public static void main(String[] args) {
        PracticaTDAHanoi objHanoi = new PracticaTDAHanoi();
        objHanoi.torresHanoi(3, 1, 2, 3);
        System.out.println("juego completo");
    }
    // crear un metodo recursivo para solucionar las torres de hanoi
    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
        if (discos==1){
            System.out.println("mover disco de torre" + torre1 + "a torre" + torre3);
        } else{
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("mover disco de torre" + torre1 + "a torre" + torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }
}
