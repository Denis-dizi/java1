public class ReportCard1 {
    //p/p65-Ru
    public static void main(String[] args) {
        ReportCard rc = new ReportCard();
        char yourGrade = rc.convertGrades(70);
        switch (yourGrade){
            case 'A':
                System.out.println("Great job!");
                break;
            case 'B':  
                System.out.println("Good job.");
                break;
            case 'C':             
                System.out.println("Should work more.");
                break;
            case 'D':             
                System.out.println("Take a rest.");
                break;
        }
    }
}