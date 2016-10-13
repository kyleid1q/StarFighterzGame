/*	StarFighterz 
 *	Version 1.0
 *	Kyle Simmons
 *
 *	CLASS - Player - Creates the player
 */

package starfighterz;
import processing.core.*;

public class Player {

	private PApplet sketch;
	private PImage playerIMG;
	
	public int pos_x;
	public int pos_y;
	public int speed;
	private int reset_x;
	private int reset_y;

	Player(PApplet sketch, int pos_x, int pos_y, int speed) {
		this.sketch = sketch;
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		this.speed = speed;
		this.reset_x = pos_x;
		this.reset_y = pos_y;
		playerIMG = sketch.loadImage("images/fighterUp.png");
	}
	
	/*
	 *  Draws the player on screen
	 */
	private void renderPlayer() {
		sketch.image(playerIMG, pos_x, pos_y);
	}
	
	/*
	 *	Moves the player left / right and changes image  
	 */
	private void movePlayer() {
		if(sketch.keyPressed == true) {
			if(sketch.key == PConstants.CODED) {
				if(sketch.keyCode == PConstants.LEFT && pos_x > 2) {			
					playerIMG = sketch.loadImage("images/fighterLeft.png");
					this.pos_x = this.pos_x - this.speed;											
				}
				else if(sketch.keyCode == PConstants.RIGHT && pos_x < 660) {
					playerIMG = sketch.loadImage("images/fighterRight.png");
					this.pos_x = this.pos_x + this.speed;
				}
			}
		} else {
			playerIMG = sketch.loadImage("images/fighterUp.png");
		}
	}
	
	/*
	 *	Resets player to original position
	 */
	public void resetPlayer() {
		this.pos_x = this.reset_x;
		this.pos_y = this.reset_y;
	}
	
	/*
	 *	Loads all methods 
	 */
	public void update() {
		renderPlayer();
		movePlayer();
	}
}