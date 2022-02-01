package opgave3;

import java.util.ArrayList;

public class ReverseTextEncoder implements TextEncoder {

	@Override
	public String encode(String text) {
		ArrayList<String> oldText = new ArrayList<>();
		String newText = "";
		oldText.add(text);
		for(int x=(oldText.get(0).length()-1); x>=0; x--) {
			newText += oldText.get(0).charAt(x);
			
		}
		return newText;
	}
	
}
