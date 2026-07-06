public class ClaseMath {
    public static void main(String[] args) {

        //int  raiz = (int) Math.sqrt(9);
        double raiz = Math.sqrt(9);
        System.out.println("raiz = " + raiz);

        double base =5;
        double exponente = 2;
        double potencia = Math.pow(base,exponente);
        System.out.println("potencia = " + potencia);

        float numero = 4.566f;
        int redondear = Math.round(numero);
        System.out.println("redondear = " + redondear);
        
        int random = (int) (Math.random() * 10) + 1;
        System.out.println("random = " + random);

    }
}