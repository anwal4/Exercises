package EXERCISES.HOMEWORK;

/*
Stwórz macierz(tablice) o wymiarach NxN która beddzie wygladala w nastepujacy spsób dla N == 5
    X___X
    _X_X_
    __X__
    _X_X_
    X___X
 */
/*
0,0->X  0,1->_  0,2->_  0,3->_  0,4->X
1,0->_  1,1->X  1,2->_  1,3->X  1,4->_
2,0->_  2,1->_  2,2->X  2,3->_  2,4->_
3,0->_  3,1->X  3,2->_  3,3->X  3,4->_
4,0->X  4,1->_  4,2->_  4,3->_  4,4->X
 */

import java.util.Arrays;

public class Ex2_Table_of_X {
    public static void main(String[] args) {
        char[][] anArray = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == j) || (i + j == 4)) {
                    anArray[i][j] = 'X';
                } else {
                    anArray[i][j] = '_';
                }
            }
            System.out.println(Arrays.toString(anArray[i]));
        }
    }
}
