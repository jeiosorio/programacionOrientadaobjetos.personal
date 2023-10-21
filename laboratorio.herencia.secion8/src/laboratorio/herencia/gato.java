package laboratorio.herencia;

class Gato extends animal {
    public String raza = " soy un gato ";
    public void angora() {
        System.out.println(" mi raza es angora");
    }
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.gato();
        gato.angora();

        System.out.println(gato.raza);
        System.out.println(gato.especie + " felino ");
    }
}
