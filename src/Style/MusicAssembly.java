package Style;

import Style.Pop.ABBA;
import Style.Pop.Beyonce;
import Style.Pop.LadyGaga;
import Style.Rock.ACDC;
import Style.Rock.Metallica;
import Style.Rock.Prodigy;
import Style.Russian.DDT;
import Style.Russian.Leningrad;
import Style.Russian.Morgenshtern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MusicAssembly {
    public static void main(String[] args) {
       ArrayList<Style> assembly = new ArrayList<>();
        String totalDuration;
        int numberOfSeconds = 0;
        ABBA abba = new ABBA();
        assembly.add(abba);
        Beyonce beyonce = new Beyonce();
        assembly.add(beyonce);
        LadyGaga ladyGaga = new LadyGaga();
        assembly.add(ladyGaga);
        ACDC acdc = new ACDC();
        assembly.add(acdc);
        Metallica metallica = new Metallica();
        assembly.add(metallica);
        Prodigy prodigy = new Prodigy();
        assembly.add(prodigy);
        DDT ddt = new DDT();
        assembly.add(ddt);
        Leningrad leningrad = new Leningrad();
        assembly.add(leningrad);
        Morgenshtern morgenshtern = new Morgenshtern();
        assembly.add(morgenshtern);
        Iterator<Style> newIterator = assembly.iterator();
        while (newIterator.hasNext()) {
            String[] dur = newIterator.next().getDuration().split(":");
            numberOfSeconds += Integer.parseInt(dur[0]) * 60 + Integer.parseInt(dur[1]);
        }
        StringBuilder stb = new StringBuilder();
        stb.append(String.valueOf(numberOfSeconds/60));
        stb.append(":");
        stb.append(String.valueOf((numberOfSeconds%60)));
        totalDuration = String.valueOf(stb);
        System.out.println(totalDuration);
        }
    }

