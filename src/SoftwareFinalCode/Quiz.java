package SoftwareFinalCode;

/**
 * A class that create Quiz class which is set of questions.
 * @author Sunha
 */

import java.util.ArrayList;

public class Quiz {
    // Two array lists to store Question object
    // The first array list stores questions of car type.
    // The second arrya list sotres questions of car brand.
    private ArrayList<Question> commonQs = new ArrayList<>(); 
    private ArrayList<Question> carBrandQs = new ArrayList<>();

    /**
     * A default constructor of this class.
     */
    public Quiz() {
    }    
    
    /**
     * A method that add a question object of car type to array list commonQs.
     * @param q 
     */
    public void addCarTypeQ(Question q){ 
        this.commonQs.add(q);
    } 
    
    /**
     * A method that add a question object of car brands to array list carBrandQs.
     * @param q 
     */
    public void addCarBrandQ(Question q){
        this.carBrandQs.add(q);        
    } 
    
    /**
     * A accessor that reads getCommonQs data field and return it.
     * @return commonQs
     */
    public ArrayList<Question> getCommonQs() {
        return commonQs;
    }

    /**
     * A accessor that reads getCarBrandQs data field and return it
     * @return carBrandQs
     */
    public ArrayList<Question> getCarBrandQs() {
        return carBrandQs;
    }
    
}
