import java.util.ArrayList;

//ejemplo para verificar que todo este funcionando 

public class App {
    public static void main(String[] args) throws Exception{
        The_Hero the_Hero = new The_Hero(22, 0, 8, 6, 6, 1.5f, 3, 3.0f, 5, "soldier sword", "Galaxy Impact");
        
        Enemy limo = new Enemy(3, 5, 5, 3, 2, 1, 1, 2, 2, TypeEnemy.AGGRESSIVE);
        limo.addSkills("Placaje");

        Enemy berenjeno = new Enemy(5, 10, 2, 3, 6, 1, 2, 1, 1, TypeEnemy.HEALER);
        berenjeno.addSkills("Cura Total");

        Enemy pinchorugo = new Enemy(10, 05, 2, 10, 1, 3, 1, 2, 1, TypeEnemy.DEFENSIVE);
        pinchorugo.addSkills("Defensa ferrea");

        Enemy labibabosa = new Enemy(10, 10, 50, 02, 02, 05, 05, 01, 01, TypeEnemy.SORCERER);
        labibabosa.addSkills("Bola de fuego");

        ArrayList<Characters> enemigos = new ArrayList<>();
        enemigos.add(limo);
        enemigos.add(berenjeno);
        enemigos.add(pinchorugo);
        enemigos.add(labibabosa);
        
        for (Characters enemigo : enemigos) {
            Enemy e = (Enemy) enemigo;
            System.out.println(e);
            System.out.println("Acción decidida: " + e.decideAction());
        }
        
        ArrayList <Characters> listaCharacters = new ArrayList<Characters>();
        
        listaCharacters.add(the_Hero);
        
        the_Hero.addSkills("Dragon slash");
        
        if(the_Hero.getWeapons_Heroe().equals("soldier sword") && the_Hero.getSkills_Heroe().equals("Galaxy Impact")){
            the_Hero.setAtack(the_Hero.getAtack() + 100);
        }
        
        if(the_Hero.getWeapons_Heroe().equals("soldier sword")){
            the_Hero.setAtack(the_Hero.getAtack() + 5);
        }

        System.out.println(listaCharacters);
        

        
    }
    
}
