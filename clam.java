/*Nathan Ha
  Match 17 2021
  Clam class defines the different features of a clam for AP Compuer Science A project
*/

public class clam {

  private boolean open;
  private String color;
  private double weight;
  private double width;
  private double age;

/*
Constructs a Clam
*/
  public Clam() {
    this(true, gray, 1, 1);
  }

  public Clam(boolean open, String color, double weight, double width) {
    this.open = open;
    this.color = color;
    this.weight = weight;
    this.width = width;
  }

/*
Opens and closes the clam
*/
  public void OpenOrClose {
    open = !open;
  }

/*
Changes the color of the clam
*/
  public void changeColor(String col) {

  }

/*
Changes the width of the clam
*/
  public void changeWidth(String w) {

  }

}