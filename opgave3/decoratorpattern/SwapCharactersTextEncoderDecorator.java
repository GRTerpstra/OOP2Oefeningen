package opgave3.decoratorpattern;

import opgave3.TextEncoder;

public class SwapCharactersTextEncoderDecorator extends TextEncoderDecorator {

	public SwapCharactersTextEncoderDecorator(TextEncoder textEncoder) {
		super(textEncoder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String encode(String text) {
		text=textEncoder.encode(text);
		StringBuilder sb=new StringBuilder(text);
		for(int x=0; x<text.length()-1; x++) {
			if(x % 2 == 0) {
				char currentLetter = sb.charAt(x);
				sb.setCharAt(x, sb.charAt(x+1));
				sb.setCharAt((x+1), currentLetter);
			}
		}
		return sb.toString();
	}

}
