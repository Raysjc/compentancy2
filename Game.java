public class Game{

    public static void main(String args[])
    {
        System.out.println("**********Welcome to my Video Game**********");

        Character mario  = new Character("Mario (M)", 2, 100, 50, 5);

        Character browser = new Character("Browser (B)", 2, 100,50,10);


        mario.printCharacter();
        browser.printCharacter();
        //round 1
        browser.attack(mario);
        mario.attack(browser);
        browser.attack(mario);
        // round 2
        mario.attack(browser);
        browser.attack(mario);
        mario.attack(browser);
        // round 3 
        browser.attack(mario);
        mario.attack(browser);
        browser.attack(mario);
    }
}