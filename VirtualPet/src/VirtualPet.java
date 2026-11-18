// Part A

public class VirtualPet {
    private String pet;
    private int weight;
    private int energy;
    private int hapiness;
    private int years;
    private int months;


    public VirtualPet (String pet){
        this.pet = pet;
        weight = 5;
    }

    public String getName() {
        return pet;
    }

    public String toString() {
        return pet + "'s information: "+ "\n"
                +"energy: "+ energy + "\n"+
                " hapiness: " + hapiness + "\n" + " " +
                "Weight: "+ weight+ "\n" +
                " Age: "+ years +" years "+ months +" months";
    }
    public void feed(){
        if(energy<=10 && energy >=0){
            energy++;
            weight++;

        }
        else{
            energy = energy;
            weight = weight;
        }

    }

    public int getEnergyLevel() {
        if(energy<=0) {
            return energy = 0;
        }
        else{
            return energy;
        }
    }

    public int getHappinessLevel() {
        return hapiness;
    }
    public void play(){
        hapiness++;
        weight--;
    }
    public void updateStatus(){
        energy--;

    }
}
