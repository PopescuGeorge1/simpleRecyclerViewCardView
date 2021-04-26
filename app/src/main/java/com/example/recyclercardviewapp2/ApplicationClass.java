package com.example.recyclercardviewapp2;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Game> games;

    @Override
    public void onCreate() {
        super.onCreate();

        games=new ArrayList<>();
        games.add(new Game("Devil May Cry", "2019", "Hack & Slash"));
        games.add(new Game("Doom", "2020", "Shooter"));
        games.add(new Game("Cabal Online", "2010", "MMORPG"));
    }
}
