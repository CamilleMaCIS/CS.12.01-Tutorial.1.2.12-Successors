public class Successors {

    public static Position findPosition(int value, int[][] arr2d){
        //returns the Position object of the integer value in the given 2D integer array
        for (int r = 0; r < arr2d.length; r++){
            for (int c = 0; c < arr2d[r].length; c++){
                if (arr2d[r][c] == value){
                    Position position = new Position(r,c);
                    return position;
                }
            }
        }
        //If the integer is not an element of the 2D integer array, the method returns null
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr2d){
        Position[][] successorArray = new Position[arr2d.length][arr2d[0].length];
        for (int r = 0; r < arr2d.length; r++){
            for (int c = 0; c < arr2d[0].length; c++){
                int successor = arr2d[r][c] + 1;
                successorArray[r][c] = findPosition(successor, arr2d);
            }
        }
        return successorArray;
    }
}
