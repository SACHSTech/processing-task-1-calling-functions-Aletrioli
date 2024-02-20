import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * This program will draw a house
   * @author T. Martins
   */

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(127, 204, 240);
  }

  public void draw() {
    // hill
    fill(133, 214, 133);
    ellipse(100, 400, 700, 350);
	  
    // house
    fill(97, 81, 57);
    rect(100, 200, 100, 75);

    // windows
    fill(165, 227, 242);
    rect(110, 225, 25, 25);
    rect(165, 225, 25, 25);

    // window lines
    fill(0, 0, 0);
    line(110, 225, 135, 250);
    line(110, 250, 135, 225);
    line(165, 225, 190, 250);
    line(165, 250, 190, 225);

    // door
    fill(128, 114, 84);
    rect(140, 225, 20, 50);

    // roof
    fill(69, 64, 53);
    triangle(100, 200, 150, 150, 200, 200);

    // sun
    fill(247, 246, 168);
    ellipse(325, 75, 100, 100);
  
  } 

}