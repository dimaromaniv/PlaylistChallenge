package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;



public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }


    public Integer selection(Integer startIndex, String selection) {

        ArrayList<String> listPlayList = new ArrayList(Arrays.asList(playList));
        int counterForvard = 0;
        int counterRevers  = 0;
        int currentIndex = startIndex;

       while (!playList[currentIndex].contains(selection)) {
           counterForvard++;
           currentIndex = (currentIndex + 1 ) % playList.length;
        }
       currentIndex = startIndex;
        while (!playList[currentIndex].contains(selection)) {
           counterRevers++;
           currentIndex = (currentIndex - 1 + playList.length ) % playList.length;
       }

            return Math.min(counterForvard,counterRevers);
    }
}
