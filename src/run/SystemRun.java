package run;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import Frame.ServerGameFrame;
import Frame.enterFrame;
import Frame.figureFrame;
import Frame.gameFrame;
import Frame.loginFrame;
import Frame.mainFrame;
import Frame.mapFrame2;

import mapFunction.Dice;

import function.CardFunction;
import function.GameFunction;

public class SystemRun extends Sql {

	public void round() {
		/*
		 * �غϷ��� ����غ��������ҽ�ÿ�غ���Ҫʵ�ֵķ�����������
		 */
	}
	public static Cursor createCursor() {
        //String fileName = "img/1.jpg";
        Image cursor = Toolkit.getDefaultToolkit().createImage("src\\images\\subiao1.png");
        return Toolkit.getDefaultToolkit().createCustomCursor(cursor, new Point(16, 16), "mycursor");
        
    }
	
	

	public static void main(String[] args) throws Exception {
		BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
		  UIManager.put("RootPane.setupButtonVisible", false);
		  BeautyEyeLNFHelper.launchBeautyEyeLNF();
		  Sql.connection();// �������ݿ�
//			Sql sql = new Sql();
			/*��Ҫ��mainframe�������ж�ǰ����Ҫ��ѡ�񵥻�����������ѡ�� һ��
			 * �Ǽ����ϴ���Ϸ �򲻳�ʼ��������¿�ʼ��Ϸ����ó�ʼ������
			 */
			//sql.initialization();
			
			//����Һ��˻�����,������������
		  File file1 = new File("src\\run\\bgm1.wav");
		  AudioClip sound1;
		  sound1 = Applet.newAudioClip(file1.toURL());
		  sound1.play();
		  new mainFrame().setVisible(true);
		  new Play0("src/images/bgm1.mp3").start();
		  


	}

}
