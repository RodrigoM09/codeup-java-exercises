public class Fighter {
    // Instance variables
    private String name;
    public void setName(String name){
        this.name = name;
    }
    //GETTER SET TO PUBLIC
    public String getName(){
        return name;
    }


    private int hitPoints;
    //THIS IS A SETTER SET TO PUBLIC
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    //GETTER SET TO PUBLIC
    public int getHitPoints(){
        return hitPoints;
    }


    private int maxDamage;
    public void setMaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage(){
        return maxDamage;
    }


    //Instance methods
    public void printStats() {
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }
        public void battleRoar() {
            System.out.printf("I am %s and I will destroy you%n", name);
        }
            public int attackRoll(){
                return D20.rolld20();
        }
    // Constructor with no argument
        public Fighter(){

         }
    }
