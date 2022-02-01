package opgave3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileEncoder {

    private TextEncoder textEncoder;

    /**
     * Constructor
     *
     * @param textEncoder Concrete instance of TextEncoder containing encoding-logic
     */
    public TextFileEncoder(TextEncoder textEncoder) {
        this.textEncoder = textEncoder;
    }

    /**
     * Encodes contents (lines) of a textfile
     *
     * @param filename Name of file to read and encode contents from
     * @return List of encoded lines
     * @throws IOException
     */
    public List<String> encodeTextFile(String filename) throws IOException {
        List<String> encryptedFileContents = new ArrayList<>();
        try (BufferedReader bf=new BufferedReader(new FileReader(filename))) {
            String line;
            while((line=bf.readLine())!=null) {
                // OPGAVE a            	
                encryptedFileContents.add(this.textEncoder.encode(line));
            }
        }
        return encryptedFileContents;
    }
}
