public class Teste {
    public static void main (String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }
    public static void metodo1(){
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }
    public static void metodo2(){
        System.out.println("Inicio do método 2");
        int[] vetor = new int[10];
        for (int i = 0 ; i <= 15; i++){
            try {
                vetor[i] = i;
                System.out.println(i);
                if (i == 9) {
                    try {
                        int vlr = vetor[i] / vetor[0];
                        System.out.println(vlr);
                    } catch (ArithmeticException e) {
                        System.err.println("Impossível dividir por 0");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("O vetor possui apenas 10 posições");
                break;
            }
        }
        System.out.println("Fim do método 2");
    }
}
