package opgave3.decoratorpattern;

import opgave3.TextEncoder;

public class ConcreteTextEncoder implements TextEncoder {

    @Override
    public String encode(String text) {
        return text;
    }

}
