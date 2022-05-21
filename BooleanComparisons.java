public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println(biologyGrade > chemistryGrade);
        double sales = 37.55;
        double cost = 5.55;
        System.out.println(sales > cost);
        int englishGrade = 75;
        System.out.println(chemistryGrade >= englishGrade);
        System.out.println(chemistryGrade == englishGrade);
        System.out.println(biologyGrade == englishGrade);
        System.out.println(chemistryGrade != englishGrade);
        System.out.println(biologyGrade != englishGrade);
        String sentence1 = "I love this course!";
        String sentence2 = "I love this course!";
        System.out.println(sentence1.equals(sentence2));
        System.out.println(!sentence1.equals(sentence2));
        //== is for comparison and = is for assigning values
    }
    
}
