

public class FirePokemon extends Pokemon {



    //       2 private variable
    private String attack;
    private String defends;
    // constructor


//    1 constructor wat wil ik min hebben als ij een firepokemon wilt maken
    public FirePokemon(String type, int hp, String attack, String defends) {
        super(type, hp); //roept de constructor aan van de superclass
        this.attack= attack;
        this.defends = defends;

    }

        //overide van een methode in de superclass
    @Override
    public void attack(Pokemon opponent) {
        super.attack(opponent);

    }
//            2 methodes 2 acties die een firepokemon kan doen
//    bijv de fire lash en flamethrower
    public void Firelash(){
        System.out.println( getType()+ "slash fire" + attack);
    }



//    2 getters en setters van die private variable hier

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }
    public String getDefends() {
        return defends;
    }

    public void setDefends(String defends) {
        this.defends = defends;
    }



    }
}
