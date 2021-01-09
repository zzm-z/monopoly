package run;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Play0 extends Thread{
	Player player;
    String music;
    public Play0(String file) {
        this.music = file;
    }
    public void run() {
        while(true) {
			try {
				play();
			} catch (FileNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (JavaLayerException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
    }
    public void play() throws FileNotFoundException, JavaLayerException { 
        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(music)); 
        player = new Player(buffer); 
        player.play();
    } 

}
