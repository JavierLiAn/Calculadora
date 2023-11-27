

public class Calculadora {
    static int num1 = 5;
    static int num2 = 2;
    public static void main(String[] args) {
        sumar();
        restar(num1,num2);
        dividir();
        multiplicar(num1, num2);
    }

    static void sumar() {
        int suma;
        suma= num1 + num2;
        System.out.println("El resultados de la suma es: " + suma);
    }

    static void restar(int entero1,int entero2) {
        int resta;
        resta = entero1 - entero2;
        System.out.println("Resultado de la resta: "+resta);
    }

    static void dividir() {
        //Mar
    }

    static void multiplicar(int numero, int multiplicador) {
        //Javier
        int resultado = 0;
        for (int i = 0; i <= multiplicador-1; i++) {
            resultado += numero;
        }
        System.out.println(resultado);

    }
}
