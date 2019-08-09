package lap3;

public class Scholarship {
    private boolean HDSE;
    private double mediumScore;
    private boolean rules;
    private boolean firstExam;

    public Scholarship() {
        HDSE = true;
        mediumScore = 8.0;
        rules = true;
        firstExam = true;
    }   
    
    public void wonAScholarship() {
        if(HDSE == true && mediumScore >= 7.5 && rules == true && firstExam == true)
            System.out.println("Được học bổng.");
        else
            System.out.println("Không được học bổng.");
    }
}
