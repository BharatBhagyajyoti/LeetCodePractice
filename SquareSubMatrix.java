
package leetcode;

/*
------------------------------Count Submatrix with all ONEs--------------------------------

Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
Example 1:
Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation:
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.
Example 2:

Input: matrix =
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
Output: 7
Explanation:
There are 6 squares of side 1.
There is 1 square of side 2.
Total number of squares = 6 + 1 = 7.


Constraints:

1 <= arr.length <= 300
1 <= arr[0].length <= 300
0 <= arr[i][j] <= 1


 */


public class SquareSubMatrix {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };

        int totalSquareMatrix=0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int cONE=0;//1X1
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j]==1)
                    cONE++;
            }
        }
        System.out.println("1X1="+cONE);

        int cTWO=0;
        for (int i = 0; i < matrix.length - 1; i++)
        {
            for (int j = 0; j < matrix[i].length - 1; j++)
            {
                if (matrix[i][j] == 1 && matrix[i][j + 1] == 1)
                {
                    if (matrix[i + 1][j] == 1 && matrix[i + 1][j + 1] == 1)
                        cTWO++;

                }
            }
        }

        System.out.println("2X2="+cTWO);

        int cTHREE=0;//3X3
        for (int i = 0; i < matrix.length - 2; i++)
        {
            for (int j = 0; j < matrix[i].length - 2; j++)
            {
                if (matrix[i][j] == 1 && matrix[i][j + 1] == 1 && matrix[i][j + 2] == 1)
                {
                    if (matrix[i + 1][j] == 1 && matrix[i + 1][j + 1] == 1 && matrix[i + 1][j + 2] == 1)
                    {
                        if (matrix[i + 2][j] == 1 && matrix[i + 2][j + 1] == 1 && matrix[i + 2][j + 2] == 1)
                            cTHREE++;
                    }
                }
            }
        }
        System.out.println("3X3="+cTHREE);

        totalSquareMatrix=cONE+cTWO+cTHREE;
        System.out.println("Total Square submatrix="+totalSquareMatrix);

    }
}
=======
package leetcode;

/*
------------------------------Count Submatrix with all ONEs--------------------------------

Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
Example 1:
Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation:
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.
Example 2:

Input: matrix =
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
Output: 7
Explanation:
There are 6 squares of side 1.
There is 1 square of side 2.
Total number of squares = 6 + 1 = 7.


Constraints:

1 <= arr.length <= 300
1 <= arr[0].length <= 300
0 <= arr[i][j] <= 1


 */


public class SquareSubMatrix {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };

        int totalSquareMatrix=0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int cONE=0;//1X1
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j]==1)
                    cONE++;
            }
        }
        System.out.println("1X1="+cONE);

        int cTWO=0;
        for (int i = 0; i < matrix.length - 1; i++)
        {
            for (int j = 0; j < matrix[i].length - 1; j++)
            {
                if (matrix[i][j] == 1 && matrix[i][j + 1] == 1)
                {
                    if (matrix[i + 1][j] == 1 && matrix[i + 1][j + 1] == 1)
                        cTWO++;

                }
            }
        }

        System.out.println("2X2="+cTWO);

        int cTHREE=0;//3X3
        for (int i = 0; i < matrix.length - 2; i++)
        {
            for (int j = 0; j < matrix[i].length - 2; j++)
            {
                if (matrix[i][j] == 1 && matrix[i][j + 1] == 1 && matrix[i][j + 2] == 1)
                {
                    if (matrix[i + 1][j] == 1 && matrix[i + 1][j + 1] == 1 && matrix[i + 1][j + 2] == 1)
                    {
                        if (matrix[i + 2][j] == 1 && matrix[i + 2][j + 1] == 1 && matrix[i + 2][j + 2] == 1)
                            cTHREE++;
                    }
                }
            }
        }
        System.out.println("3X3="+cTHREE);

        totalSquareMatrix=cONE+cTWO+cTHREE;
        System.out.println("Total Square submatrix="+totalSquareMatrix);

    }
}

