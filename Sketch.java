import java.awt.Font;

import org.w3c.dom.events.MouseEvent;

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
  boolean simonSolved = false;
  boolean simonScreen = false;
  char r;
  char g;
  char b;
  char y;
  char simonReal[] = {r, g, b, y};
  char simonGuess[] = new char[4];
  int simonRectX[] = {120, 215, 310, 415};
  String text1 = "mysterious voice: welcome loyd! I know you may be confused, who is this talking to me? where am";
  String text2 = "i? what is this thing im trapped in? which are all good questions, and they may be answered."; 
  String text3 = "all you need to know is that there is no way you're getting out. the electRic chair i trapped"; 
  String text4 = "you in, I made it with a very complicated password I only know. with that, Good luck, and have"; 
  String text5 = "Bucket's of fun rotting away loYd <3";   
  String textBox1 = text1 + "\r\n" + text2 + "\r\n" + text3 +"\r\n" + text4 + "\r\n" +text5;
  
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
    textBox();
    if(steelOnDoor = true){
      wallSteel();
    }
    if(simonSolved != true){
      simonChair();
    }
    if(simonScreen){
      simonSays();
    
    
    }
     
    
    if(simonSolved){
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

  public void textBox(){
    fill(0);
    stroke(255);
    strokeWeight(6);
    rect(10, 440, 580, 150, 20);
    fill(255);
    if(box1){
      text(textBox1, 25, 450, 590, 600);
    }
  }
  public void simonSays(){
    fill(180);
    stroke(160);
    strokeWeight(6);
    rect(100, 100, 400, 400);
    fill(0, 0, 255);
    rect(106, 103, 194, 194);
    fill(255, 0, 0);
    rect(106, 300, 194, 194);
    fill(0, 255, 0);
    rect(300, 103, 194, 194);
    fill(255, 255, 0);
    rect(300, 300, 194, 194);
    fill(100);
    rect(100, 510, 400, 50);
    rect(120, 524, 80, 25);
    rect(215, 524, 80, 25);
    rect(310, 524, 80, 25);
    rect(405, 524, 80, 25);
    for(int i = 0; i < 4; i++){
      System.out.println(mousePressed);
      System.out.println(i);
      //blue
      fill(43);
     if(mousePressed && mouseX >= 106 && mouseX <=300 && mouseY >= 106 && mouseY <= 300){
      rect(simonRectX[i], 524, 80, 25);
      simonGuess[i] = 'b';
     }
     //red
     else if(mousePressed && mouseX >= 106 && mouseX <=300 && mouseY >= 300 && mouseY <=494){
      rect(simonRectX[i], 524, 80, 25);
      simonGuess[i] = 'r';
     }
     //green
     else if(mousePressed && mouseX >= 300 && mouseX <= 494 && mouseY >=103 && mouseY <=297){
      rect(simonRectX[i], 524, 80, 25);
      simonGuess[i] = 'g';
     }
     else if(mousePressed && mouseX >=300 && mouseX <= 494 && mouseY >= 300 && mouseY <=494){
      rect(simonRectX[i], 524, 80, 25);
      simonGuess[i] = 'y';
     }
   }
  }
      
      
    

  public void simonChair(){
    rect(247, 300, 33, 20);
    noStroke();
    fill(0, 0, 255);
    rect(250, 303, 14, 8);
    fill(0, 255, 0);
    rect(264, 303, 14, 8);
    fill(255, 0, 0);
    rect(250, 311, 14, 8);
    fill(255, 255, 0);
    rect(264, 311, 14, 8);
    fill(160);
    stroke(160);
    strokeWeight(3);
    line(263, 301, 263, 320);
    line(250, 310, 278, 310);
  }

  public void mouseClicked(){
    if(mouseX >= 247 && mouseX <= 280 && mouseY >= 300 && mouseY <=320){
      simonScreen = true;
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
    if(keyCode == ALT & simonScreen){
      simonScreen = false;
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
