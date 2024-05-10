package Model;

public class Charmander extends Pokemon implements IAtaquesPokemonTipoFuego,IAtaquesPokemonComun {
    private int Nivel;
    private double Ataque;
    private double Defensa;
    private double Salud;
    private double AtaqueEspecial;
    private double Velocidad;
    private double DefensaEspecial;

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

    @Override
    public double Arañazo(int DefPokRival) {
        double Daño=(0.01*1*1*85*(((0.2*Nivel+1)*Ataque*56)/(25*DefPokRival)+2));
        return Daño;
    }

    @Override
    public double Placaje(int DefPokRival)
    {
        double Daño=(0.01*1*1*90*(((0.2*Nivel+1)*Ataque*56)/(25*DefPokRival)+2));
        return Daño;
    }




}
