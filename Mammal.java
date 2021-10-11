public class Mammal{
    private int energyLevel = 100;

    public int getEnergyLevel(){
        return this.energyLevel;
    }
    public void changeEnergyLevel(int num){
        this.energyLevel += num;
    }
}