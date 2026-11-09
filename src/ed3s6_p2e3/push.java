package ed3s6_p2e3;

public class push {
     private ED3S6_P2E3 c;

    public push(ED3S6_P2E3 c) {
        this.c = c;
    }


    public void inserta() {
        if (c.verificaLleno()) {
            return;
        }
        System.out.print("Ingresa un valor: ");
        int valor = c.sc.nextInt();
        c.cola[c.indice] = valor;
        c.indice++;
    }
}