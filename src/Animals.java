public class Animals {
    public int puzzleId;
    public String animal;
    public double km;
    public double miles;

    public int getPuzzleId() {
        return puzzleId;
    }
    public void setPuzzleId(int puzzleId) {
        this.puzzleId = puzzleId;
    }
    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }
    public double getMiles() {
        return miles;
    }
    public void setMiles(double miles) {
        this.miles = miles;
    }

    public Animals(int puzzleId, String animal, double km, double miles) {
        this.puzzleId = puzzleId;
        this.animal = animal;
        this.km = km;
        this.miles = miles;
    }


}
