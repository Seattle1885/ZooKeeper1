public class Gorilla extends Mammal {
    int bananaCount = 0;
    @Override
    public int getEnergyLevel() {
        return super.getEnergyLevel();
    }
    public void throwSomething(){ // access mammal pre-set energy level attribute and removes 5 from their energy level
        this.changeEnergyLevel(-5);
    }
    public void climb(){
        this.changeEnergyLevel(-10);
    }
    public void eatBananas(){
        if (this.getEnergyLevel() >= 100){
            bananaCount += 1;
            System.out.println("In for loop if energy > 100 and bananaCount is " + bananaCount);
            fullGorilla(bananaCount);
        }else{
            //System.out.println("in else energy is 5 + now ");
            this.changeEnergyLevel(5);
        }
    }
    public String fullGorilla(int count){
        if (count >= 3){
            System.out.println("You're overfeeding the gorilla");    
            return "You're overfeeding the gorilla";
        }else{
        System.out.println("Gorilla full");
        return "Goriila full";
        }
    }
}
