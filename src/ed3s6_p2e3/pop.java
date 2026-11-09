package ed3s6_p2e3;


public class pop {
    private ED3S6_P2E3 c;

    public pop(ED3S6_P2E3 c) {
        this.c = c;
    }


    public void elimina() {
        if (c.verificaVacio()) {
            return;
        }
        System.out.println("Se elimino: " + c.cola[0]);
 
        for (int i = 0; i < c.indice - 1; i++) {
            c.cola[i] = c.cola[i + 1];
        }
        c.indice--;
    }


    public void listar() {
        if (c.verificaVacio()) {
            return;
        }
        for (int i = 0; i <= c.indice - 1; i++) {
            System.out.println("Cola[" + i + "] = " + c.cola[i]);
        }
    }

 
    public void recorrer() {
        if (c.verificaVacio()) {
            return;
        }
        System.out.print("Frente -> ");
        for (int i = 0; i <= c.indice - 1; i++) {
            System.out.print(c.cola[i] + " -> ");
        }
        System.out.println("Final");
    }
}