package processingJava;

import processing.core.PApplet;

public class StartProcessing extends PApplet {

	public static void main(String[] args) {
		PApplet.main("processingJava.StartProcessing");
	}

	@Override
	public void settings() {
		size(640, 480);
	}

	@Override
	public void setup() {
		background(0);
		frameRate(30);
	}

	@Override
	public void draw() {
		background(random(0,255),random(0,255),random(0,255));
	}

}
