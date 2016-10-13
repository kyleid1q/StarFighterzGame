/*	StarFighterz 
 *	Version 1.0
 *	Kyle Simmons
 *
 *	CLASS - Laser - Makes the player shoot
 */

package starfighterz;
import processing.core.*;

public class Laser extends StarFighterz {
	
	private PApplet sketch;
	private PImage laserIMG;
	
	private static final long serialVersionUID = 1L;
	public int pos_x;
	public int pos_y;
	public int speed;

	Laser(PApplet parent, int pos_x, int pos_y, int speed) {
		this.sketch = parent;
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		this.speed = speed;
		laserIMG = sketch.loadImage("images/laser.png");
	}
	
	/*
	 *	Draws the loser image
	 */
	public void renderLaser() {
		sketch.image(laserIMG, pos_x, pos_y);
	}

	/*
	 *	Moves the laser
	 */
	public void moveLaser() {
	    this.pos_y -= this.speed; 
	}
	
	/*
	 *	Loads all methods
	 */
	public void update() {
		renderLaser();
		moveLaser();
	}
} 