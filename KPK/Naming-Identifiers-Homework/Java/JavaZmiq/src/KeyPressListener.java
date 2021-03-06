import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressListener implements KeyListener{
	
	public KeyPressListener(TheGame game){
		game.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
			if(TheGame.snake.getVelocityY() != 20){
				TheGame.snake.setVelocityX(0);
				TheGame.snake.setVelocityY(-20);
			}
		}
		
		if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
			if(TheGame.snake.getVelocityY() != -20){
				TheGame.snake.setVelocityX(0);
				TheGame.snake.setVelocityY(20);
			}
		}
		
		if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
			if(TheGame.snake.getVelocityX() != -20){
			TheGame.snake.setVelocityX(20);
			TheGame.snake.setVelocityY(0);
			}
		}
		
		if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
			if(TheGame.snake.getVelocityX() != 20){
				TheGame.snake.setVelocityX(-20);
				TheGame.snake.setVelocityY(0);
			}
		}
		
		//Other controls
		if (keyCode == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}
	
	public void keyReleased(KeyEvent e) {
	
	}
	
	public void keyTyped(KeyEvent e) {
		
	}

}
