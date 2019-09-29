package EXERCISES.HOMEWORK1.company.fluent;

public class Test {
    public static void main(String[] args) {
        Manager crisCompany = new Manager("Cris")
            .withEmployee(
                new Manager("Tom")
                    .withEmployee(new Manager("Emily"))
                    .withEmployee(new Manager("Mark"))
            )
            .withEmployee(
                    new OfficeWorker("Joe")
            )
            .withEmployee(new OfficeWorker("Billy"));
        System.out.println(crisCompany.structure());
    }
}
