package EXERCISES.HOMEWORK1.company.standard;

public class Manager extends Employee {

    private Employee[] workers = new Employee[5];

    public boolean addEmployee(Employee employee) {
        int slot = freeSlot();
        if (slot == -1) {
            return false;
        } else {
            workers[slot] = employee;
            return true;
        }
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
