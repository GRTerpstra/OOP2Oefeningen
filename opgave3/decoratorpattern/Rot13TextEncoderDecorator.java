package opgave3.decoratorpattern;

import opgave3.TextEncoder;

public class Rot13TextEncoderDecorator extends TextEncoderDecorator {

	public Rot13TextEncoderDecorator(TextEncoder textEncoder) {
		super(textEncoder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String encode(String text) {
		text=textEncoder.encode(text);
        StringBuilder sb=new StringBuilder(text);
        for(int i=0; i<text.length(); i++) {
            char c=sb.charAt(i);
            if ((c>='a') && (c<='z')) {
                c+=13;
                if (c>'z') c-=26;
            }
            if ((c>='A') && (c<='Z')) {
                c+=13;
                if (c>'Z') c-=26;
            }
            sb.setCharAt(i,c);
        }
        return sb.toString();
    }

}
