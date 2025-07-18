public class Ordenador {
    public static void main(String[] args) {
        double valorPc = 660;
        double descuento = 0.10;

        double total = valorPc - (valorPc * descuento);

        System.out.printf("El valor total a pagar por el PC es de %.2f€\n", total);
    }
}
