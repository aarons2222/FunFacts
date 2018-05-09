package it.flatwhite.funfacts;


import java.util.Random;

 class FactBook {
    //fields or Member variables

    String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
    "A duck's quack doesn't echo, and no one knows why.",
    "A crocodile can't stick it's tongue out.",
    "A shrimp's heart is in it's head.",
    "Rats and horses can't vomit.",
    "If you try to suppress a sneeze, you can rupture a blood vessel in your head or neck and die.",
    "Like fingerprints, everyone's tongue print is different."};
    //methods





    public String getFact(){
        //randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
