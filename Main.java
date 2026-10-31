import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        int animalChoice;
        int menuChoice;
        int continueChoice;

        do {
            System.out.println("\n****** ZOO ANIMAL choice menu ******");
            System.out.println("1. Tiger");
            System.out.println("2. Dolphin");
            System.out.println("3. Penguin");
            System.out.print("Enter choice of animal (1-3): ");

            animalChoice = keyboard.nextInt();

            switch (animalChoice) {

                case 1:
                    System.out.println("The animal which is chosen is: "
                            + tigerObject.getNameOfAnimal());

                    do {
                        System.out.println("\n****** ANIMAL details menu for: Tiger ******");
                        System.out.println("1. Set properties");
                        System.out.println("2. Display properties");
                        System.out.println("3. Display movement");
                        System.out.println("4. Display eating");
                        System.out.print("Enter choice (1-4): ");

                        menuChoice = keyboard.nextInt();

                        switch (menuChoice) {

                            case 1:
                                System.out.print("Enter age: ");
                                tigerObject.setAge(keyboard.nextInt());

                                System.out.print("Enter height: ");
                                tigerObject.setHeight(keyboard.nextInt());

                                System.out.print("Enter weight: ");
                                tigerObject.setWeight(keyboard.nextInt());

                                System.out.print("Enter number of stripes: ");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());

                                System.out.print("Enter speed: ");
                                tigerObject.setSpeed(keyboard.nextInt());

                                System.out.print("Enter sound level of roar: ");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Age: " + tigerObject.getAge());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Number of stripes: "
                                        + tigerObject.getNumberOfStripes());
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Sound level of roar: "
                                        + tigerObject.getSoundLevelOfRoar());
                                break;

                            case 3:
                                tigerObject.walking();
                                break;

                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.print("Continue with this animal? (1 for yes / 2 for no): ");
                        continueChoice = keyboard.nextInt();

                    } while (continueChoice == 1);
                    break;

                case 2:
                    System.out.println("The animal which is chosen is: "
                            + dolphinObject.getNameOfAnimal());

                    do {
                        System.out.println("\n****** ANIMAL details menu for: Dolphin ******");
                        System.out.println("1. Set properties");
                        System.out.println("2. Display properties");
                        System.out.println("3. Display movement");
                        System.out.println("4. Display eating");
                        System.out.print("Enter choice (1-4): ");

                        menuChoice = keyboard.nextInt();

                        switch (menuChoice) {

                            case 1:
                                System.out.print("Enter age: ");
                                dolphinObject.setAge(keyboard.nextInt());

                                System.out.print("Enter height: ");
                                dolphinObject.setHeight(keyboard.nextInt());

                                System.out.print("Enter weight: ");
                                dolphinObject.setWeight(keyboard.nextInt());

                                System.out.print("Enter color: ");
                                dolphinObject.setColor(keyboard.next());

                                System.out.print("Enter swimming speed: ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                System.out.println("Color: " + dolphinObject.getColor());
                                System.out.println("Swimming speed: "
                                        + dolphinObject.getSwimmingSpeed());
                                break;

                            case 3:
                                dolphinObject.swimming();
                                break;

                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.print("Continue with this animal? (1 for yes / 2 for no): ");
                        continueChoice = keyboard.nextInt();

                    } while (continueChoice == 1);
                    break;

                case 3:
                    System.out.println("The animal which is chosen is: "
                            + penguinObject.getNameOfAnimal());

                    do {
                        System.out.println("\n****** ANIMAL details menu for: Penguin ******");
                        System.out.println("1. Set properties");
                        System.out.println("2. Display properties");
                        System.out.println("3. Display movement");
                        System.out.println("4. Display eating");
                        System.out.print("Enter choice (1-4): ");

                        menuChoice = keyboard.nextInt();

                        switch (menuChoice) {

                            case 1:
                                System.out.print("Enter age: ");
                                penguinObject.setAge(keyboard.nextInt());

                                System.out.print("Enter height: ");
                                penguinObject.setHeight(keyboard.nextInt());

                                System.out.print("Enter weight: ");
                                penguinObject.setWeight(keyboard.nextInt());

                                System.out.print("Is the penguin swimming? (true/false): ");
                                penguinObject.setIsSwimming(keyboard.nextBoolean());

                                System.out.print("Enter walk speed: ");
                                penguinObject.setWalkSpeed(keyboard.nextInt());

                                System.out.print("Enter swim speed: ");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Age: " + penguinObject.getAge());
                                System.out.println("Height: " + penguinObject.getHeight());
                                System.out.println("Weight: " + penguinObject.getWeight());

                                if (penguinObject.getIsSwimming()) {
                                    System.out.println("The penguin is swimming.");
                                } else {
                                    System.out.println("The penguin is walking.");
                                }

                                System.out.println("Walk speed: "
                                        + penguinObject.getWalkSpeed());

                                System.out.println("Swim speed: "
                                        + penguinObject.getSwimSpeed());
                                break;

                            case 3:
                                if (penguinObject.getIsSwimming()) {
                                    penguinObject.swimming();
                                } else {
                                    penguinObject.walking();
                                }
                                break;

                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        System.out.print("Continue with this animal? (1 for yes / 2 for no): ");
                        continueChoice = keyboard.nextInt();

                    } while (continueChoice == 1);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Return to main menu? (1 for yes / 2 for no): ");
            continueChoice = keyboard.nextInt();

        } while (continueChoice == 1);

        keyboard.close();
    }
}