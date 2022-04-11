public class Puertas {
    static class coche {
        public int Puertas = 5;

        public void AñadirPuerta() {
            this.Puertas++;
        }
    }

    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.AñadirPuerta();
        System.out.println(micoche.Puertas);
    }
}
