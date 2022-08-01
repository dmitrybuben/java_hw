package sem5hw;

import java.util.*;

public class Music {
    public static void main(String[] args) {
        String r = "Rock";
        String p = "Pop";
        String d = "Dance";
        String e = "Electro";

        List<String> rSongs = new ArrayList<>();
        rSongs.add("Don't cry");
        rSongs.add("Poison");
        rSongs.add("The Look");
        rSongs.add("Supergirl");
        rSongs.add("Maria");
        rSongs.add("Pretending");
        rSongs.add("We will rock you");
        rSongs.add("After Dark");
        rSongs.add("Dreamer");
        rSongs.add("One of us");

        List<String> pSongs = new ArrayList<>();
        pSongs.add("Happy");
        pSongs.add("Perfect");
        pSongs.add("Believer");
        pSongs.add("California");
        pSongs.add("Human");
        pSongs.add("Thunder");
        pSongs.add("Physical");
        pSongs.add("Chandelier");
        pSongs.add("You");
        pSongs.add("Venus");

        List<String> dSongs = new ArrayList<>();
        dSongs.add("Ordinary Life");
        dSongs.add("Up");
        dSongs.add("Big");
        dSongs.add("Addicted");
        dSongs.add("Someone");
        dSongs.add("Baby");
        dSongs.add("No Fun");
        dSongs.add("Friday");
        dSongs.add("Redlight");
        dSongs.add("I Can't Stop");

        List<String> eSongs = new ArrayList<>();
        eSongs.add("Scopin");
        eSongs.add("Dopamin");
        eSongs.add("Marea");
        eSongs.add("The Distance");
        eSongs.add("Streetside");
        eSongs.add("Take a ride");
        eSongs.add("The Distance");
        eSongs.add("Rest");
        eSongs.add("Hungry");
        eSongs.add("Renegade");

        FillSubMap(r,rSongs);
        FillSubMap(p,pSongs);
        FillSubMap(d,dSongs);
        FillSubMap(e,eSongs);
    }

    public static void FillSubMap (String str, List<String>songs) {
        Map<String, Map<String, Integer>> base = new HashMap<>();
        Map<String, Integer> singles = new HashMap<>();
        for (int i = 0; i < songs.size(); i++) {
            singles.put(songs.get(i), (int) (Math.random() * 100) + 1);
            base.put(str, singles);
        }
        System.out.println(base);
        }
    }
