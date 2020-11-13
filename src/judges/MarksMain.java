package judges;

public class MarksMain {

    public static void main (String [] args) {
        int nbJudges = 3;
        int nbCriteria = 5;
        int higherMarkAllowed = 20;

        Marks marks = new Marks(nbJudges, nbCriteria, higherMarkAllowed);
        for (int i=0; i<=nbJudges-1; i++){
            for (int v=0; v<=nbCriteria-1; v++) {
                marks.setMark(i,v, i+v);
                System.out.println(marks.getMark(i,v));
            }
        }

        float average = marks.average(2);
        float globalAverage = marks.globalAverage(); 

        System.out.println("Third criteria average : " + average);
        System.out.println("Global average : " + globalAverage);
    }
}