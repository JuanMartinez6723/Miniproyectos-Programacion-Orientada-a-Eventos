import java.util.ArrayList;

public class The_Hero extends Characters{

    private String Weapons_Heroe;

    private String skills_Heroe;

    //se hace dos Arraylist de las armas que seran solo del heroe y sus habilidades unicas
    private ArrayList <String> weapons;
    private ArrayList <String> skills;

    public The_Hero(int hP, int mP, int atack, int defense, int speed, float crit_Damage, int luck, float precision,
            int wisdom, String weapons_Heroe, String skills_Heroe) {
        super(hP, mP, atack, defense, speed, crit_Damage, luck, precision, wisdom);
        this.Weapons_Heroe = weapons_Heroe;
        this.skills_Heroe = skills_Heroe;

        this.weapons = new ArrayList<>();
        this.skills = new ArrayList<>();

        //se añade el arma predeterminada        
        this.weapons.add(weapons_Heroe);
    }
    
    public String getWeapons_Heroe() {
        return Weapons_Heroe;
    }

    public void setWeapons_Heroe(String weapons_Heroe) {
        Weapons_Heroe = weapons_Heroe;
    }

    public String getSkills_Heroe() {
        return skills_Heroe;
    }

    public void setSkills_Heroe(String skills_Heroe) {
        this.skills_Heroe = skills_Heroe;
    }

    // se hace la funcion para añadir armas y habilidades a sus listas
    public void addWeapon(String newWeapon){
        weapons.add(newWeapon);
    }

    public void addSkills(String newSkill){
        skills.add(newSkill);
    }

    // se hacen los gets para obtener los datos de las listas
    public ArrayList<String> getWeapons() {
        return weapons;
    }

    public ArrayList<String> getSkills(){
        return skills;
    }

    @Override
    public String toString() {
        return "The_Hero [Weapon=" + Weapons_Heroe + ", HP:" + getHP() + ", MP:"
                + getMP() + ", Atack:" + getAtack() + ", Defense:" + getDefense() + ", Crit_Damage:"
                + getCrit_Damage() + ", Luck:" + getLuck() + ", Precision:" + getPrecision() + weapons + skills +"]";
    }


    



}