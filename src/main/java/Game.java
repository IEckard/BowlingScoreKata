public class Game {

    int[][] scoreboard = new int [2][11];
    int currentRoll = 0;
    int currentFrame = 0;

    public void roll(int pins){
        scoreboard[currentRoll][currentFrame] = pins;
        currentRoll++;
        if (pins == 10) { //skips next roll if a strike
            currentRoll++;
        }
        if (currentRoll == 2) { //moves to next frame, resets rolls
            currentFrame++;
            currentRoll = 0;
        }

    }
}
