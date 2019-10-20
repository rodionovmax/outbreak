public class Outbreak {


    public static boolean isOutbreak(boolean[][] floor) {

        return true;//

    }

    private int getRowsNum() {
        return Room.verticalTrue.length;
    }

    private int getColumnsNum() {
        return Room.verticalTrue[0].length;
    }

    private int m = getRowsNum();
    private int k = getColumnsNum();

    private int[][] result = new int[m][k];

    public int[][] multiplyArrays() {

        for (int i = 0; i < Room.verticalTrue.length; i++) {
            for (int j = 0; j < Room.verticalTrue[i].length; j++) {
                result[i][j] = Room.verticalTrue[i][j] * Room.horizontalTrue[i][j]
                        * Room.noInfection[i][j];
            }
        }

        return result;
    }


    public void print(int[][] array) {
        System.out.println("Array: " + getRowsNum() + " rows " + "by " + getColumnsNum() + " columns ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public int countIsThereAnOutbreak(int[][] array) {
        int verticalCountRow = 0;
        int verticalCountColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


                if ((array[i][j] == 1) && (array[i + 1][j] == 1)
                        && (array[i + 2][j] == 1) && (array[i + 3][j] == 1)
                        && (array[i + 4][j] == 1)
                ) verticalCountRow++;


                if ((array[i][j] == 1) && (array[i][j + 1] == 1)
                        && (array[i][j + 2] == 1) && (array[i][j + 3] == 1)
                        && (array[i][j + 4] == 1))
                    verticalCountColumn++;

            }

            if (verticalCountRow >= 1) {
                System.out.println("There is an outbreak. Rows: " + verticalCountRow);
                return 1;
            }

            if (verticalCountColumn >= 1) {
                System.out.println("There is an outbreak. Columns: " + verticalCountColumn);
                return 1;
            }

            verticalCountRow = 0;
            verticalCountColumn = 0;
        }

        System.out.println("There is no outbreak");
        return 0;
    }

}


//                    if (array[i][j] == 1) verticalCountRow++;
//                    if (array[j][i] == 1) verticalCountColumn++;


//    public void printVertical() {
//
//        for (int i = 0; i < verticalTrue.length; i++) {
//            for (int j = 0; j < verticalTrue[i].length; j++) {
//                System.out.print(" " + (verticalTrue[i][j]) + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public int countVerticalOutbreak() {
//
//        int verticalCountRow = 0;
//        int verticalCountColumn = 0;
//
//            for (int i = 0; i < verticalTrue.length; i++) {
//                for (int j = 0; j < verticalTrue[i].length; j++) {
//                    if (verticalTrue[i][j].equals("X")) verticalCountRow++;
//                    if (verticalTrue[j][i].equals("X")) verticalCountColumn++;
//                }
//
//                if (verticalCountRow >= 5) {
//                    System.out.println("rows: " + verticalCountRow);
//                    return 1;
//                }
//
//                if (verticalCountColumn >= 5) {
//                    System.out.println("columns: " + verticalCountColumn);
//                    return 1;
//                }
//                verticalCountRow = 0;
//                verticalCountColumn = 0;
//            }
//
//        System.out.println("no results");
//        return 0;
//    }
//
//
//    TestData data = new TestData();
//    Room[][] VerticalTrue = data.verticalTrue;
//
//    String[][] stringArray;
//
//
//    public Room[][] convertArrayToString() {
//        for (int i = 0; i < VerticalTrue.length; i++) {
//            for (int j = 0; j < VerticalTrue[i].length; j++) {
//                if (VerticalTrue[i][j].equals(true)) {
//                    VerticalTrue[i][j].toString().replace("true", "1");
//                }
//                if (VerticalTrue[i][j].equals(false)) {
//                    VerticalTrue[i][j].toString().replace("false", "0");
//                }
//
//            }
//        }
//
//        return VerticalTrue;
//    }




/*
//                    if (verticalTrue[i][j].equals("X")) verticalCountRow++;
//                    if (verticalTrue[j][i].equals("X")) verticalCountColumn++;




                    if ((verticalTrue[i][j].equals("X")) && (verticalTrue[i+1][j].equals("X"))
                            //&& (verticalTrue[i+2][j].equals("X")) && (verticalTrue[i+3][j].equals("X"))
                            //&& (verticalTrue[i+4][j].equals("X"))
                    )
                        verticalCountRow++;

//                    if ((verticalTrue[j][i].equals("X")) && (verticalTrue[j+1][i].equals("X"))
//                            && (verticalTrue[j+2][i].equals("X")) && (verticalTrue[j+3][i].equals("X"))
//                            && (verticalTrue[j+4][i].equals("X"))) verticalCountColumn++;


                    //                System.out.print(" " + verticalCountRow + " ");
                }



//            if (verticalCountRow >= 5 || verticalCountColumn >= 5) {
//                System.out.println("\nWe detected outbreak " + verticalCountRow + " " + verticalCountColumn);
//                return 1;
//            }

//
//            if (verticalCountRow >= 5) {
//                System.out.println("\nWe detected outbreak by horizontal. " + verticalCountRow + " rooms on the floor are destroyed");
//                return 1;
//            }
//            if (verticalCountColumn >= 5) {
//                System.out.println("\nWe detected outbreak by vertical. " + verticalCountColumn + " floors are destroyed");
//                return 1;
//            }


//            else {
//                System.out.println("\nOutbreak wasn't detected");
//                return -1;
//            }
        }
//        System.out.println("\nOutbreak wasn't detected");
        System.out.println("rows: " + verticalCountRow);
        System.out.println("columns: " + verticalCountColumn);
        return 0;
    }


//        String[][] verticalString = Arrays.stream(verticalTrue).toArray(String[][]::new);


//        String stringArray[] = Arrays.stream(objectArray)
//                .toArray(String[]::new);
//
//        System.out.println(Arrays.toString(stringArray));



//        String [][] chessBoard = new String[8][8];
//        for (int i = 0; i< chessBoard.length; i++) {
//            for (int j = 0; j < chessBoard[0].length; j++) {
//                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
//                else chessBoard[i][j] = "B";
//            }
//        }
//        for (int i = 0; i < chessBoard.length; i++) {
//            for (int j = 0; j < chessBoard[0].length; j++) {
//                System.out.print(" " + chessBoard[i][j] + " ");
//            }
//            System.out.println();




 */
