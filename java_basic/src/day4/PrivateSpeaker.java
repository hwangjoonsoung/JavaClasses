package day4;

public class PrivateSpeaker {
    private int volume;

    public void volumeUp(){
        if(volume >= 100){
            System.out.println("불륨을 올릴 수 없습니다.");
        }else{
            volume += 10;
        }
    }
    public void volumeDown(){
        if(volume <=0){
            System.out.println("볼륨을 줄일 수 없습니다.");
        }else{
            volume -= 10;
        }
    }

    public void showVolume(){
        System.out.println("현제 볼륨 : " + volume);
    }
}
