public class Alphabet {

    public static void main(String[] args) {
        String text=" alphabet ";
        System.out.println(alpha(text));

    }
    public static String alpha(String text){
        String textStrip=text.strip();
        int tIndex=textStrip.indexOf("t");
        return textStrip.substring(0,tIndex).concat(textStrip.substring(tIndex).toUpperCase());
    }
}
