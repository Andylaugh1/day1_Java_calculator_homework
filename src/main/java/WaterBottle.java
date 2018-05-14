public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int reduceVolume(){
        return this.volume - 10;
    }

    public int reduceVolumeZero(){
        return this.volume = 0;
    }

    public int fillVolumeUp(){
        return this.volume = volume;
    }
}
