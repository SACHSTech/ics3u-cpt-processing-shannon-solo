import java.awt.Font;

import org.w3c.dom.events.MouseEvent;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
  
public class Sketch extends PApplet {
  boolean steelOnDoor = false;
  boolean hasKey = false;
  boolean hasScrewdriver = false;
  boolean firstText = true;
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false; 
  boolean box1 = true;
  boolean box2 = false;
  boolean simonSolved = false;
  boolean simonScreen = false;
  boolean password = false;
  boolean simonClick1 = false;
  boolean simonClick2 = false;
  boolean simonClick3 = false;
  boolean simonClick4 = false;
  boolean simonStart = false;
  boolean simonDone = false;
  boolean death;
  boolean openBookshelf = false;
  boolean mansThere;
  boolean takeDonut = false;
  boolean villain1 = false;
  boolean villain2 = false;
  boolean box3 = false;
  boolean box4 = false;
  boolean boxThing;
  boolean screwDriverUp = false;
  char r;
  char g;
  char b;
  char y;
  char simonReal[] = {r, g, b, y};
  char simonGuess[] = new char[4];
  int simonRectX[] = {120, 215, 310, 405};
  float loydX = 258;
  float loydY = 250;
  float villainX = -100;
  float villainY = 150;
  float bookX = 54;
  float bookY = 60;
  PImage map;
  PImage loyd;
  PImage villainDonut;
  PImage villain;
  PImage villainDonutMinusOne;
  PImage closeBook;
  PImage screwdriver;
  Font myFont = new Font ("Courier New", 1, 17);
  String text1 = "mysterious voice: welcome loyd! I know you may be confused, who is this talking to me? where am";
  String text2 = "i? what is this thing im trapped in? which are all good questions, and they may be answered."; 
  String text3 = "all you need to know is that there is no way you're getting out. the electric chair i trapped"; 
  String text4 = "you in, I made it with a very complicated 3 digit password I only know. and don't try and put in a combination loyd! it might electricute you if you're wrong! with that, Good luck, and have "; 
  String text5 = "Bucket's of fun rotting away loYd <3 (If you die in the game, quit and try again)";   
  String textBox1 = text1 + "\r\n" + text2 + "\r\n" + text3 +"\r\n" + text4  +text5;
  String textTwo1 = "Mysterious Figure: Loyddddddddddddd!! I've returned! Wait, how are you out of your chair? Oh no, did I do the thing that I sometimes do by capitalizing the letters that I am thinking about... DARN IT! Well, I brought us donuts, you can take one if you want..";
  String textThree = "Mysterious Figure: You know Loyd, we haven't talked in a while, you may be surprised that I was the one who kidnapped you and attached you to an electric chair. Well, it all dates back to our college graduation, where you TRIPPED ME! You put a banana on the ground and I slipped and fell. I THOUGHT WE WERE FRIENDS LOYD! And you must be thinking, **is this vantri?** and the answer to that question.... is maybe........................ I THOUGHT WE WERE FRIENDS LOYD! *also smart one about getting out of the chair* Have fun trying to escape here for the rest of your life, with the donut being the only thing you'll eat until you collapse of hunger. byeeeeeeeee! (Click text box to continue)";
  String textFour = "(You think to yourself) Of course it was Vantri. This guy never takes a joke... I mean maybe it was a little harsh, but he didn't break anything, and it's definitely not worth him covering my head with a bag and bringing me into a random place for me to DIE! Wait, I recognize this door.. is- is this Vantri's mom's house?? I KNOW WHERE I AM! MY HOUSE IS A FIVE MINUTE WALK FROM HERE! Ok, now I need to figure out how to get out of here. Is that a screwdriver on the floor? I thin, I'll need that, since the door has screws on the... VANTRI PUT STEEL ON THE DOOR???? Man, he's really salty about the banana thing, I kind of feel bad....... nah. It was funny. I guess I should pick up at screwdriver, and that bookshelf might have something I can use.";

  public void settings() {
	// put your size call here
    
    size(600, 600);
    
    map = loadImage("MAP.png");
    loyd = loadImage("Loyd.png");
    villain = loadImage("villain simple.png");
    villainDonut = loadImage("villain donut.png");
    villainDonutMinusOne = loadImage("villainDonut2.png");
    closeBook = loadImage("CloseBook.png");
    screwdriver = loadImage("Screwdriver.png");
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    String [] fontList = PFont.list();
    printArray(fontList);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
   System.out.println(mouseX + "," + mouseY);
    image(map, 0, 0, width, height);
	  electricChair();
    textBox();
    if(loydY<70){
      loydY=70;
    }
    if(loydX>352 && loydY < 85){
      loydX = 352;
    }
    
    if(loydY<88 && loydX <=514 && loydX >=412){
      loydY = 88;
    }
    else if(loydX >514){
      loydX = 514;
    }
    if(loydY > 328){
      loydY = 328;
    }
    if(steelOnDoor = true){
      wallSteel();
    }
    
    
    if(simonSolved == true){
      villain1 = true;
        //villain with donut walks in
  box2 = true;
  if(villainX >= 115){
    villainX = 115;
    if(mouseX>145 && mouseX<244 && mouseY>221 && mouseX<244){
    fill(211,245,211, 80);
    rect(145, 221, 83, 23);
    }
    if(villainX <= -100){
      villainX = -150;
    }
      
    
  }
  if(villain1 && takeDonut == false){
  image(villainDonut, villainX, villainY);
    villainX++;
    if(loydX >=180 && loydX <= 200 && loydY >=160 && loydY <=180 && takeDonut == false){
      noStroke();
      boxThing = true;
      }
      
    }
    if(boxThing){
      fill(211,245,211, 80);
      rect(144, 222, 84, 23);
  }
  if(villain2){
    image(villainDonutMinusOne, villainX, villainY);
    box2 = false;
    box3 = true;
    villainX = -150;
    boxThing = false;

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
    }
    image(loyd, loydX, loydY);
    if(simonSolved == false){
      simonChair();
    }
    if(mouseX >= 247 && mouseX <= 300 && mouseY >= 300 && mouseY <= 320 && simonSolved == false){
      noStroke();
      fill(211,245,211, 90);
      rect(247, 300, 33, 20);
    }
    if(simonScreen){
      simonSays();
    }
   
  if(simonScreen){
  if(simonClick1){
    rect(simonRectX[0], 524, 80, 25);
  }
  if(simonClick2){
    fill(43);
    rect(simonRectX[0], 524, 80, 25);
  }
  if(simonClick3){
    fill(43);
    rect(simonRectX[1], 524, 80, 25);
  }
  
  if(simonClick4){
    fill(43);
    rect(simonRectX[2], 524, 80, 25);
    
  }

  
}
if (death){
  fill(69, 3, 3, 160);
  noStroke();
  rect(0,0,height, width);
  fill(60, 3, 3);
  text("YOU DIED.", 290, 240);
}
if(simonSolved == true){

  //after villain donut, bookshelf
  if(loydX >=400 && loydY <= 88 && loydX<600 && mouseX >=400 && mouseY <88 && mouseX <600 && mouseY<88 && takeDonut == true){
    noStroke();
    fill(211,245,211, 90);
    rect(437, 31, 161, 149);
  }
}
if(openBookshelf == true){
  image(closeBook, bookX, bookY);
}
if(screwDriverUp == false){
  image(screwdriver, 500, 400);
}
if(box4 == true && screwDriverUp == false && mouseX >= 518 && mouseY >= 417 && mouseX <= 550 && mouseY <= 520){
  noStroke();
  fill(211,245,211, 90);
  rect(518, 417, 59, 19);
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
    
    if(box2 == true &&takeDonut == false){
      box1 = false;
      text(textTwo1, 25, 450, 590, 600);
    }
    if(box1){
      text(textBox1, 25, 450, 590, 600);
    }
    if(box3 == true){
      box2 = false;
      text(textThree, 25, 450, 590, 600);
      }
    if(box4 == true){
      box3 = false;
       text(textFour, 25, 450, 590, 600);
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
    rect(215, 524, 80, 25);
    rect(310, 524, 80, 25);
    rect(405, 524, 80, 25);
    rect(150, 50, 300, 40);
    fill(43);
    rect(120, 524, 80, 25);
    fill(160);
    
    
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
    if(box4 == true && mouseX >= 500 && mouseY >= 400 && mouseX <= 550 && mouseY <= 520){
      screwDriverUp = true;
    }
    if(box3 ==true && mouseX >= 25 && mouseY>= 450 && mouseX <= 590 && mouseY <= 600 ){
      villain2 = false;
      box4 = true;
      box3 = false;
    }
    if(takeDonut == true && mouseX >=400 && mouseY >= 0 && mouseX<=600 && mouseY<= 188){
      openBookshelf = true;
    }
  if(simonSolved == true){
    if(loydX >=180 && loydX <= 200 && loydY >=160 && loydY <=180 && mouseX>=145 && mouseX <=228 && mouseY>=221 && mouseY <= 244){
      takeDonut = true;
      villain1 = false;
      villain2 = true;
  }
}

    if(mouseX >= 247 && mouseX <= 280 && mouseY >= 300 && mouseY <=320){
      simonScreen = true;
      simonStart = true;
    }
    if(simonScreen){
      fill(43);
      if(simonClick4){
        if(mouseX >= 106 && mouseX <=300 && mouseY >= 106 && mouseY <= 300){
          simonGuess[3] = 'b';
         }
         //red
         else if(mouseX >= 106 && mouseX <=300 && mouseY >= 300 && mouseY <=494){
          simonGuess[3] = 'r';
         }
         //green
         else if(mouseX >= 300 && mouseX <= 494 && mouseY >=103 && mouseY <=297){
          simonGuess[3] = 'g';
         }
         else if(mouseX >=300 && mouseX <= 494 && mouseY >= 300 && mouseY <=494){
          simonGuess[3] = 'y';
         }
         simonDone = true;
      }
      else if(simonClick3){
        if(mouseX >= 106 && mouseX <=300 && mouseY >= 106 && mouseY <= 300){
          simonGuess[2] = 'b';
         }
         //red
         else if(mouseX >= 106 && mouseX <=300 && mouseY >= 300 && mouseY <=494){
          simonGuess[2] = 'r';
         }
         //green
         else if(mouseX >= 300 && mouseX <= 494 && mouseY >=103 && mouseY <=297){
          simonGuess[2] = 'g';
         }
         else if(mouseX >=300 && mouseX <= 494 && mouseY >= 300 && mouseY <=494){
          simonGuess[2] = 'y';
         }
         simonClick4 = true;
      }
      else if(simonClick2){
        if(mouseX >= 106 && mouseX <=300 && mouseY >= 106 && mouseY <= 300){
          simonGuess[1] = 'b';
         }
         //red
         else if(mouseX >= 106 && mouseX <=300 && mouseY >= 300 && mouseY <=494){
          simonGuess[1] = 'r';
         }
         //green
         else if(mouseX >= 300 && mouseX <= 494 && mouseY >=103 && mouseY <=297){
          simonGuess[1] = 'g';
         }
         else if(mouseX >=300 && mouseX <= 494 && mouseY >= 300 && mouseY <=494){
          simonGuess[1] = 'y';
         }
         simonClick3 = true;
      }
     else if(simonStart){
      if(mouseX >= 106 && mouseX <=300 && mouseY >= 106 && mouseY <= 300){
      simonGuess[0] = 'b';
     }
     //red
     else if(mouseX >= 106 && mouseX <=300 && mouseY >= 300 && mouseY <=494){
      simonGuess[0] = 'r';
     }
     //green
     else if(mouseX >= 300 && mouseX <= 494 && mouseY >=103 && mouseY <=297){
      simonGuess[0] = 'g';
     }
     else if(mouseX >=300 && mouseX <= 494 && mouseY >= 300 && mouseY <=494){
      simonGuess[0] = 'y';
     }
     simonClick2 = true;
    } 
    if(simonGuess[0] == 'r' && simonGuess[1] == 'g' && simonGuess[2] == 'b' && simonGuess[3] == 'y'){
      simonScreen = false;
      simonSolved = true;
    }
    else if(simonGuess[1] == 'r' || simonGuess[1] == 'b' || simonGuess[1] == 'y' || simonGuess[3] == 'g' || simonGuess[3] == 'b' ){
      simonScreen = false;
      death = true;
    }
    
    else if(simonGuess != simonReal && simonDone == true){
      simonScreen = false;
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
    if(keyCode == ALT & simonScreen){
      simonScreen = false;
      simonGuess = new char[4];
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
