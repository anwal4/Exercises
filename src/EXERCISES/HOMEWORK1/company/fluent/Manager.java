package EXERCISES.HOMEWORK1.company.fluent;


/**
    This is not a perfect implementation of fluent API
    Search for fluent api builder
    E.g: https://dzone.com/articles/fluent-builder-pattern
 */
public class Manager extends Employee {

    private Employee[] workers = new Employee[5];

    public String structure(int offset) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                StringBuilder workerResult = new StringBuilder()
                        .append(nTabs(offset))
                        .append("-")
                        .append(workers[i].name);

                if (workers[i] instanceof Manager) {
                    Manager m = (Manager)workers[i];
                    String s = m.structure(offset + 1);

                    // if there are no employees then will be empty string
                    if (s.trim().length() != 0) {
                        workerResult.append("\n")
                                .append(s);
                    }
                }

                builder.append(workerResult);

            }
            // if has more employees
            if (i+1 < workers.length && workers[i+1] != null) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    private String nTabs(int tabs) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < tabs; i++) {
            result.append("\t");
        }
        return result.toString();
    }

    public String structure() {
        return this.name + "\n" + structure(1);
    }

    public Manager(String name) {
        super(name);
    }

    public Manager withEmployee(Employee employee) {
        int slot = freeSlot();
        if (slot != -1) {
            workers[slot] = employee;
        }
        return this;
    }

    private int freeSlot() {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
