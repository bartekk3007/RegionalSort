import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> nazwiska = new ArrayList<>();
        nazwiska.add("Żuk");
        nazwiska.add("Zając");
        nazwiska.add("Ćwik");
        nazwiska.add("Czarnecki");
        nazwiska.add("Łukasik");
        nazwiska.add("Latos");

        Collator polskiCollator = Collator.getInstance(Locale.getDefault());

        // Sortowanie listy nazwisk
        nazwiska.sort(polskiCollator);

        // Wyświetlenie posortowanej listy
        for (String nazwisko : nazwiska) {
            System.out.println(nazwisko);
        }
    }
}