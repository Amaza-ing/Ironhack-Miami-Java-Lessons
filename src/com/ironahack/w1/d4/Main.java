package com.ironahack.w1.d4;

public class Main {
    public static void main(String[] args) {

        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.2, 2);
//        Player player = new Player(0.3, 3); // we cannot create an instance of an abstract class

        System.out.println("Web Player volume: " + webPlayer.getVolume());
        webPlayer.close();
        applePlayer.close();
        applePlayer.play();
        System.out.println(applePlayer.getVolume());
        applePlayer.incraseVolume();
        System.out.println(applePlayer.getVolume());

        AndroidPlayer androidPlayer = new AndroidPlayer(0.7, 3);

        androidPlayer.play();
        System.out.println(androidPlayer.share());
    }
}
