public class Grade {
    public static void main(String[] args) {
        double[] grades = {90, 80, 70};

        double sum = 0;
        for (double g : grades) {
            sum += g;
        }

        double avg = sum / grades.length;

        System.out.println("Average: " + avg);
        System.out.println("Letter grade: " + gradeFunction(avg));
    }

    static char gradeFunction(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
}
