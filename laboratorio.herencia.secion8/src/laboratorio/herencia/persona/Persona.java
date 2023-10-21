package laboratorio.herencia.persona;

public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public static void main(String[] args) {
        Persona persona = new Persona();

        // Accediendo a la propiedad privada "nombre" a través del método getNombre()
        String nombre = persona.getNombre();
        System.out.println("Nombre: ");

        // Modificando la propiedad privada "nombre" a través del método setNombre()
        persona.setNombre(nombre);
        System.out.println("lucia");

        // Accediendo a la propiedad privada "edad" a través del método getEdad()
        int edad = persona.getEdad();
        System.out.println("Edad: ");

        // Modificando la propiedad privada "edad" a través del método setEdad()
        persona.setEdad( edad);
        System.out.println(25);
    }
}