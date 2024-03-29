import java.util.HashMap;
import java.util.Map;

public class Frekans {
    public static void main(String[] args) {
        int[] dizi = {2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 16, 17, 18, 18};

        // Her elemanın frekansını saklamak için bir HashMap oluşturulur
        Map<Integer, Integer> frekanslar = new HashMap<>();

        // Dizi üzerinde dolaşarak frekansları hesapla
        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                // Eğer eleman zaten haritada varsa, frekansını artır
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);
            } else {
                // Eğer eleman haritada yoksa, frekansını 1 olarak ayarla
                frekanslar.put(eleman, 1);
            }
        }

        // Frekansları ekrana yazdır
        System.out.println("Dizideki elemanların frekansları:");
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kez tekrar edildi.");
        }
    }
}
