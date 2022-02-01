package opgave3;

import opgave3.decoratorpattern.*;
import java.io.IOException;
import java.util.List;

public class Main {

    public static final String FILENAME = "opgave3/java.txt";

    public static void main(String[] args) throws IOException {
        List<String> encryptedFileContents;

        // OPGAVE a
//        TextEncoder rot13TextEncoder = new Rot13TextEncoder();
//        TextFileEncoder textFileEncoderRot13 = new TextFileEncoder(rot13TextEncoder);
//
//        System.out.println("Apply ROT13 on contents of "+FILENAME+":");
//        System.out.println("[Correcte output eerste regel: Jnnebz mbh ryxr cebtenzzrhe Wnin zbrgra yrera?]");
//        encryptedFileContents = textFileEncoderRot13.encodeTextFile(FILENAME);
//        encryptedFileContents.forEach(System.out::println);

        // OPGAVE b
//        TextEncoder reverseTextEncoder = new ReverseTextEncoder();
//        TextEncoder swapCharactersTextEncoder = new SwapCharactersTextEncoder();
//        TextFileEncoder textFileEncoderReverse = new TextFileEncoder(reverseTextEncoder);
//        TextFileEncoder textFileEncoderSwapCharacters = new TextFileEncoder(swapCharactersTextEncoder);
//
//        System.out.println("Apply Reverse on contents of "+FILENAME+":");
//        System.out.println("[Correcte output eerste regel: ?nerel neteom avaJ ruemmargorp ekle uoz moraaW]");
//        encryptedFileContents = textFileEncoderReverse.encodeTextFile(FILENAME);
//        encryptedFileContents.forEach(System.out::println);
//
//        System.out.println("Apply SwapCharacters on contents of "+FILENAME+":");
//        System.out.println("[Correcte output eerste regel: aWramoz uoe kl erpgoarmmue raJavm eoet neler?n]");
//        encryptedFileContents = textFileEncoderSwapCharacters.encodeTextFile(FILENAME);
//        encryptedFileContents.forEach(System.out::println);

//         OPGAVE e
//         create textencoder with rot13 and reversal combined
        TextEncoder textEncoderRot13reverse = new Rot13TextEncoderDecorator(new ReverseTextEncoderDecorator(new ConcreteTextEncoder()));
        TextFileEncoder textFileEncoderRot13reverse = new TextFileEncoder(textEncoderRot13reverse);
        
//        TextEncoder reverse = new ReverseTextEncoderDecorator(new ConcreteTextEncoder());
//        TextFileEncoder reverseFileEncoder = new TextFileEncoder(reverse);
//        TextEncoder rot13 = new Rot13TextEncoderDecorator(new ConcreteTextEncoder());
//        TextFileEncoder rot13FileEncoder = new TextFileEncoder(rot13);

        System.out.println("Apply ROT13 and reversal on contents of "+FILENAME+":");
        System.out.println("[Correcte output eerste regel: ?arery argrbz ninW ehrzznetbec rxyr hbm zbennJ]");
        encryptedFileContents = textFileEncoderRot13reverse.encodeTextFile(FILENAME);
        encryptedFileContents.forEach(System.out::println);

//        encryptedFileContents = reverseFileEncoder.encodeTextFile(FILENAME);
//        encryptedFileContents = rot13FileEncoder.encodeTextFile(FILENAME);
//        encryptedFileContents.forEach(System.out::println);
        
    }

}
