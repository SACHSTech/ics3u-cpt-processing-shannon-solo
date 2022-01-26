

import org.w3c.dom.events.MouseEvent;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
  
public class Sketch extends PApplet {
/** 
 * A program Sketch.java that sends you into the game of Loyd Escape where you play as Loyd, and your goal is to escape the room you're put in by an old friend
 * 
* @author S. Bulian
* @param steelOnDoor determines if the steel is on the wall
* @param hasKey if character has the key
* @param hasScrewdriver if Loyd has the screwdriver
* @param firstText if the first text box is on the screen
* @param upPressed if the up arrow is pressed
* @param downPressed if the down arrow is pressed
* @param leftPressed if the left arrow is pressed
* @param rightPressed if the right arrow is pressed
* @param simonSolved if the "simon says" puzzle is solved
* @param simonScreen if the "simon says" puzzle is on the screen 
* @param simonClick1 if the opening click of the "simon says" pizzle occurs
* @param simonClick2 if the second click of the "simon says" pizzle occurs
* @param simonClick3 if the third click of the "simon says" pizzle occurs
* @param simonClick4 if the fourth click of the "simon says" pizzle occurs
* @param simonStart if the "simon says" puzzle starts
* @param simonDone if the "simon says" puzzle is complete
* @param death if Loyd dies
* @param openBookshelf if the bookshelf is on the screen
* @param takeDonut if Loyd took a donut yet
* @param villain1 if the first villain image is on the screen
* @param villain2 if the second villain image is on the screen
* @param box1 if the first text box is on the screen
* @param box2 if the second text box is on the screen
* @param box3 if the third text box is on the screen
* @param box4 if the fourth text box is on the screen
* @param box5 if the fifth text box is on the screen
* @param box6 if the sixth text box is on the screen
* @param box7 if the seventh text box is on the screen
* @param box8 if the eighth text box is on the screen
* @param box9 if the nineth text box is on the screen
* @param screwDriverUp if you've picked up the screwdriver yet
* @param realBook if the book from the bookshelf is opened
* @param safeClick1 if the first click of the safe has occured
* @param safeClick2 if the second click of the safe has occured
* @param safeClick3 if the third click of the safe has occured
* @param safeClick4 if the fourth click of the safe has occured
* @param safeClick5 if the fifth click of the safe has occured
* @param safeClick6 if the sixth click of the safe has occured
* @param safeUnlocked if the safe is unlocked
* @param safeOpen if the safe has been opened
* @param openSafe to show the opened safe image
* @param out if you've gotten out of the room/escaped
* @param r variable used for a click of the red colour in simon says
* @param g variable used for a click of the green colour in simon says
* @param b variable used for a click of the blue colour in simon says
* @param y variable used for a click of the yellow colour in simon says
* @param simonReal[] the real "simon says" puzzle code
* @param simonGuess[] the player's guess of the "simon says" puzzle
* @param simonRectX[] simon says indicators as to where you are in the puzzle
* @param safeLock[] the safe's true password
* @param safeGuess[] your guess of the safe's password
* @param loydX your character, loyd's x value
* @param loydY your character, loyd's y value
* @param villainX the villain's x value
* @param villainY the villain's y value
* @param bookX the closeup of the bookshelf's x value
* @param bookY the closeup of the bookshelf's y value
* @param map the image of the map/room you are in
* @param loyd the image of your character, loyd
* @param villainDonut the image of the villain with donuts
* @param villain the image of the villain without donuts
* @param villainDonutMinusOne the image of the villain without a single donut
* @param closeBook the image of the closeup of the bookshelf
* @param screwdriver the image of the screwdriver
* @param filledBook the image of the book with the scribbles
* @param safe the image of the locked safe
* @param itOpen the image of the opened safe
* @param text1 first text box, first line
* @param text2 first text box, second line
* @param text3 first text box, third line
* @param text4 first text box, fourth line
* @param text5 first text box, fifth line
* @param textBox1 first text box as a whole
* @param textTwo1 second text box text
* @param textThree third text box text
* @param textFour fourth text box text
* @param textFive fifth text box text
* @param textSix sixth text box text
* @param textSeven seventh text box text
* @param textEight eighth text box text
* @param textNine nineth text box text
 */
//declare variables
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
  boolean simonClick1 = false;
  boolean simonClick2 = false;
  boolean simonClick3 = false;
  boolean simonClick4 = false;
  boolean simonStart = false;
  boolean simonDone = false;
  boolean death;
  boolean openBookshelf = false;
  boolean takeDonut = false;
  boolean villain1 = false;
  boolean villain2 = false;
  boolean box3 = false;
  boolean box4 = false;
  boolean box5 = false;
  boolean box6 = false;
  boolean box7 = false;
  boolean box8 = false;
  boolean box9 = false;
  boolean boxThing;
  boolean screwDriverUp = false;
  boolean realBook = false;
  boolean safeClick1 = false;
  boolean safeClick2 = false;
  boolean safeClick3 = false;
  boolean safeClick4 = false;
  boolean safeClick5 = false;
  boolean safeClick6 = false;
  boolean safeUnlocked = false;
  boolean safeOpen = false;
  boolean openSafe = false;
  boolean out = false;
  char r;
  char g;
  char b;
  char y;
  char simonReal[] = {r, g, b, y};
  char simonGuess[] = new char[4];
  int simonRectX[] = {120, 215, 310, 405};
  int safeLock[] = {0, 2, 6, 4, 5, 8};
  int safeGuess[] = new int[6];
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
  PImage filledBook;
  PImage safe;
  PImage itOpen;
  String text1 = "mysterious voice: welcome loyd! I know you may be confused, who is this talking to me? where am";
  String text2 = "i? what is this thing im trapped in? which are all good questions, and they may be answered."; 
  String text3 = "all you need to know is that there is no way you're getting out. the electric chair i trapped"; 
  String text4 = "you in, I made it with a very complicated 3 digit password I only know. and don't try and put in a combination loyd! it might electricute you if you're wrong! with that, Good luck, and have "; 
  String text5 = "Bucket's of fun rotting away loYd <3 (If you die in the game, quit and try again)";   
  String textBox1 = text1 + "\r\n" + text2 + "\r\n" + text3 +"\r\n" + text4  +text5;
  String textTwo1 = "Mysterious Figure: Loyddddddddddddd!! I've returned! Wait, how are you out of your chair? Oh no, did I do the thing that I sometimes do by capitalizing the letters that I am thinking about... DARN IT! Well, I brought us donuts, you can take one if you want..";
  String textThree = "Mysterious Figure: You know Loyd, we haven't talked in a while, you may be surprised that I was the one who kidnapped you and attached you to an electric chair. Well, it all dates back to our college graduation, where you TRIPPED ME! You put a banana on the ground and I slipped and fell. I THOUGHT WE WERE FRIENDS LOYD! And you must be thinking, is this vantri? and the answer to that question.... is maybe........................ I THOUGHT WE WERE FRIENDS LOYD! also smart one about getting out of the chair... Have fun trying to escape here for the rest of your life, with the donut being the only thing you'll eat until you collapse of hunger. byeeeeeeeee! (Click text box to continue)";
  String textFour = "(You think to yourself) Of course it was Vantri. This guy never takes a joke... I mean maybe it was a little harsh, but he didn't break anything, and it's definitely not worth him covering my head with a bag and bringing me into a random place for me to DIE! Wait, I recognize this door.. is- is this Vantri's mom's house?? I KNOW WHERE I AM! MY HOUSE IS A FIVE MINUTE WALK FROM HERE! Ok, now I need to figure out how to get out of here. Is that a screwdriver on the floor? I thin, I'll need that, since the door has screws on the... VANTRI PUT STEEL ON THE DOOR???? Man, he's really salty about the banana thing, I kind of feel bad....... nah. It was funny. I guess I should pick up at screwdriver, and that bookshelf might have something I can use.";
  String textFive = "(You think to yourself) One of these books might help me, but which one....(Move your mouse all over all of the books to see which one you should look in)";
  String textSix = "(You think to yourself) I guess I should read this story, something seems off though. I guess these numbers are supposed to mean something? I don't know, what this substance is, but Vantri likes his chocolate milk, so I guess it's chocolate syrup... hopefully. (Click ALT to escape)";
  String textSeven = "(You think to yourself) Maybe I should try these numbers on that safe over there, hopefully a key for the locked door is there.";
  String textEight = "(You think to yourself) This must be it! I'll take this key, screw the screws off of the metal, and unlock the door! I'll be free!";
  String textNine = "(You think to yourself) Alright, let's see if I can get out! (Stand in front of the door and click it!)";
  public void settings() {
    
    size(600, 600);
    //load images
    map = loadImage("MAP.png");
    loyd = loadImage("Loyd.png");
    villain = loadImage("villain simple.png");
    villainDonut = loadImage("villain donut.png");
    villainDonutMinusOne = loadImage("villainDonut2.png");
    closeBook = loadImage("CloseBook.png");
    screwdriver = loadImage("Screwdriver.png");
    filledBook = loadImage("filedBoook.png");
    safe = loadImage("safe.png");
    itOpen = loadImage("openSafe.png");
    
  }
  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    //draw the inital appearance of the room
    image(map, 0, 0, width, height);
	  electricChair();
    textBox();

    //establish collision
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
    if(loydY > 289 && loydY<390 && loydX >6 && loydX<87){
      loydX = 87;
    }
    if(steelOnDoor = true){
      wallSteel();
    }
    
    //if simon is solved, the villain walks in
    if(simonSolved == true){
      villain1 = true;
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
  //villain walks in with donut
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
  //villain dissapears
  if(villain2){
    image(villainDonutMinusOne, villainX, villainY);
    box2 = false;
    box3 = true;
    villainX = -150;
    boxThing = false;
  }
  //movement can now happen (if simon is solved)

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
  //the creation of your character, Loyd
  image(loyd, loydX, loydY);

  //appearance of module on chair
   if(simonSolved == false){
      simonChair();
    }
  
  if(mouseX >= 247 && mouseX <= 300 && mouseY >= 300 && mouseY <= 320 && simonSolved == false){
      noStroke();
      fill(211,245,211, 90);
      rect(247, 300, 33, 20);
    }
  //simon says appearin on screen/the progress bar of simon
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
//what happens when you die/get electrocuted
if (death){
  fill(69, 3, 3, 160);
  noStroke();
  rect(0,0,height, width);
  fill(60, 3, 3);
  textSize(40);
  box1 = false;
  box2 = false;
  text("YOU DIED.", 220, 180);
}
if(simonSolved == true){

  if(loydX >=400 && loydY <= 88 && loydX<600 && mouseX >=400 && mouseY <88 && mouseX <600 && mouseY<88 && takeDonut == true){
    noStroke();
    fill(211,245,211, 90);
    rect(437, 31, 161, 149);
  }
}
//appearance of the bookshelf
if(openBookshelf == true){
  image(closeBook, bookX, bookY);
  box5 = true;
  textBox();

  //if your mouse is in the right spot, the real book shows itself
  if(mouseX > 182 && mouseY <329 && mouseX < 194 && mouseY >266){
    noStroke();
    fill(211,245,211, 90);
    rect(182, 269, 12, 63);
    realBook = true;
  }
}

if(screwDriverUp == false){
  image(screwdriver, 500, 400);
}

//selection rectangle
if(box4 == true && screwDriverUp == false && mouseX >= 518 && mouseY >= 417 && mouseX <= 550 && mouseY <= 520){
  noStroke();
  fill(211,245,211, 90);
  rect(518, 417, 59, 19);
}

//show image of the book
if(realBook == true){
  image(filledBook, 92, 100);
  openBookshelf = false;
  box6 = true;
  textBox();
}


if(safeOpen == true){
  image(safe, 82, 90);
}

if(openSafe == true){
  image(itOpen, 190, 196);
  safeOpen = false;
  box8 = true;
  hasKey = true;
  textBox();
}

if(box7 == true && loydX >0 && loydX <184 && loydY >234 && loydY <427 && mouseX > 0 && mouseX <95 && mouseY > 280 && mouseY <400){
  noStroke();
  fill(211,245,211, 90);
  rect(0, 280, 95, 120);
}

if(steelOnDoor == false && mouseX>= 59 && mouseY >=48 && mouseY<=147 && mouseX <= 150){
  noStroke();
  fill(211,245,211, 90);
  rect(59, 48, 100, 100);
}

//what happens when you leave the room after solving all of the puzzles
if(out == true){
fill(0);
rect(0, 0, 600, 600);
textSize(15);
fill(115, 3, 3);
text("oh loyd. you coudn't have thought that it was only the one room...", 64, 300);
text("(the end... for now)", 20, 500);
}
}
  

  //processing of the appearance of the electric chair
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

  //processing of the steel on the wall of the door
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
//the text boxes appearing on screen
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
    if(box5 == true){
      box4 = false;
      text(textFive, 25, 450, 590, 600);
    }
    if(box6 == true){
      box5 = false;
      text(textSix, 25, 450, 590, 600);
    }
    if(box7 == true){
      box6 = false;
      text(textSeven, 25, 450, 590, 600);
    }
    if(box8 == true){
      box7 = false;
      text(textEight, 25, 450, 590, 600);
    }
    if(box9 == true){
      box8 = false;
      text(textNine, 25, 450, 590, 600);
    }
    }
  
    //the simon says program appearance
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

  //the simon says on the chair's module
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

  //certain things happening at different times when/where the mouse is clicked
  public void mouseClicked(){
    if(box7 == true && loydX >0 && loydX <184 && loydY >234 && loydY <427 && mouseX > 0 && mouseX <95 && mouseY > 280 && mouseY <400){
      safeOpen = true;
    }
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
//simon says code
    if(mouseX >= 247 && mouseX <= 280 && mouseY >= 300 && mouseY <=320){
      simonScreen = true;
      simonStart = true;
    }
    if(simonScreen){
      fill(43);
      if(simonClick4){
      {
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
    else if(simonGuess[1] == 'r' || simonGuess[1] == 'b' || simonGuess[1] == 'y' ){
      simonScreen = false;
      death = true;
    }
    
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
//safe code
if(safeOpen == true){
  safeGuess[0] = 0;

if(safeClick6 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 247 && mouseY <=263){
	safeUnlocked = true;
	safeGuess[6] = 1;
}
if(safeClick6 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 247 && mouseY <=263){
	safeUnlocked = true;
	safeGuess[6] = 2;
}
if(safeClick6 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 247 && mouseY <=263){
	safeUnlocked = true;
	safeGuess[6] = 3;
}
if(safeClick6 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 275 && mouseY <=293){
	safeUnlocked = true;
	safeGuess[6] = 4;
}
if(safeClick6 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 275 && mouseY <=293){
	safeUnlocked = true;
	safeGuess[6] = 5;
}
if(safeClick6 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 275 && mouseY <=293){
	safeUnlocked = true;
	safeGuess[6] = 6;
}
if(safeClick6 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 304 && mouseY <=321){
	safeUnlocked = true;
	safeGuess[6] = 7;
}
if(safeClick6 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 304 && mouseY <=321){
	safeUnlocked = true;
	safeGuess[6] = 8;
}
if(safeClick6 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 304 && mouseY <=321){
	safeUnlocked = true;
	safeGuess[6] = 9;
}
if(safeClick5 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 247 && mouseY <=263){
	safeClick6 = true;
	safeGuess[5] = 1;
}
if(safeClick5 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 247 && mouseY <=263){
	safeClick6 = true;
	safeGuess[5] = 2;
}
if(safeClick5 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 247 && mouseY <=263){
	safeClick6 = true;
	safeGuess[5] = 3;
}
if(safeClick5 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 275 && mouseY <=293){
	safeClick6 = true;
	safeGuess[5] = 4;
}
if(safeClick5 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 275 && mouseY <=293){
	safeClick6 = true;
	safeGuess[5] = 5;
}
if(safeClick5 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 275 && mouseY <=293){
	safeClick6 = true;
	safeGuess[5] = 6;
}
if(safeClick5 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 304 && mouseY <=321){
	safeClick6 = true;
	safeGuess[5] = 7;
}
if(safeClick5 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 304 && mouseY <=321){
	safeClick6 = true;
	safeGuess[5] = 8;
}
if(safeClick5 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 304 && mouseY <=321){
	safeClick6 = true;
	safeGuess[5] = 9;
}
if(safeClick4 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 247 && mouseY <=263){
	safeClick5 = true;
	safeGuess[4] = 1;
}
if(safeClick4 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 247 && mouseY <=263){
	safeClick5 = true;
	safeGuess[4] = 2;
}
if(safeClick4 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 247 && mouseY <=263){
	safeClick5 = true;
	safeGuess[4] = 3;
}
if(safeClick4 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 275 && mouseY <=293){
	safeClick5 = true;
	safeGuess[4] = 4;
}
if(safeClick4 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 275 && mouseY <=293){
	safeClick5 = true;
	safeGuess[4] = 5;
}
if(safeClick4 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 275 && mouseY <=293){
	safeClick5 = true;
	safeGuess[4] = 6;
}
if(safeClick4 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 304 && mouseY <=321){
	safeClick5 = true;
	safeGuess[4] = 7;
}
if(safeClick4 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 304 && mouseY <=321){
	safeClick5 = true;
	safeGuess[4] = 8;
}
if(safeClick4 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 304 && mouseY <=321){
	safeClick5 = true;
	safeGuess[3] = 9;
}
if(safeClick3 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 247 && mouseY <=263){
	safeClick4 = true;
	safeGuess[3] = 1;
}
if(safeClick3 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 247 && mouseY <=263){
	safeClick4 = true;
	safeGuess[3] = 2;
}
if(safeClick3 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 247 && mouseY <=263){
	safeClick4 = true;
	safeGuess[3] = 3;
}
if(safeClick3 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 275 && mouseY <=293){
	safeClick4 = true;
	safeGuess[3] = 4;
}
if(safeClick3 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 275 && mouseY <=293){
	safeClick4 = true;
	safeGuess[3] = 5;
}
if(safeClick3 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 275 && mouseY <=293){
	safeClick4 = true;
	safeGuess[3] = 6;
}
if(safeClick3 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 304 && mouseY <=321){
	safeClick4 = true;
	safeGuess[3] = 7;
}
if(safeClick3 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 304 && mouseY <=321){
	safeClick4 = true;
	safeGuess[3] = 8;
}
if(safeClick3 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 304 && mouseY <=321){
	safeClick4 = true;
	safeGuess[3] = 9;
}
if(safeClick2 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 247 && mouseY <=263){
    safeClick3 = true;
    safeGuess[2] = 1;
  }
  if(safeClick2 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 247 && mouseY <=263){
    safeClick3 = true;
    safeGuess[2] = 2;
  }
  if(safeClick2 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 247 && mouseY <=263){
    safeClick3 = true;
    safeGuess[2] = 3;
  }
  if(safeClick2 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 275 && mouseY <=293){
    safeClick3 = true;
    safeGuess[2] = 4;
  }
  if(safeClick2 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 275 && mouseY <=293){
    safeClick3 = true;
    safeGuess[2] = 5;
  }
  if(safeClick2 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 275 && mouseY <=293){
    safeClick3 = true;
    safeGuess[2] = 6;
  }
  if(safeClick2 == true && mouseX >=243 && mouseX <= 270 && mouseY>= 304 && mouseY <=321){
    safeClick3 = true;
    safeGuess[2] = 7;
  }
  if(safeClick2 == true && mouseX >=284 && mouseX <= 310 && mouseY>= 304 && mouseY <=321){
    safeClick3 = true;
    safeGuess[2] = 8;
  }
  if(safeClick2 == true && mouseX >=322 && mouseX <= 350 && mouseY>= 304 && mouseY <=321){
    safeClick3 = true;
    safeGuess[2] = 9;
  }
    if(safeOpen == true && mouseX >=243 && mouseX <= 270 && mouseY>= 247 && mouseY <=263){
      safeClick2 = true;
      safeGuess[1] = 1;
    }
    if(safeOpen == true && mouseX >=284 && mouseX <= 310 && mouseY>= 247 && mouseY <=263){
      safeClick2 = true;
      safeGuess[1] = 2;
    }
    if(safeOpen == true && mouseX >=322 && mouseX <= 350 && mouseY>= 247 && mouseY <=263){
      safeClick2 = true;
      safeGuess[1] = 3;
    }
    if(safeOpen == true && mouseX >=243 && mouseX <= 270 && mouseY>= 275 && mouseY <=293){
      safeClick2 = true;
      safeGuess[1] = 4;
    }
    if(safeOpen == true && mouseX >=284 && mouseX <= 310 && mouseY>= 275 && mouseY <=293){
      safeClick2 = true;
      safeGuess[1] = 5;
    }
    if( (safeOpen == true) && mouseX >=322 && mouseX <= 350 && mouseY>= 275 && mouseY <=293){
      safeClick2 = true;
      safeGuess[1] = 6;
    }
    if( (safeOpen == true) && mouseX >=243 && mouseX <= 270 && mouseY>= 304 && mouseY <=321){
      safeClick2 = true;
      safeGuess[1] = 7;
    }
    if( (safeOpen == true) && mouseX >=284 && mouseX <= 310 && mouseY>= 304 && mouseY <=321){
      safeClick2 = true;
      safeGuess[1] = 8;
    }
    if( safeOpen == true && mouseX >=322 && mouseX <= 350 && mouseY>= 304 && mouseY <=321){
      safeClick2 = true;
      safeGuess[1] = 9;
    }
    if(safeGuess[5] == 8){
      openSafe = true;
    }
  
}
if(box8 && mouseX >= 250 && mouseX <= 400){
  openSafe = false;
  box9 = true;
}
if(hasKey == true){
  if(mouseX>= 59 && mouseY >=48 && mouseY<=147 && mouseX <= 150){
    steelOnDoor = false;
  }
  if(steelOnDoor == false && mouseX>= 59 && mouseY >=48 && mouseY<=147 && mouseX <= 150){
    out = true;
  }
}
  }


    
//movement variables
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
    if(keyCode == ALT & realBook == true){
      realBook = false;
      box7 = true;
    }
  }
  //removal of movement vairables
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
