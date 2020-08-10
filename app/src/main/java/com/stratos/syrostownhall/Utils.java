package com.stratos.syrostownhall;

import java.util.ArrayList;

public class Utils {
    private static ArrayList<Poi> pois;

    public static void initPois(){
        if (null == pois){
            pois = new ArrayList<>();
        }
        Poi statue = new Poi(1, "Vafiadaki's Statue", "Lorem Ipsum",
                "The definition of a push-up is an exercise done laying with face, palms and toes facing down, keeping legs and back straight, extending arms straight to push body up and back down again. An example of a push-up is a great exercise that works the chest, shoulder and arm muscles.",
                "https://i.imgur.com/IyczX6L.jpg");
        pois.add(statue);

        Poi painting = new Poi(2, "Refugee Painting", "Lorem Ipsum",
                "A squat is a strength exercise in which the trainee lowers their hips from a standing position and then stands back up. During the descent of a squat, the hip and knee joints flex while the ankle joint dorsiflexes; conversely the hip and knee joints extend and the ankle joint plantarflexes when standing up.",
                "https://i.imgur.com/v54XwdP.jpg");
        pois.add(painting);

        Poi stairs = new Poi(3, "Stairs", "Lorem Ipsum",
                "The leg press is a weight training exercise in which the individual pushes a weight or resistance away from them using their legs. The term leg press also refers to the apparatus used to perform this exercise. The leg press can be used to evaluate an athlete's overall lower body strength (from knee joint to hip).",
                "https://i.imgur.com/JyErqlK.jpg");
        pois.add(stairs);

        Poi court = new Poi(4, "Court", "Lorem Ipsum",
                "Your pectoral muscles are one of the largest muscle groups in your upper body. They pull on the humerus (upper arm bone), allowing you to make vertical, horizontal, and rotational movements with your arms. You use these muscles all day, every day, so it's important to keep them strong.",
                "https://i.imgur.com/F1PqB0L.jpg");
        pois.add(court);

        Poi outside = new Poi(5, "Outside", "Lorem Ipsum",
                "A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands and pulls up. As this happens, the elbows flex and the shoulders adduct and extend to bring the elbows to the torso.",
                "https://i.imgur.com/STREN3o.jpg");
        pois.add(outside);

        Poi back_stairs = new Poi(6, "Hidden Stairs", "Lorem Ipsum",
                "A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands and pulls up. As this happens, the elbows flex and the shoulders adduct and extend to bring the elbows to the torso.",
                "https://i.imgur.com/fewe83h.jpg");
        pois.add(back_stairs);

        Poi wall_details = new Poi(7, "Wall Details", "Lorem Ipsum",
                "A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands and pulls up. As this happens, the elbows flex and the shoulders adduct and extend to bring the elbows to the torso.",
                "https://i.imgur.com/tf7MyHN.jpg");
        pois.add(wall_details);

        Poi head_statue = new Poi(8, "Head Details", "Lorem Ipsum",
                "A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands and pulls up. As this happens, the elbows flex and the shoulders adduct and extend to bring the elbows to the torso.",
                "https://i.imgur.com/ktr0F18.jpg");
        pois.add(head_statue);
    }

    public static ArrayList<Poi> getPois() {return pois;}

}
