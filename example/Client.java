package chainOfResponsability.example;

public class Client {
    public static void main(String[] args) {
        Persona p1 = new Persona("juan", 346768468, 10000);
        Persona p2 = new Persona("juan2", 3838383, 30000);
        Persona p3 = new Persona("juan3", 3536356, 40000);
        Persona p4 = new Persona("juan4", 533553, 60000);

        Organizador organizador = new Organizador();
        organizador.criteriaHandler(p1.getMontoPrestamo());
        organizador.criteriaHandler(p2.getMontoPrestamo());
        organizador.criteriaHandler(p3.getMontoPrestamo());
        organizador.criteriaHandler(p4.getMontoPrestamo());
    }
}
