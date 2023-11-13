package herencia.abtraccion.sesio11;

public class  carro extends vehiculo {

    String carroceria;

    public carro(String marca, String modelo) {
        super(marca, modelo);
        this.marca="bmw";
        this.modelo="2033";
        this.carroceria = "automovil";
    }

    @Override
    public int kilometrosrecorridos() {
        return (km());
    }

    public void andar() {
        System.out.println("3. andar en carro");
    }

    public void quemarllanta() {
        System.out.println("4. quemar llantas carro");
    }

    public int km() {
        System.out.println("6. ver kilometraje carro");
        return 120;
    }
    public void kmtotal(){
        System.out.println("7. ver kilometraje total");
    }
    public void salir() {
        System.out.println("8. salir ");
    }
}



