package chainOfResponsability.example;

public class Persona {
    private String name;
    private int ci;
    private int montoPrestamo;

    public Persona(String name, int ci, int montoPrestamo) {
        this.name = name;
        this.ci = ci;
        this.montoPrestamo = montoPrestamo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(int montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }
}
