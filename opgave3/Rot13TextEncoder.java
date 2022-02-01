package opgave3;

public class Rot13TextEncoder implements TextEncoder {

    /*
    Rot13, voor 13 plaatsen roteren, minder bekend onder de naam Caesaralfabet, is een eenvoudig
    encryptiealgoritme. Het behoort tot de Caesarrotaties, waarbij een alfabet wordt gebruikt
    dat een aantal plaatsen is verschoven.
    Elke letter schuift dertien plaatsen in het alfabet op, en gaat bij de Z weer terug naar de A.

    letter in:  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    letter uit: N O P Q R S T U V W X Y Z A B C D E F G H I J K L M

    Alle overige tekens blijven ongewijzigd.
     */

    @Override
    public String encode(String text) {
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
