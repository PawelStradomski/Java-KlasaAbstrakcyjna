
package klasaabstrakcyjna;
/**
 * 
 * @author pawelstradomski
 */


public class KlasaAbstrakcyjna {

    
    public static void main(String[] args) {
        
        Pies pies = new Pies();
        pies.iloscLap(4);
        pies.rusz();
        
        Kot kot = new Kot();
        kot.iloscLap(4);
        kot.rusz();
        
        Zwierz zwierzaki[] = {pies, kot};
        zwierzaki[0].rusz();
        zwierzaki[1].rusz();
        
        
        
        
        
        
        //Nie mozemy utworzyc instacji klasy abstrakcyjnej tzn obiektu(instacji): Zwierz
        //Mozemy utworzyc instancje obiektu klasy dziedziczacej po Zwierzu tzn: Pies
        
        
        
        
        
    }
    
}
