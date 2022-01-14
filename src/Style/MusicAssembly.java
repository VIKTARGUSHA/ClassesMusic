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
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MusicAssembly {
 public static void main(String[] args) {
  ArrayList<SomeSong> assembly = new ArrayList<>();
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
  Iterator<SomeSong> newIterator = assembly.iterator();
  while (newIterator.hasNext()) {
   String[] dur = newIterator.next().getDuration().split(":");
   numberOfSeconds += Integer.parseInt(dur[0]) * 60 + Integer.parseInt(dur[1]);
  }
  StringBuilder stb = new StringBuilder();
  stb.append(String.valueOf(numberOfSeconds / 60));
  stb.append(":");
  stb.append(String.valueOf((numberOfSeconds % 60)));
  totalDuration = String.valueOf(stb);
  System.out.println(totalDuration);
  Collections.sort(assembly, Comparator.comparing(SomeSong::getStyle));
  System.out.println(assembly);
  ArrayList<SomeSong> songWithDefineDuration = new ArrayList<>();
  String requiredDuration = "3:48";
  Iterator<SomeSong> secondIterator = assembly.iterator();
  while (secondIterator.hasNext()) {
   SomeSong thisSong = secondIterator.next();
   String[] durTwo = thisSong.getDuration().split(":");
   String[] recDur = requiredDuration.split(":");
 if ((Integer.parseInt(durTwo[0])*60 + Integer.parseInt(durTwo[1])) < (Integer.parseInt(recDur[0])*60 + Integer.parseInt(recDur[1]))){

  songWithDefineDuration.add(thisSong);
 }
  }
  System.out.println(songWithDefineDuration);
 }
}
