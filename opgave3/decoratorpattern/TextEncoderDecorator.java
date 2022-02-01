package opgave3.decoratorpattern;

import opgave3.TextEncoder;

abstract public class TextEncoderDecorator implements TextEncoder {

    protected TextEncoder textEncoder;

    public TextEncoderDecorator(TextEncoder textEncoder) {
        this.textEncoder=textEncoder;
    }
}
