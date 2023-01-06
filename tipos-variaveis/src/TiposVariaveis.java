public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);
        System.out.println(numeroCurto2);

    }
}
