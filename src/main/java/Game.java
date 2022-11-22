public class Game {

    int[][] scoreboard;
    int currentRoll;
    int currentFrame;


    public Game() {
        this.currentRoll = 0;
        this.currentFrame = 0;
        this.scoreboard = new int[2][11];
    }

    //TODO: create tests for roll()
    public void roll(int pins) {
        int currentFrameScore = this.scoreboard[0][currentFrame] + this.scoreboard[1][currentFrame];

        if (!(pins <= 10 & pins >= 0)) {
            System.out.println("Please enter a number from 0 to 10.");
        } else if (!(currentFrameScore + pins <= 10)) {
            System.out.println("Please enter a number from 0 to " + (10 - currentFrameScore));
        } else {
            this.scoreboard[this.currentRoll][this.currentFrame] = pins; //updates scoreboard matrix
            this.currentRoll++;

            if (pins == 10) { //skips next roll if a strike
                this.currentRoll++;
            }
            if (this.currentRoll >= 2) { //moves to next frame, resets roll counter
                this.currentFrame++;
                this.currentRoll = 0;
            }
        }
    }
}

