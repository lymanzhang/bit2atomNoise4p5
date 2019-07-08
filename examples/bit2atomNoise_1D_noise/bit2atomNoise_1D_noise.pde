import bit2atomNoise4p5.*;

Bit2atomNoise baNoise;

float increment = 0.01;
float xoff = 0;

void setup() {
  size(600, 600);
  baNoise = new Bit2atomNoise(this);
}

void draw() {
  background(0);

  float xnoise = baNoise.noise(xoff)*width;
  ellipse(xnoise, height/2, 32, 32);
  xoff += increment;
}
