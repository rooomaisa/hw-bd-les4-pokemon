public class Pokemon {

//    variabelen
    private String type;
    private int hp;

//Constructor
    public Pokemon(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }

//    methode
    public void attack (Pokemon opponent) {
        System.out.println( this.type + " attacks " + opponent.type );
    }
    public void defend (Pokemon attacker) {
        System.out.println( this.type + " attacks " + attacker.type );
    }



//    getters
    public String getType() {
        return type;
    }
    public int getHp() {
        return hp;
    }

//    setters
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setType(String type) {
        this.type = type;
    }


}
