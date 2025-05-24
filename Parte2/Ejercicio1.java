public class Ejercicio1 {
    public class contador{
        int contador;
        public contador(int contador) {
            this.contador = contador;
        }
    
        public void incrementar() {
            contador++;
        }
    
        public void decrementar() {
            contador--;
        }
    
        public void mostrarContador() {
            System.out.println("Contador: " + contador);
        }
    }

}
