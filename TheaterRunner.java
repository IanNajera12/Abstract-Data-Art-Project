import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /*
    Converts the text files stored into 1D arrays. Depending on the data type they are either stored as integer arrays or String arrays
    */
String[] nameArray = FileReader.toStringArray("name.txt");
int[] rankArray = FileReader.toIntArray("rank.txt");
int[] pointsArray = FileReader.toIntArray("points.txt");
String[] imageArray = FileReader.toStringArray("image.txt");

    //Passes the array through the constructor
    DataScene Ian = new DataScene(nameArray, rankArray, pointsArray,imageArray);

    //Calls the draw method which creates the output in the theater.
    // Plays the scenes in the scene class, basically this executes the draw method to output the information for one of the players randomly selected in the draw method
    Ian.draw();
    Theater.playScenes(Ian);
  }
}