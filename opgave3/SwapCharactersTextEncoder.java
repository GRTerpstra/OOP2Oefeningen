package opgave3;

public class SwapCharactersTextEncoder implements TextEncoder {

	@Override
	public String encode(String text) {
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
