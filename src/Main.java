import Model.Bulbasaur;
import Model.Pikachu;
import Model.Pokemon;

public class Main {
    public static void main(String[] args) {

        //SE CREAN INSTANCIAS DE TIPO PIKACHU Y BULBASAUR

        Pikachu pokemon1=new Pikachu(22,"Electrico","1",6,"Pikachu",5);
        Bulbasaur pokemon2=new Bulbasaur(22,"Electrico","1",6,"Bulbasaur",5);

        //SE INICIALIZAN LAS STATS DE ACUERDO AL NIVEL DEL POKEMON
        pokemon2.SetSTATS(5);
        pokemon1.SetSTATS(5);
        boolean flag=true;


        //SE RECREA UNA SIMULACION DE UNA BATALLA POKEMON ENTRE PIKACHU Y BULBASAUR, SE DETERMINA EL GANADOR CUANDO UNO DE LOS DOS TENGA UNA SALUD MENOR O IGUAL A 0

        while (flag==true)
        {
            System.out.println("VIDA PIKACHU:"+ pokemon1.getSalud());
            System.out.println("VIDA BULBASAUR:"+ pokemon2.getSalud());
            System.out.println("Pikachu ha usado ARAÑAZO");
            double daño=pokemon1.Placaje(pokemon2.getDefensa());
            pokemon2.setSalud((pokemon2.getSalud()-daño));
            System.out.println("Bulbasaur ha usado ARAÑAZO");
            daño=pokemon2.Placaje(pokemon1.getDefensa());
            pokemon1.setSalud((pokemon1.getSalud()-daño));
            if(pokemon1.getSalud()<=0)
            {
                flag=false;
            } else if (pokemon2.getSalud()<=0)
            {
                flag=false;
            }
        }

        if (pokemon1.getSalud()<=0)
        {
            System.out.println("BULBASAUR HA GANADO EL COMBATE :)");
        }
        else if (pokemon2.getSalud()<=0)
        {
            System.out.println("PIKACHU HA GANADO EL COMBATE :)");
        }





    }
}