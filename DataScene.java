import org.code.theater.*;

public class DataScene extends Scene {
    // Instance variables to store player data in arrays
    private String[] names;
    private int[] ranks;
    private int[] points;
    private String[] images;

    // Constructor for names, ranks, points, and images
    public DataScene(String[] names, int[] ranks, int[] points, String[] images) {
        this.names = names;
        this.ranks = ranks;
        this.points = points;
        this.images = images;
    }

    // Draw method to randomly select and display a player, I will elaborate more
    public void draw() {
        // Title
        drawText("Top Ten NBA Scorers of All Time", 65, 35);

        // Generate a random index to select a player
        int randomIndex = (int) (Math.random() * names.length);

      /*
      Values for playerName, playerRank, playerPoints, playerImage are set to default and depending on the value for random index
      */
        String playerName = "";
        int playerRank = 0;
        int playerPoints = 0;
        String playerImage = "";

/*
Multi-selection statement to set the value for playerName, playerRank, playerPoints, playerImage to a random player's information in the list for it to be output into the theater.
*/
if (randomIndex == 0) {
playerName = names[0];
playerRank = ranks[0];
playerPoints = points[0];
playerImage = images[0];

} else if (randomIndex == 1) {

playerName = names[1];
playerRank = ranks[1];
playerPoints = points[1];
playerImage = images[1];

} else if (randomIndex == 2) {

  playerName = names[2];
playerRank = ranks[2];
playerPoints = points[2];
playerImage = images[2];

} else if (randomIndex == 3) {

  playerName = names[3];
playerRank = ranks[3];
playerPoints = points[3];
playerImage = images[3];

} else if (randomIndex == 4) {

  playerName = names[4];
playerRank = ranks[4];
playerPoints = points[4];
playerImage = images[4];

} else if (randomIndex == 5) {

  playerName = names[5];
playerRank = ranks[5];
playerPoints = points[5];
playerImage = images[5];

} else if (randomIndex == 6) {

  playerName = names[6];
playerRank = ranks[6];
playerPoints = points[6];
playerImage = images[6];

} else if (randomIndex == 7) {

  playerName = names[7];
playerRank = ranks[7];
playerPoints = points[7];
playerImage = images[7];

} else if (randomIndex == 8) {

  playerName = names[8];
playerRank = ranks[8];
playerPoints = points[8];
playerImage = images[8];

} else if (randomIndex == 9) {

  playerName = names[9];
playerRank = ranks[9];
playerPoints = points[9];
playerImage = images[9];
  
}

/*
Draws the image, done by printing the png of the player at x position 125, y position 70, size of 150, and no rotation.
*/     
        drawImage(playerImage, 125, 70, 150, 0.0); 

        drawText("Name: " + playerName, 100, 315);
        drawText("Rank: " + playerRank, 100, 345);
        drawText("Points: " + playerPoints, 100, 375);
    }
}
