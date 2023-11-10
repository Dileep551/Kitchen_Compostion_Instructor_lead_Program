public class SmartKitchen {

    private CoffeeMaker brewMaster;

    private Dishwasher dishWasher;

    private Refrigerator iceBox;

    public SmartKitchen(){

        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new Dishwasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Dishwasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater(){

        brewMaster.setHasWorkToDo(true);

    }

    public void pourMilk(){

        iceBox.setHasWorkToDo(true);

    }

    public void loadDishWasher(){

        dishWasher.setHasWorkToDo(true);

    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag ){

        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);

    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();



    }

}

class Refrigerator{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){

        if(hasWorkToDo){
            System.out.println("Ordering the Food");
            hasWorkToDo = false;
        }

    }

}

class Dishwasher{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){

        if(hasWorkToDo){
            System.out.println("Doing the Dishes");
            hasWorkToDo = false;
        }

    }

}

class CoffeeMaker{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){

        if(hasWorkToDo){
            System.out.println("Brewing the Coffee");
            hasWorkToDo = false;
        }

    }
}
