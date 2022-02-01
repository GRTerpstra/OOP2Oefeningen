package opgave3.decoratorpattern;

import java.util.ArrayList;

import opgave3.TextEncoder;

public class ReverseTextEncoderDecorator extends TextEncoderDecorator {

	public ReverseTextEncoderDecorator(TextEncoder textEncoder) {
		super(textEncoder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String encode(String text) {
		text=textEncoder.encode(text);
		ArrayList<String> oldText = new ArrayList<>();
		String newText = "";
		oldText.add(text);
		for(int x=(oldText.get(0).length()-1); x>=0; x--) {
			newText += oldText.get(0).charAt(x);
		}
		return newText;
	}

}
