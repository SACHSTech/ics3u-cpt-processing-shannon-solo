import java.awt.Font;

import processing.core.PApplet;
import processing.core.PImage;
  
public class Sketch extends PApplet {
	boolean bookshelfOpened = false;
  boolean steelOnDoor = false;
  boolean hasKey = false;
  boolean firstText = true;
  PImage map;
  PImage loyd;
  Font myFont = new Font ("Courier New", 1, 17);
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false; 
  float loydX = 258;
  float loydY = 250;
  boolean box1 = true;

  String text1 = "mysterious voice: welcome loyd! I know you may be confused, who is this talking to me? where am";
  String text2 = "i? what is this thing im trapped in? which are all good questions, and they may be answered."; 
  String text3 = "all you need to know is that there is no way you're getting out. the electRic chair i trapped"; 
  String text4 = "you in, I made it with a very complicated password I only know. with that, Good luck, and have"; 
  String text5 = "Bucket's of fun rotting away loYd <3";   
  String textBox1[] = {text1, text2, text3, text4, text5};
  public void settings() {
	// put your size call here
    
    size(600, 600);
    
    map = loadImage("MAP.png");
    loyd = loadImage("Loyd.png");
    
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
    image(loyd, loydX, loydY);
    if(steelOnDoor = true){
      wallSteel();
    }
    if (upPressed) {
      loydY--;
      loydY--;
    }
    if (downPressed) {
      loydY++;
      loydY++;
    }
    if (leftPressed) {
      loydX--;
      loydX--;
      
    }
    if (rightPressed) {
      loydX++;
      loydX++;
  }
  if(firstText){
    textBox("Mysterious Voice: welcome Loyd! I know you may be confused, who is this talking to me? where am i? what is this thing im trapped in? which are all good questions, and they may be answered. all you need to know is that there is no way you're getting out. the electRic chair i trapped you in, I made it with a very complicated password I only know. with that, Good luck, and have Bucket's of fun rotting away loYd <3");
  }
}

  
  public void electricChair(){
    fill(136,65,0);
    stroke(92,55,21);
    strokeWeight(4);
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

  public void wallSteel(){
    fill(200);
    stroke(150);
    strokeWeight(2);
    rect(60, 70, 80, 20);
    rect(60, 115, 80, 20);
    ellipse(65, 80, 4, 4);
    ellipse(135, 80, 4, 4);
    ellipse(65, 125, 4, 4);
    ellipse(135, 125, 4, 4);
  }

  public void textBox(String text){
    fill(0);
    stroke(255);
    strokeWeight(6);
    rect(10, 440, 580, 150, 20);
    fill(255);
    if(box1){
      for(int e = 1; e < 5; e++){
        text(textBox1[e], 440, e * 12 + 590);
      }
    }
  }
  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
}
}
