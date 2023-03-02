package Unit;

public class Character {
    String name;
    protected int hp;
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
