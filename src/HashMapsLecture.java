import java.util.*;

import static java.util.Map.entry;

public class HashMapsLecture {
    public static void main(String[] args) {
//        IN A HASHMAP EVERY KEY MUST BE UNIQUE.......
//        SAME VALUE CAN BE USED BUT NOT THE KEY.....
        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19,225,23, "Blue Dragon");
        Monster frostGiant = new Monster(15, 138,25, "Frost Giant");
        Monster goblin = new Monster(15, 7, 5, "Goblin");
        Monster werewolf = new Monster(11, 58, 7, "Werewolf");
        Monster orcWarChief = new Monster(16,93,15, "Orc War Chief");


//      ADD A KEY-VALUE PAIR TO THE HASHMAP USING .PUT()
        HashMap<String, Monster> monsterHashMap = new HashMap<>();
        monsterHashMap.put("orc", orc);

//      Access a value in the hashmap using .get() with key
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

//        REPLACE A VALUE IN THE HASHMAP USING .REPLACE()
//      monsterHashMap.replace("orc",orcWarChief);
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc"));

//        TO ADD MULTIPLE OBJECTS TO A HASHMAP AT ONCE, USE MAP.OF-ENTRIES
        Map<String, Monster> intermediateMap = Map.ofEntries(
                entry("blue dragon", blueDragon),
                entry("ogre", ogre),
                entry("werewolf", werewolf),
                entry("frost giant", frostGiant),
                entry("goblin", goblin),
                entry("orc war chief", orcWarChief)
        );
        monsterHashMap.putAll(intermediateMap);

        System.out.println(monsterHashMap.get("frost giant"));
        System.out.println(monsterHashMap.get("werewolf"));



//      TO CREATE A LIST OF SPECIFIC PROPERTIES IN THE OBJECTS STORED AS HASHMAP VALUES, WE CAN USE .KEYSET().STREAM().TOLIST()
        List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());
//      ONCE YOU HAVE A LIST, YOU CAN SORT IT OR DO ANYTHING ELSE TO IT.....
        Collections.sort(monsterNames);
        System.out.println(monsterNames);

//      FIRST WAY TO LOOP OVER A HASHMAP......
//      EACH ENTRY IS REPRESENTED BY
        System.out.println("LOOPING USING ENTRY-SET:");
        for(Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
            Monster monster = monsterEntry.getValue();
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n",
                    monster, monster.getHitPoints(),monster.getArmorClass(), monster.getDamage());
        }

//      THE STRINGS GENERATED FROM THE KEY SET ARE THE KEYS TO THE HASHMAP, LOOPING OVER THE LIST ALLOWS YOU TO ACCESS ALL HASHMAP ENTRIES
        System.out.println("LOOPING USING NAMES");
        for(String monsterName : monsterNames){
            Monster monster = monsterHashMap.get(monsterName);
            System.out.printf(" The %s has %d hit points, an armor class of %d, and does %d damage.%n",
                    monster, monster.getHitPoints(),monster.getArmorClass(), monster.getDamage());
        }

//        THIRD WAY TO LOOP......
        System.out.println("FOREACH LOOP:");
        monsterHashMap.forEach((key, monster) -> {
            System.out.printf(" The %s has %d hit points, an armor class of %d, and does %d damage.%n",
                    monster, monster.getHitPoints(),monster.getArmorClass(), monster.getDamage());
        });

//        CONVERTING TO TREEMAP, SORTING BY KEY
        System.out.println("FOR EACH OVER TREEMAP");
        Map<String, Monster> monsterTreeMap = new TreeMap<>(monsterHashMap);
        monsterTreeMap.forEach((key, monster) -> {
            System.out.printf(" The %s has %d hit points, an armor class of %d, and does %d damage.%n",
                    monster, monster.getHitPoints(),monster.getArmorClass(), monster.getDamage());
        });




    }// END OF MAIN METHOD
}//END OF CLASS
