package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {

		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		/* 2. Make it so that the user can keep entering new animals. */

		for (;;) {

			String animal = JOptionPane
					.showInputDialog("What animal sound do you want to hear?\n Cow? Duck? Dog, cat or llama?");

			if (animal.equals("cow")) {
				playMoo();
			} else if (animal.equals("duck")) {
				playQuack();
			} else if (animal.equals("dog")) {
				playWoof();
			} else if (animal.equals("cat")) {
				playMeow();
			} else if (animal.equals("llama")) {
				playLlama();
			} else if (animal.equals("")) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Please enter some of the suggested animals.");
			}

		}

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
