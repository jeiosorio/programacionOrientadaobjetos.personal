package laboratorio.herencia;

class Perro extends animal {
    public String raza=" soy un perro";
    public void pitbill() {
        System.out.println(" mi raza es pitbul ");
    }
    public static void main(String[] args) {
        Perro perro = new Perro();

        perro.perro();
        perro.pitbill();

        System.out.println(perro.raza);
        System.out.println(perro.especie + " canina ");
    }
}