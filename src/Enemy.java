import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Characters {

    private TypeEnemy type; // Se guarda el tipo de enemigo
    private ArrayList<String> skills; // Almacena las habilidades
    private Random random; // Randomiza el tipo de accion que utiliza

    public Enemy(int hP, int mP, int atack, int defense, int speed, float crit_Damage, int luck, float precision,
            int wisdom, TypeEnemy type) {
        super(hP, mP, atack, defense, speed, crit_Damage, luck, precision, wisdom);
        this.type = type;
        this.random = new Random();
        this.skills = new ArrayList<>(); 
    }

    public TypeEnemy getType() {
        return type;
    }

    public void setType(TypeEnemy type) {
        this.type = type;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void addSkills(String skill){
        skills.add(skill);
    }

    public String decideAction(){ // Acciones de los enemigos
        switch (type) {
            case AGGRESSIVE:
                return "attack";
            case HEALER:
                return getHP() < getHP() * 0.4 ? "heal" : "attack";
            case DEFENSIVE:
                return random.nextBoolean() ? "defend" : "attack";
            case SORCERER:
                return getMP() >= 5 ? "Use skill" : "attack";
            default:
                return "attack";
        }
    }

    @Override
    public String toString() { 
        return "Enemy [Type= " + type + ",HP = "+ getHP() + "Atack ="+ getAtack() +" Skills=" + skills + "]";
    }
    
}
