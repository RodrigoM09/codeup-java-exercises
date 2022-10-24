import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsLecture {
    public static void main(String[] args) {
        // ARRAYLISTS ARE CHANGEABLE WHEREAS ARRAYS ARE NOT.
        // USE ARRAYLISTS WHEN YOU KNOW THE ARRAY IS GOING TO BE CHANGED.
        ArrayList<Monster> monsterArrayList = new ArrayList<>();
        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19,225,23, "Blue Dragon");
        Monster frostGiant = new Monster(15, 138,25, "Frost Giant");
        Monster goblin = new Monster(15, 7, 5, "Goblin");
        Monster werewolf = new Monster(11, 58, 7, "Werewolf");
        //.ADD IS TO ADD TO THE ARRAY ONE AT A TIME.
        monsterArrayList.add(orc);
        monsterArrayList.add(ogre);
//        GIVES YOU SIZE OF THE ARRAY.
        System.out.println(monsterArrayList.size());
//        .GET() GIVES YOU THE ABILITY TO GET ARRAY PROPERTIES.
        System.out.println(monsterArrayList.get(0).getName());
        System.out.println(monsterArrayList);

//        HOW TO ADD MULTIPLE OBJECTS TO A NEW ARRAYLIST.
        List<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf));
//         ADD NEW ARRAYLIST TO OLD ARRAYLIST.....
        monsterArrayList.addAll(newMonsterList);

//        ADD OBJECTS TO AN EXISTING ARRAY AT ONCE
//        monsterArrayList.addAll(new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf)));
        System.out.println(monsterArrayList);
        System.out.println(); // JUST PUT THIS HERE FOR SPACING
//        AT THIS POINT THE newMonsterList AND THE monsterArrayList EXIST.
//        TO DESTROY THE newMonsterArray YOU CAN SET THE VARIABLE NAME TO "NULL" OR TO THE ORIGINAL LIST NAME.
        newMonsterList = monsterArrayList;
        System.out.println(newMonsterList);
        System.out.println(); // JUST PUT THIS HERE FOR SPACING
//        LOOPING OVER ARRAYLISTS
//        TRADITIONAL FOR LOOP, GIVES YOU ACCESS TO THE INDEX
        for(int i = 0; i < monsterArrayList.size(); i++){
            if(i == monsterArrayList.size() -1){
                System.out.printf("%s%n",monsterArrayList.get(i));
            }else {
                System.out.printf("%s ", monsterArrayList.get(i));
            }
        }
        System.out.println(); // JUST PUT THIS HERE FOR SPACING
//        ENHANCED FOR LOOP
//        SIMPLER SYNTAX BUT NO ACCESS TO THE INDEX....
        for(Monster monster : monsterArrayList){
            System.out.println(monster);
        }
//      WHEN CREATING AN ARRAYLIST OF PRIMITIVE DATA TYPES, USE THE CORRESPONDING OBJECT WRAPPER.
//      ARRAYLISTS CAN ONLY CONTAIN OBJECTS
//      .SORT WILL SORT NUMBERS FROM LEAST TO GREATEST
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(1,7,9,3,-7,-3));
        System.out.println(myNumbers);
//        COLLECTIONS.SORT TO SORT ARRAYLISTS THAT CONTAIN NUMBERS OR STRINGS
//        THEY WILL BE SORTED IN ASCENDING ORDER......
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
//      .SORT WILL SORT STRINGS ALPHABETICALLY
        ArrayList<String> randomWords = new ArrayList<>(List.of("Version", "Suntan", "Bond", "Defeat", "Later", "Rate"));
        System.out.println(randomWords);
        Collections.sort(randomWords);

//        THE LIST INTERFACE CONTAINS A DEFAULT METHOD CALLED .SORT()
//        SO YOU CAN CALL .SORT ON ANY ARRAYLIST. IT TAKES A COMPARATOR AS ITS ARGUMENT
//        YOU CAN PASS IT COLLECTIONS.REVERSE ORDER TO SORT AN ARRAYLIST OF STRINGS
//        OR NUMBERS IN REVERSE.....
        System.out.println(randomWords);
//      TO SORT MONSTER ARRAY BY PROPERTIES......
        monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints));
        System.out.println(monsterArrayList);



//      TO USE THE COMPARE METHOD THAT WE WROTE IN THE MONSTER CLASS
        monsterArrayList.sort(new Monster());
        System.out.println(monsterArrayList);
    } //END OF MAIN METHOD
} //END OF THE COLLECTIONS-LECTURE CLASS
