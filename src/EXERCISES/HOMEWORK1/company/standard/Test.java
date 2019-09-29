package EXERCISES.HOMEWORK1.company.standard;

public class Test {
    public static void main(String[] args) {
        Manager cris = new Manager();

        Manager tom = new Manager();

        cris.addEmployee(tom);

        OfficeWorker emmily = new OfficeWorker();
        tom.addEmployee(emmily);
        OfficeWorker mark = new OfficeWorker();
        tom.addEmployee(mark);

        OfficeWorker joe = new OfficeWorker();
        cris.addEmployee(joe);
        OfficeWorker billy = new OfficeWorker();
        cris.addEmployee(billy);
    }
}
