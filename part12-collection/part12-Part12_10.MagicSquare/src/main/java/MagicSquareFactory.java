
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        square.placeValue((int)(square.getWidth() / 2), 0, 1);
        int startPosX = (int)(square.getWidth() / 2);
        int startPosY = 0;
        for(int i = 2; i <= size * size; i++){
            int checkX = startPosX;
            int checkY = startPosY;
            if(checkX + 1 < size){
                checkX++;
                if(checkY - 1 >= 0){
                    checkY--;
                    if(square.readValue(checkX, checkY) == 0){
                        square.placeValue(checkX, checkY, i);
                        startPosX = checkX;
                        startPosY = checkY;
                    } else{
                        startPosY++;
                        square.placeValue(startPosX, startPosY, i);
                    }
                } else{
                    checkY = size - 1;
                    if(square.readValue(checkX, checkY) == 0){
                        square.placeValue(checkX, checkY, i);
                        startPosX = checkX;
                        startPosY = checkY;
                    } else{
                        startPosY++;
                        square.placeValue(startPosX, startPosY, i);
                    }
                }
            } else{
                checkX = 0;
                if(checkY - 1 >= 0){
                    checkY--;
                    if(square.readValue(checkX, checkY) == 0){
                        square.placeValue(checkX, checkY, i);
                        startPosX = checkX;
                        startPosY = checkY;
                    } else{
                        startPosY++;
                        square.placeValue(startPosX, startPosY, i);
                    }
                } else{
                    checkY = size - 1;
                    if(square.readValue(checkX, checkY) == 0){
                        square.placeValue(checkX, checkY, i);
                        startPosX = checkX;
                        startPosY = checkY;
                    } else{
                        startPosY++;
                        square.placeValue(startPosX, startPosY, i);
                    }
                }
            }
        }
        return square;
    }

}
