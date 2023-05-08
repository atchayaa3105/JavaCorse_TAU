package chapter12;
import java.util.Map;

//Challenge 11
//Students are given a quiz which they did not do great. The teacher decides to conduct a retest and improve their scores
// Given two map of Students and their scores in the quiz, choose the better score comparing them both
//Print the final grades
public class GradeBook_Challenge {
    public static void main(String args[]){
        System.out.println("Final Grades:");
        compareScores();

    }

    private static void compareScores() {
        Map<String, Integer> oldTestScore= TestResults_Challenge.getOriginalGrades();
        Map<String, Integer> NewTestScore= TestResults_Challenge.getMakeUpGrades();
        oldTestScore.forEach((k,v)->{
            var newScore= NewTestScore.get(k).intValue();
            if(v>newScore) {
                System.out.println(k+" "+v);
            }else System.out.println(k+" "+newScore);
        });
    }
}
//Solution
//Final Grades:
//Angie 97
//Dave 82
//Lisi 80
//Raja 89
//Shashi 79
//Bas 98
//Carlos 80
//Amber 95
//Rex 95
//Jason 63
//Nikolay 79

//Alternative Method

//public class GradeBook {
//
//    public static void main(String[] args){
//        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
//        Map<String, Integer> test2 = TestResults.getMakeUpGrades();
//
//        for(var student : test2.entrySet()){
//            Integer firstGrade = gradeBook.get(student.getKey());
//            Integer secondGrade = test2.get(student.getKey());
//
//            if(secondGrade > firstGrade){
//                gradeBook.put(student.getKey(), secondGrade);
//            }
//          }
//
//        /*
//            The forEach is used here to demonstrate another approach to looping.
//            However, in reality, I would have added a print statement inside of
//            the loop above so that the program does not have to loop over this map
//            for a second time. This would be a more efficient approach:
//            System.out.println("Student: " + student.getKey() + ", Grade:" + gradeBook.get(student.getKey()));
//        */
//        System.out.println("Final Grades:");
//        gradeBook.forEach(
//                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));
//    }
//}
