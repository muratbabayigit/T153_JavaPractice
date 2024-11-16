package day05;

import java.util.ArrayList;

public class P08_arrayList {
    public static void main(String[] args) {
        /*
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani(2.index) ile 8. elemaninin (7.index)
         * yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan", "Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal",
         * "Ahmet","Ali"};
         */

        String[] isimler = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < isimler.length; i++) {
            names.add(isimler[i]);
        }
        System.out.println(names);
        String yedek = names.get(2);

        names.set(2, names.get(7));
        names.set(7,yedek);
        System.out.println(names);

    }
}
