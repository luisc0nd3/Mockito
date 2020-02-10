import java.util.UUID;

public class Prestamo {
    private Persona user = new Persona();
    private int capital;
    private UUID uuid;
    private int cuotas;
    private int tasaInteres;

    public Persona getPersona() {
        return user;
    }

    public void setPersona(Persona persona) {
        if (persona.isAdult()) {
            this.user = persona;
        } else {
            throw new IllegalArgumentException("El usuario debe ser mayor de edad");
        }
    }

    public int getMontoPagar() {
        return (this.capital / this.tasaInteres) * (100 + this.capital);
    }

    public int getMontoCuota() {
        return getMontoPagar() / this.cuotas;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public Persona getUser() {
        return user;
    }

    public void setUser(Persona user) {
        this.user = user;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}
