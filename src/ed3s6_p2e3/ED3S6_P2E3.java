package ed3s6_p2e3;

import java.util.Scanner;

public class ED3S6_P2E3 {

   final int TAMAX = 10;
    int[] cola = new int[TAMAX];
    int indice = 0;         
    Scanner sc = new Scanner(System.in);

   
    public boolean verificaLleno() {
        if (indice > TAMAX - 1) {
            System.out.println("Cola llena");
            return true;
        }
        return false;
    }

   
    public boolean verificaVacio() {
        if (indice <= 0) {
            System.out.println("Cola vacia");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       ED3S6_P2E3 c = new ED3S6_P2E3();
        push objPush = new push(c);
        pop objPop = new pop(c);
        int opcion;

        do {
            System.out.println("\n1. Push (encolar)  2. Pop (desencolar)  3. Listar");
            System.out.println("4. Cola llena?     5. Cola vacia?       6. Recorrer  0. Salir");
            System.out.print("Opcion: ");
            opcion = c.sc.nextInt();

            switch (opcion) {
                case 1: objPush.inserta(); break;
                case 2: objPop.elimina(); break;
                case 3: objPop.listar(); break;
                case 4:
                    if (!c.verificaLleno()) {
                        System.out.println("La cola NO esta llena (" + c.indice + "/" + c.TAMAX + ")");
                    }
                    break;
                case 5:
                    if (!c.verificaVacio()) {
                        System.out.println("La cola NO esta vacia (" + c.indice + " elementos)");
                    }
                    break;
                case 6: objPop.recorrer(); break;
                case 0: System.out.println("Fin"); break;
                default: System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }
}