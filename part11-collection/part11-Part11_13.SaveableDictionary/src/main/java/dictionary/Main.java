package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");

dictionary.load();
System.out.println(dictionary.translate("apina"));
System.out.println(dictionary.translate("monkey"));
System.out.println(dictionary.translate("below"));
System.out.println(dictionary.translate("olut"));
System.out.println(dictionary.translate("beer"));
    }
}
