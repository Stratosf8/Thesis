package com.stratos.syrostownhall;

import java.util.ArrayList;

public class Utils {
    private static ArrayList<Poi> pois;

    public static void initPois(){
        if (null == pois){
            pois = new ArrayList<>();
        }
        Poi statue = new Poi(1, "Vafiadaki's Statue", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "https://i.imgur.com/jEmcTp2.jpg");
        pois.add(statue);

        Poi painting = new Poi(2, "Refugee Painting", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "https://i.imgur.com/v54XwdP.jpg");
        pois.add(painting);

        Poi stairs = new Poi(3, "Stairs", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "https://i.imgur.com/2ahlzHa.jpg");
        pois.add(stairs);

        Poi court = new Poi(4, "Court", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "https://i.imgur.com/wR15VmO.jpg");
        pois.add(court);

        Poi outside = new Poi(5, "Outside", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "https://i.imgur.com/STREN3o.jpg");
        pois.add(outside);

        Poi back_stairs = new Poi(6, "Hidden Stairs", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "https://i.imgur.com/fewe83h.jpg");
        pois.add(back_stairs);

        Poi wall_details = new Poi(7, "Wall Details", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "https://i.imgur.com/tf7MyHN.jpg");
        pois.add(wall_details);

        Poi head_statue = new Poi(8, "Head Details", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "https://i.imgur.com/ktr0F18.jpg");
        pois.add(head_statue);
    }

    public static ArrayList<Poi> getPois() {return pois;}

}
