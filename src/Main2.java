public class Main2 {


    public static void main(String[] args) {

        Outbreak outbreak = new Outbreak();

        int[][] res = outbreak.multiplyArrays();


        System.out.println("Printing verticalTrue array");
        outbreak.print(Room.verticalTrue);

        System.out.println("Printing horizontalTrue array");
        outbreak.print(Room.horizontalTrue);

        System.out.println("Printing noInfection array");
        outbreak.print(Room.noInfection);

        System.out.println("Printing result array");
        outbreak.print(res);

        outbreak.countIsThereAnOutbreak(res);


    }

}

