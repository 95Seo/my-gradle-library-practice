package util;

public class STool {

    public static String arrayConverter(String str) {
        return str.replaceAll("\\[", "{").replaceAll("\\]", "}");
    }
}
