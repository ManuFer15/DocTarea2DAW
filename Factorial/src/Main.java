public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num = 5;
        double resultado = calcularFactorial(num);
        System.out.println("Factorial de " + num + " = " + resultado);
    }
    /**
     * @param num
     * @return double
     */
    public static double calcularFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El numero debe ser positivo");
        }

        double resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}