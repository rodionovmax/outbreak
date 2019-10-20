import java.util.Arrays;

public class Main {



    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b)); /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ в строку*/
    }

    public static void main(String[] args) {

        TestData data = new TestData();
        Outbreak outbreak = new Outbreak();

//        outbreak.printVertical();
//
//        outbreak.countVerticalOutbreak();


        boolean a = true;
        boolean b = false;
        boolean c = true;

//        boolean res = true * false;


    }

}


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



//        String [][] chessBoard2 = new String[8][8];
//        for (int i = 0; i < chessBoard2.length; i++) {
//            for (int j = 0; j < chessBoard2[0].length; j++) {
//                if ((i + j) % 2 == 0) chessBoard2[i][j] = "W" + chessBoardCoord(j,i);
//                else chessBoard2[i][j] = "B"+ chessBoardCoord(j,i);
//            }
//        }
//
//        for (int i = 0; i < chessBoard2.length; i++) {
//            for (int j = 0; j < chessBoard2[0].length; j++) {
//                System.out.print(" " + chessBoard2[i][j] + " ");
//            }
//            System.out.println();
//        }




//        for (int i = 0; i < res.length; i++) {
//            for (int j = 0; j < res[i].length; j++) {
//                System.out.print(res[i][j] + " | ");
//            }
//            System.out.println(" ");
//        }

//        int[][] first = Outbreak.verticalTrue;
//        Outbreak second = Outbreak.verticalTrue;
//        int[][] result = outbreak.multiply();
//
//        Outbreak result = first.multiply(second);
//        result.print();







//        String [][] stringArray = Arrays.stream(VerticalTrue).map(value -> (String.valueOf(value)).replace("true", "1").replace("false", "0").;


        /*
        public int countVerticalOutbreak() {

            int verticalCountRow = 0;
            int verticalCountColumn = 0;

            for (int i = 0; i < verticalTrue.length; i++) {
                for (int j = 0; j < verticalTrue[i].length; j++) {
                    if (verticalTrue[i][j].equals("X")) verticalCountRow++;
                    if (verticalTrue[j][i].equals("X")) verticalCountColumn++;
                }

                if (verticalCountRow >= 5) {
                    System.out.println("rows: " + verticalCountRow);
                    return 1;
                }

                if (verticalCountColumn >= 5) {
                    System.out.println("columns: " + verticalCountColumn);
                    return 1;
                }
                verticalCountRow = 0;
                verticalCountColumn = 0;
            }

            System.out.println("no results");
            return 0;
        }

         */






//        Float[][] floatArray =
//                map.entrySet()
//                        .stream()
//                        .map(key -> new Float[]{key.getKey().getPrice()})
//                        .toArray(size -> new Float[size][1]);
