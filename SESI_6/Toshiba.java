package Tugas_6;

public class Toshiba implements Laptop {
    private int volume;
    private boolean is_power_on;
    
    public Toshiba(){
        this.volume = 30;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On ");
        System.out.println("Toshiba Satellite");
    }

    @Override
    public void powerOff(){
        is_power_on = false;
        System.out.println("Shutdown Toshiba...");
    }

    @Override
    public void volumeUp(){
        if(is_power_on){
            if(this.volume == MAX_VOL){
                System.out.println("Volume is Full");
            } else {
                this.volume += 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        }
    }

    @Override
    public void volumeDown(){
        if(is_power_on){
            if(this.volume == MIN_VOL){
                System.out.println("Volume is 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        }
    }

    public int getVolume(){
        return this.volume;
    }
}

