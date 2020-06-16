public class ReportCard1 {
    //p/p65-Ru
public char convertGrades1 (int testResult) {
public static void main(String[] args) {
    ReportCard1 rc = new ReportCard1();
    char yourGrade1 = rc.convertGrades1(68);
    switch (yourGrade1){
        case 'A':
            System.out.println("Great job!");
            break;
        case 'B':  
            System.out.println("Good job");
            break;
        case 'C':             
            System.out.println("Should work more");
            break;
        case 'D':             
            System.out.println("Take a rest");
            break;
    }
}}