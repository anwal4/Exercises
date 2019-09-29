package EXERCISES.LESSON2A.student;

public class student {
    private int egxams = 5;
    private int []m = new int[egxams];
    double avg;
    public double avg(){
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i]==0){
                return 0.0;
            }
            sum+=m[i];
        }
        return sum/egxams;

    }


    public void getMark(int subject, int mark) {
        if (0 <= subject && subject<5){
            m[subject] = mark;
        }
    }

}
