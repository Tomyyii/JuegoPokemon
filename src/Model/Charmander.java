package Model;

public class Charmander extends Pokemon implements IAtaquesPokemonTipoFuego,IAtaquesPokemonComun {
    private int Nivel;
    private double Ataque=52;
    private double Defensa=43;
    private double Salud=39;
    private double AtaqueEspecial=60;
    private double Velocidad=65;
    private double DefensaEspecial=50;

    public Charmander(int num_pokedex, String tipo, String temporada, double peso, String nombre, int nivel) {
        super(num_pokedex, tipo, temporada, peso, nombre);
        Nivel = nivel;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public double getAtaque() {
        return Ataque;
    }

    public void setAtaque(double ataque) {
        Ataque = ataque;
    }

    public double getDefensa() {
        return Defensa;
    }

    public void setDefensa(double defensa) {
        Defensa = defensa;
    }

    public double getSalud() {
        return Salud;
    }

    public void setSalud(double salud) {
        Salud = salud;
    }

    public double getAtaqueEspecial() {
        return AtaqueEspecial;
    }

    public void setAtaqueEspecial(double ataqueEspecial) {
        AtaqueEspecial = ataqueEspecial;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double velocidad) {
        Velocidad = velocidad;
    }

    public double getDefensaEspecial() {
        return DefensaEspecial;
    }

    public void setDefensaEspecial(double defensaEspecial) {
        DefensaEspecial = defensaEspecial;
    }

    //Se inicializan las stats de acuerdo al nivel del pokemon, por cada nivel se incrementa un 5% de sus stats anteriores
    @Override
    public void SetSTATS(int Nivel1) {
        int i=0;
        while (i<=Nivel1)
        {
            Ataque=Ataque+(Ataque*0.05);
            Defensa=Defensa+(Defensa*0.05);
            Salud=Salud+(Salud*0.05);
            DefensaEspecial=DefensaEspecial+(AtaqueEspecial*0.05);
            AtaqueEspecial=AtaqueEspecial+(AtaqueEspecial*0.05);
            i++;
        }
        Nivel=Nivel1;
    }


    //Implementacion de metodos de la interfaz IAtaquesPokemonComun e IAtaquesPokemonFuego
    @Override
    public double Arañazo(double DefPokRival) {
        double Daño=(0.01*1*1*85*(((0.2*Nivel+1)*Ataque*56)/(25*DefPokRival)+2));
        return Daño;
    }

    @Override
    public double Placaje(double DefPokRival)
    {
        double Daño=(0.01*1*1*90*(((0.2*Nivel+1)*Ataque*56)/(25*DefPokRival)+2));
        return Daño;
    }

    @Override
    public double lanzallamas(double DefEspRivPokemon) {
         double Daño=(0.01*1.5*1*90*(((0.2*Nivel+1)*Ataque*90)/(25*DefEspRivPokemon)+2));
         return Daño;
    }

    @Override
    public double llamarada(double DefEspRivPokemon) {
        double Daño=(0.01*1.5*1*90*(((0.2*Nivel+1)*Ataque*110)/(25*DefEspRivPokemon)+2));
        return Daño;
    }




}
