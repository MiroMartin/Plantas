package logica;

public class Flor extends Planta{

    private String colorPetalos;
    private double promPetalos;
    private String colorPistillos;
    private String variedadFlor;
    private String estacionFlorece;

    public Flor(){

    }

    public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, double promPetalos, String colorPistillos, String variedadFlor, String estacionFlorece) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.promPetalos = promPetalos;
        this.colorPistillos = colorPistillos;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getPromPetalos() {
        return promPetalos;
    }

    public void setPromPetalos(double promPetalos) {
        this.promPetalos = promPetalos;
    }

    public String getColorPistillos() {
        return colorPistillos;
    }

    public void setColorPistillos(String colorPistillos) {
        this.colorPistillos = colorPistillos;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy una flor");
    }
}
