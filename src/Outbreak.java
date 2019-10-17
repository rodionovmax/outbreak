public class Outbreak {

    TestData array = new TestData();
    String[][] verticalTrue = array.verticalTrue;


    public static boolean isOutbreak(String[][] floor) {


        return true;//
    }



    public void printVertical() {

        for (int i = 0; i < verticalTrue.length; i++) {
            for (int j = 0; j < verticalTrue[i].length; j++) {
                System.out.print(" " + (verticalTrue[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public int countVerticalOutbreak() {

        int verticalCountRow = 0;
        int verticalCountColumn = 0;

        for (int i = 0; i < verticalTrue.length; i++) {
//            for (int k = i+1; k  < verticalTrue.length; k++)
                for (int j = 0; j < verticalTrue[i].length; j++) {

//                    if (verticalTrue[i][j].equals("X")) verticalCountRow++;
//                    if (verticalTrue[j][i].equals("X")) verticalCountColumn++;

//                    if ((verticalTrue[i][j].equals("X")) && (verticalTrue[i+1][j].equals("X"))
//                            && (verticalTrue[i+2][j].equals("X")) && (verticalTrue[i+3][j].equals("X"))
//                            && (verticalTrue[i+4][j].equals("X"))) verticalCountRow++;

                    if ((verticalTrue[j][i].equals("X")) && (verticalTrue[j+1][i].equals("X"))
                            && (verticalTrue[j+2][i].equals("X")) && (verticalTrue[j+3][i].equals("X"))
                            && (verticalTrue[j+4][i].equals("X"))) verticalCountColumn++;


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
//        }






}