
public class Localitzacio
{
    private String nom;
    private double latitud;
    private double longitud;
    private double altura;

    public Localitzacio(String nom, double latitud, double longitud, double altura)
    {
        this.nom = nom;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altura = altura;
    }

    public Localitzacio(Localitzacio l)
    {
        this.nom = l.getNom();
        this.latitud = l.getLatitud();
        this.longitud = l.getLongitud();
        this.altura = l.getAltura();
    }

    public String getNom()
    {
        return (this.nom);
    }

    public double getLatitud()
    {
        return (this.latitud);
    }

    public double getLongitud()
    {
        return (this.longitud);
    }

    public double getAltura()
    {
        return (this.altura);
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setLatitud(double lat)
    {
        this.latitud = lat;
    }

    public void setLongitud(double longitud)
    {
        this.longitud = longitud;
    }

    public void setAltura(double a)
    {
        this.altura = a;
    }
}