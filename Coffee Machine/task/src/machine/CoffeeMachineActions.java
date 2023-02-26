package machine;

import java.util.Scanner;

public class CoffeeMachineActions {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);
        selectAction(coffeeMachine);
        input.close();
    }

    public static void coffeeMachineHas(CoffeeMachine coffeeMachine) {
        System.out.println("");
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachine.getWater() + " ml of water");
        System.out.println(coffeeMachine.getMilk() + " ml of milk");
        System.out.println(coffeeMachine.getBeans() + " g of coffee beans");
        System.out.println(coffeeMachine.getDisposableCups() + " disposable cups");
        System.out.println("$" + coffeeMachine.getMoney() + " of money");
    }

    public static String askAction() {
        System.out.println("");
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = input.nextLine();
        return action;
    }

    public static void selectAction(CoffeeMachine coffeeMachine) {
        while (true) {
            String action = askAction();
            switch (action) {
                case "buy":
                    makeTheCoffee(coffeeMachine);
                    break;
                case "fill":
                    refillTheMachine(coffeeMachine);
                    break;
                case "take":
                    cashOut(coffeeMachine);
                    break;
                case "remaining":
                    coffeeMachineHas(coffeeMachine);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    public static void makeEspresso(CoffeeMachine coffeeMachine) {
        if (coffeeMachine.getWater() >= 250 && coffeeMachine.getBeans() >= 16 && coffeeMachine.getDisposableCups() >= 1) {
            coffeeMachine.setWater(coffeeMachine.getWater() - 250);
            coffeeMachine.setBeans(coffeeMachine.getBeans() - 16);
            coffeeMachine.setDisposableCups(coffeeMachine.getDisposableCups() - 1);
            coffeeMachine.setMoney(coffeeMachine.getMoney() + 4);
            System.out.println("I have enough resources, making you a coffee!");
        } else if (coffeeMachine.getWater() < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeMachine.getBeans() < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (coffeeMachine.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough coffee cups!");
        } else {
            System.out.println("Error");
        }
    }

    public static void makeLatte(CoffeeMachine coffeeMachine) {
        if (coffeeMachine.getWater() >= 350 && coffeeMachine.getMilk() >= 75 && coffeeMachine.getBeans() >= 20 && coffeeMachine.getDisposableCups() >= 1) {
            coffeeMachine.setWater(coffeeMachine.getWater() - 350);
            coffeeMachine.setMilk(coffeeMachine.getMilk() - 75);
            coffeeMachine.setBeans(coffeeMachine.getBeans() - 20);
            coffeeMachine.setDisposableCups(coffeeMachine.getDisposableCups() - 1);
            coffeeMachine.setMoney(coffeeMachine.getMoney() + 7);
            System.out.println("I have enough resources, making you a coffee!");
        } else if (coffeeMachine.getWater() < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeMachine.getMilk() < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeMachine.getBeans() < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (coffeeMachine.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough coffee cups!");
        } else {
            System.out.println("Error");
        }
    }

    public static void makeCappuccino(CoffeeMachine coffeeMachine) {
        if (coffeeMachine.getWater() >= 200 && coffeeMachine.getMilk() >= 100 && coffeeMachine.getBeans() >= 12 && coffeeMachine.getDisposableCups() >= 1) {
            coffeeMachine.setWater(coffeeMachine.getWater() - 200);
            coffeeMachine.setMilk(coffeeMachine.getMilk() - 100);
            coffeeMachine.setBeans(coffeeMachine.getBeans() - 12);
            coffeeMachine.setDisposableCups(coffeeMachine.getDisposableCups() - 1);
            coffeeMachine.setMoney(coffeeMachine.getMoney() + 6);
            System.out.println("I have enough resources, making you a coffee!");
        } else if (coffeeMachine.getWater() < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeMachine.getMilk() < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeMachine.getBeans() < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (coffeeMachine.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough coffee cups!");
        } else {
            System.out.println("Error");
        }
    }


    public static void refillTheMachine(CoffeeMachine coffeeMachine) {
        System.out.println("");
        System.out.println("Write how many ml of water you want to add:");
        coffeeMachine.setWater(coffeeMachine.getWater() + input.nextInt());
        System.out.println("Write how many ml of milk you want to add:");
        coffeeMachine.setMilk(coffeeMachine.getMilk() + input.nextInt());
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeMachine.setBeans(coffeeMachine.getBeans() + input.nextInt());
        System.out.println("Write how many disposable cups you want to add:");
        coffeeMachine.setDisposableCups(coffeeMachine.getDisposableCups() + input.nextInt());
    }

    public static void cashOut(CoffeeMachine coffeeMachine) {
        System.out.println("");
        System.out.println("I gave you $" + coffeeMachine.getMoney());
        coffeeMachine.setMoney(0);
    }

    private static void makeTheCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("");
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String type = input.nextLine();
        switch (type) {
            case "1":
                makeEspresso(coffeeMachine);
                break;
            case "2":
                makeLatte(coffeeMachine);
                break;
            case "3":
                makeCappuccino(coffeeMachine);
                break;
            case "back":
                return;
            default:
                System.out.println("Unknown command");
        }
    }
}
