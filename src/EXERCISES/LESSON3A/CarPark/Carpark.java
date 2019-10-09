package EXERCISES.LESSON3A.CarPark;



public class Carpark {

    private boolean tab[][];

    private int capacity;

    public Carpark(int m, int n) {
        this.tab = new boolean[m][n];
        this.capacity = m*n;
    }

    private Position findFree() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (!tab[i][j]) {
                    /** ciekawostka
                     tab[i][j] == false
                     tab[i][j] != true
                     */
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    public Position park() {
        Position free = findFree();
        if (free != null) {
            tab[free.x][free.y] = true;
            return free;
        } else {
            return null;
        }
    }

    public void leave(Position p) {
        if (p.x < tab.length && p.y < tab[p.x].length) {
            tab[p.x][p.y] = false;
        }
    }

    public Position[] getFreePositions() {
        //
        Position[] freePositions = new Position[this.capacity];

        int freeIndex = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (!tab[i][j]){
                    freePositions[freeIndex++] = new Position(i, j);
                }
            }
        }

        Position[] result = new Position[freeIndex];
        for (int i = 0; i < freeIndex; i++) {
            result[i] = freePositions[i];
        }
        /*

         */
        return result;
    }
}
