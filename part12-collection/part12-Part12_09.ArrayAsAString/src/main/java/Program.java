
public class Program {

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < array[i].length; j++) {
                row.append(array[i][j]);
            }
            returnVal.append(row.toString());
            returnVal.append("\n");
        }

        return returnVal.toString();
    }
}
