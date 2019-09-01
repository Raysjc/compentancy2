public class Character {
    //attributes

    private int lifePoints;
    private int health;
    private int attackPoints;
    private int bonusPoints;
    public String name;

    public void setLifePoints(int lifePoints){
        this.lifePoints = lifePoints;
    }

    public int getLifePoints(){
        return lifePoints;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setAttackPoints(int attackPoints){
        this.attackPoints = attackPoints;
    }

    public int getAttackPoints(){
        return attackPoints;
    }

    public void setBonusPoints(int bonusPoints){
        this.bonusPoints = bonusPoints;
    }

    public int getBonusPoints(){
        return bonusPoints;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void printCharacter(){
        System.out.println(name + "\nLife Points: " + lifePoints + "\nHealth: " + health + "\nAttack points: " + attackPoints);
    }

    public Character(String name, int lifePoints, int health, int attackPoints, int bonusPoints){
        this.name = name;
        this.lifePoints = lifePoints;
        this.health = health;
        this.attackPoints = attackPoints;
        this.bonusPoints = bonusPoints;
    }

    public void attack(Character opponent){

        int opponentHealth = opponent.getHealth();
        int attackP = getAttackPoints();

        System.out.println(name + " is attacking..." + opponent.getName());

        int newHealth = opponent.getHealth() - getAttackPoints();
        opponent.setHealth(newHealth);

          opponent.printCharacter();

        if(opponent.getHealth() <= 0){
            int newLifePoints = opponent.getLifePoints() - (1);
            opponent.setLifePoints(newLifePoints);
            opponent.setHealth(100);
            setHealth(100);
            System.out.println(name + " killed..." + opponent.getName());
            opponent.printCharacter();
            printCharacter();
        }

        if(opponent.getLifePoints() + getLifePoints() == 2){
            System.out.println("Last Round....\nFIGHT!");
        }

        if(opponent.getLifePoints() <= 0 ){
            System.out.println(name + " Has DEAFETED " + opponent.getName());
        }


        }



    }


