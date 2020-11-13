package judges;

import java.util.Arrays;


public class Marks {

    /**
    @param nbJudges int : represents the number of judges 
    @param nbCriteria int : represents the number of criteria
    @param higherMarkAllowed int : represents the higher mark authorized (for exemple 20)
    @param tab int : 2D list which contains judges and criterias 
     */

    private int nbJudges; 

    private int nbCriteria;

    private int higherMarkAllowed;

    private int[][] marks; 

    // Constructor of the class Marks 
    public Marks(int nbJudges, int nbCriteria, int higherMarkAllowed) {
        this.nbJudges = nbJudges;
        this.nbCriteria = nbCriteria;
        this.higherMarkAllowed = higherMarkAllowed;
        this.marks = new int[this.nbJudges][this.nbCriteria];
    }

    // Method which is setting a new mark in the list marks 
    public void setMark(int judge, int criteria, int mark) {
        this.marks[judge][criteria] = mark;
    }

    // Accessor of the element [judge][criteria] of the tab marks
    public int getMark(int judge, int criteria) {
        return this.marks[judge][criteria];
    }

    // Calculate and returns the average mark for one criteria
    public float average(int criteria) {
        float sum = 0f;
        int max = -1;
        int min = higherMarkAllowed+1;
        for (int i = 0; i <= this.marks.length-1; i++) {
            if (this.marks[i][criteria] < min) {
                min = this.marks[i][criteria];
            }
            if (this.marks[i][criteria] > max) {
                max = this.marks[i][criteria];
            }
            sum = sum + this.marks[i][criteria];
        }
        return (sum-max-min)/(this.nbJudges-2);
    }

    public float globalAverage() {
        float sum = 0f;
        for (int i=0 ; i <= this.nbCriteria-1; i++) {
            sum = sum + this.average(i);
        }
        return sum/(this.nbCriteria);
    }
}   
