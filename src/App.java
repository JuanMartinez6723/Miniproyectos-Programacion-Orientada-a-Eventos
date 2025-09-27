import java.util.ArrayList;
import java.util.Scanner;

//ejemplo para verificar que todo este funcionando 

public class App {
    public static void main(String[] args) throws Exception{
        The_Hero the_Hero = new The_Hero(22, 0, 8, 6, 6, 1.5f, 3, 3.0f, 5, "soldier sword", "Galaxy Impact");

        
        ArrayList <Characters> listaCharacters =
        new ArrayList<Characters>();
        
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
