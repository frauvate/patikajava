import java.util.HashMap;
import java.util.Map;

public class RepeatingNum {
    public static void main(String[] args) {
        int[] dizi = {2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 16, 17, 18, 18};

        Map<Integer, Integer> tekrarEdenSayilar = new HashMap<>();

        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                if (tekrarEdenSayilar.containsKey(sayi)) {
                    tekrarEdenSayilar.put(sayi, tekrarEdenSayilar.get(sayi) + 1);
                } else {
                    tekrarEdenSayilar.put(sayi, 1);
                }
            }
        }

        System.out.println("Dizideki tekrar eden çift sayılar:");
        for (Map.Entry<Integer, Integer> entry : tekrarEdenSayilar.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " kez tekrar edildi.");
            }
        }
    }
}
