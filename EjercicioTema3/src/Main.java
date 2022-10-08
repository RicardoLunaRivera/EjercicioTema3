
public class Main {
    public static void main(String[] args) {
        System.out.println(sumar(10, 15, 20));

        //Creando un coche
        Coche coche1 = new Coche();
        //imprimir el numero de puertas inicial
        System.out.println(coche1.numeroPuertas);

        //Mandar a realizar un incremento de puertas
        coche1.incremento();
        System.out.println(coche1.numeroPuertas);
    }



    //Funcion de SUMA de 3 números
    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 +num3;

    }
}

