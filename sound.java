package multipong;

import java.applet.Applet;
import java.applet.AudioClip;

public class sound {
	public static final AudioClip BALL = Applet.newAudioClip(sound.class.getResource("ball.wav"));
	public static final AudioClip GAMEOVER = Applet.newAudioClip(sound.class.getResource("gameover.wav"));
	public static final AudioClip BACK = Applet.newAudioClip(sound.class.getResource("back.wav"));
}
