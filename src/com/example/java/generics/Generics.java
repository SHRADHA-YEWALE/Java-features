package com.example.java.generics;

import com.example.java.generics.model.BaseballPlayer;
import com.example.java.generics.model.FootballPlayer;
import com.example.java.generics.model.SockerPlayer;
import com.example.java.generics.model.Team;

public class Generics {
    public static void main(String args[]) {

        Team<FootballPlayer> starKins = new Team<>("StarKins");
        FootballPlayer fb = new FootballPlayer("FB");
        starKins.addPlayer(fb);

        Team<FootballPlayer> wideWings = new Team<>("wideWings");
        FootballPlayer ob = new FootballPlayer("OB");
        wideWings.addPlayer(ob);


        Team<BaseballPlayer> baseBallTeam = new Team<>("Chicago cubs");
        BaseballPlayer bb = new BaseballPlayer("BB");
        baseBallTeam.addPlayer(bb);

        Team<SockerPlayer> sockerPlayerTeam = new Team<>("socker challegers");
        SockerPlayer   sc = new SockerPlayer("SC");
        sockerPlayerTeam.addPlayer(sc);

        //NOTE: We cannot add primitive data types in case of generics we can only add object types.
        // In our case it will only accept any calss of type Player or the class extends Player class.

        starKins.matchResult(wideWings, 2, 1);
        System.out.println("Rankings");
        System.out.println(starKins.getName() + " : " + starKins.ranking());
        System.out.println(wideWings.getName() + " : " + wideWings.ranking());

        // We can use compareTo() too.
        System.out.println(starKins.compareTo(wideWings));
    }


}
