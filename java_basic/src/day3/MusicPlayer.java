package day3;

public class MusicPlayer {

    public static void main(String[] args) {
        System.out.println("절차지향 프로그래밍");
        int volume = 0;
        boolean isOn = false;
        
        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이서 켜기");
        System.out.println("볼륨 : "+ volume);

        //볼륨증가
        volume ++;
        System.out.println("볼륨 : "+ volume);

        //볼륨증가
        volume ++;
        System.out.println("볼륨 : "+ volume);

        //볼륨감소
        volume --;
        System.out.println("볼륨 : "+ volume);

        //음악 플레이서 상태 
        System.out.println("음악플레이서 상태 확인");
        if(isOn){
            System.out.println("음악플레이서 상태 On");
            System.out.println("볼륨 : "+ volume);
        }else{
            System.out.println("음악플레이서 상태 off");
            System.out.println("볼륨 : "+ volume);
        }

        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악플레이어 끄기");

    }

}
