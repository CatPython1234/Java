class Java_CoffeeMachine {
    public  int water;
    public  int coffee;
    public  int milk;
    public  int sugar;

    void makeCoffee(int waterAmout, int coffeeAmout, int milkAmout, int sugarAmout){
    }
    void fillWater(int amout){
    }
    void fillCoffee(int amout){
    }
    void fillMilk(int amout){
    }
    void fillSugar(int amout){
    }
    void displayIngredients(){

    }

    public static void main(String[] args) {
        Java_CoffeeMachine machine = new Java_CoffeeMachine();

        machine.fillWater(500);
        machine.fillCoffee(200);
        machine.fillMilk(300);
        machine.fillSugar(100);

        machine.displayIngredients();
        System.out.println("Water: 500, Coffee: 200, Milk: 300, Sugar: 100");
        machine.makeCoffee(100, 50, 50, 20);
        System.out.println("Кофе готов! Приятного аппетита!");
        machine.displayIngredients();
        System.out.println("Water: 400, Coffee: 150, Milk: 250, Sugar: 80");
        machine.makeCoffee(1000, 200, 200, 100);
        System.out.println("Не хватает ингредиентов. Пожалуйста, выберите другой напиток!");
        machine.displayIngredients();
        System.out.println("Water: 400, Coffee: 150, Milk: 250, Sugar: 80");
    }
}
