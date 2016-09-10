import java.awt.Image;
import java.awt.Graphics;

public class Coin {
private Image head;
private Image tail;
private int currentFace=0; //0 is heads, 1 is tails 

	public Coin(Image a, Image b){
		head=a;
		tail=b;
	}
	
	public void flip(){
		if(currentFace==0){
			currentFace=1;
		}else{
			currentFace=0;
		}
	}
	
	public void draw(Graphics g, int x , int y){
		if(currentFace==0){
			g.drawImage(head, 0, 0, null);
		}else{
			g.drawImage(tail, 0, 0, null);
		}
	}
	
}
