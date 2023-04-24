/*
 * @created Sun / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */
/* REFERENCES:
Cutajar, J. (2018). Beginning Java Data Structures and Algorithms (1st ed.). PACKT Publishing Limited.
Schildt, H. (2022). Java: The Complete Reference (12th ed.). McGraw Hill.
Wengrow, J., &amp; MacDonald, B. (2020). A common-sense guide to data structures and algorithms:
Level up your core programming skills (2nd ed.). The Pragmatic Bookshelf.
 */
package myco.com.MethodsAndClasses;

public class ClassStructure {

//Implementation

    //Data Attributes:

    private int varNameOne = 12;
    private String varNameTwo = "Number";
    private boolean varNameThree = true;

    //Behaviors - Methods
    private int MethodOne(int varNameOne){
        return varNameOne*2;
    }

    private boolean MethodTwo(boolean varNameThree){
        if(!varNameThree); return false;
    }

// Interface
    // Constructor(s)

    public ClassStructure(){

    }

    public ClassStructure(int varNameOne, String varNameTwo, boolean varNameThree) {
        this.varNameOne = varNameOne;
        this.varNameTwo = varNameTwo;
        this.varNameThree = varNameThree;
    }

    //Getters and Setters

    public int getVarNameOne() {
        return varNameOne;
    }

    public void setVarNameOne(int varNameOne) {
        this.varNameOne = varNameOne;
    }

    public String getVarNameTwo() {
        return varNameTwo;
    }

    public void setVarNameTwo(String varNameTwo) {
        this.varNameTwo = varNameTwo;
    }

    public boolean isVarNameThree() {
        return varNameThree;
    }

    public void setVarNameThree(boolean varNameThree) {
        this.varNameThree = varNameThree;
    }
}
