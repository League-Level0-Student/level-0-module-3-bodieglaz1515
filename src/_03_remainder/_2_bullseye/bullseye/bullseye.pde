
void setup() {
 
  // set the size of your sketch
 size(1000,1000); 
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
for (int i = 10; i>0; i--){
  if (i % 2 == 0) {
fill(255,10,10);
    }
    else {
     fill(0,0,0);
    }
ellipse(500,500,i*90,i*90);


    }

}
  //Use an if statement and remainder to alternate the color of your rings.
  
  
