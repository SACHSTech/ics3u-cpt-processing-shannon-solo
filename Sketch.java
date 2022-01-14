import processing.core.PApplet;
import processing.core.PImage;
  
public class Sketch extends PApplet {
	boolean bookshelfOpened = false;
  boolean steelOffDoor = false;
  boolean hasKey = false;
  PImage map;

  public void settings() {
	// put your size call here
    
    size(600, 600);
    
    map = loadImage("MAP.png");
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    image(map, 0, 0, width, height);
	  electricChair();
  }
  
  public void electricChair(){
    fill(136,65,0);
    stroke(92,55,21);
    strokeWeight(2);
    rect(267, 223, 10, 100);
    rect(321, 223, 10, 100);
    rect(247, 290, 20, 40);
    rect(332, 290, 20, 40);
    rect(267, 320, 65, 27);
    fill(170,82,2);
    rect(277, 243, 46, 15);
    rect(277, 280, 46, 15);
    rect(267, 347, 65, 17);
    rect(247, 330, 20, 6);
    rect(332, 330, 20, 6);
    rect(307, 212, 6, 30);
    rect(288, 212, 6, 30);
    fill(120);
    stroke(110);
    ellipse(300, 243, 46, 25);
    fill(80);
    stroke(65);
    ellipse(300, 250, 44, 15);
  }
}