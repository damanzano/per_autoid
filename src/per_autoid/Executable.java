package per_autoid;

import processing.core.PApplet;

public class Executable extends PApplet {
	private Logic log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("per_autoid.Executable", args);
	}
	
	public void settings(){
		size(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
	public void setup(){
		log = new Logic(this);
	}
	
	public void draw(){
		log.paint();
	}

}
