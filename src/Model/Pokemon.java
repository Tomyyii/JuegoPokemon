package Model;
import java.lang.String;


//Clase envoltorio para el manejo de los pokemons, se deja abierto la posibilidad de la implementacion de una futura pokedex con el atributo Num_pokedex
public abstract class Pokemon {
    protected int Num_pokedex;
    protected String Tipo;
    protected String Temporada;
    protected double Peso;
    protected String Nombre;


    public Pokemon(int num_pokedex, String tipo, String temporada, double peso, String nombre) {
        Num_pokedex = num_pokedex;
        Tipo = tipo;
        Temporada = temporada;
        Peso = peso;
        Nombre = nombre;
    }

    public int getNum_pokedex() {
        return Num_pokedex;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String temporada) {
        Temporada = temporada;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }


    public abstract void SetSTATS(int Nivel);


}
