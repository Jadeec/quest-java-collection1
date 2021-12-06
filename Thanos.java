import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	List<Hero> heroes = new ArrayList<Hero>(); 
    	
      
    	heroes.add(new Hero("black widow", 34)); 
    	heroes.add(new Hero("Captain America", 100)); 
    	heroes.add(new Hero("Vision", 3)); 
    	heroes.add(new Hero("Iron Man", 48)); 
    	heroes.add(new Hero("Scarlet Witch", 29)); 
    	heroes.add(new Hero("Thor", 1500)); 
    	heroes.add(new Hero("Doctor Strange", 42)); 
    	heroes.add(new Hero("Hulk", 49)); 
    	
      

        // TODO 3 : It's Thor birthday, now he's 1501
    	heroes.set(5,new Hero("Thor", 1501)); 
    	

        // TODO 4 : Shuffle the heroes list
    	Collections.shuffle(heroes);
    	

        // TODO 5 : Keep only the half of the list
    	List<Hero> remaningHeroes = heroes.subList(0, 4); 
    	

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    	for (Hero currentHero : remaningHeroes) {
    		System.out.println(currentHero.toString());
    		
    	}
    }
}
