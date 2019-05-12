package optional;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {

		// 4. repeat steps 2 and 3 a lot of times
		for (int i = 0; i < 10; i++) {

			// 2. ask the user for a sentence
			String answer = JOptionPane.showInputDialog("Enter a sentence:");

			// 3. call the speak method below and send it the sentence
			if (answer.equals("")) {
				break;
			} else {
				speak(answer);
			}
		}
	}

	/* Don’t change this…. */
	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
