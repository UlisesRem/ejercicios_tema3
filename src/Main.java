public class Main {
    public static void main(String[] args) {
        suma(3, 5, 6);
        Coche miCoche = new Coche();
        miCoche.aumentarPuerta();
        miCoche.aumentarPuerta();
        miCoche.aumentarPuerta();
        System.out.println("El coche tiene: "+ miCoche.puertas + " puertas");
    }


    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println("El resultado de la suma es: "+ resultado);
    }

    static class Coche{
        public int puertas = 0;

        public void aumentarPuerta(){
            this.puertas++;
        }
    }

}
