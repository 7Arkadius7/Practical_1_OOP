package Unit;

public abstract class Character implements GameInterface {

    private static int chaCnt = 10;
    public static int getChaCnt() {return  chaCnt}
    String name;
    private int hp;
    protected int attack;
    protected int speed;
    protected int stamina;

    public Character(String name, int hp, int attack, int speed, int stamina) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.speed = speed;
        this.stamina = stamina;
    }
}
