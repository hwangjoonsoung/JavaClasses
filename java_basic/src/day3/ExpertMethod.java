package day3;

public class ExpertMethod {

    public static void main(String[] args) {
        MusicPlayerData2 MusicPlayerData2 = new MusicPlayerData2();
        System.out.println("절차지향 프로그래밍");

        //음악 플레이어 켜기
        on(MusicPlayerData2);

        //볼륨증가
        volumUp(MusicPlayerData2);

        //볼륨증가
        volumUp(MusicPlayerData2);

        //볼륨감소
        volumDown(MusicPlayerData2);

        //음악 플레이서 상태
        System.out.println("음악플레이서 상태 확인");
        showStatus(MusicPlayerData2);

        //음악 플레이어 끄기
        off(MusicPlayerData2);

    }
    static void on (MusicPlayerData2 musicPlayerData2) {
        musicPlayerData2.isOn = true;
        System.out.println("뮤직플레이서 켜기");
    }
    static void off (MusicPlayerData2 musicPlayerData2) {
        musicPlayerData2.isOn = false;
        System.out.println("뮤직플레이서 끄기");
    }

    static void volumUp (MusicPlayerData2 musicPlayerData2) {
        musicPlayerData2.volum ++;
        System.out.println("음량 높이기 volnum : "+ musicPlayerData2.volum);
    }
    static void volumDown (MusicPlayerData2 musicPlayerData2) {
        musicPlayerData2.volum --;
        System.out.println("음량 줄이기 volnum : "+ musicPlayerData2.volum);
    }

    static void showStatus(MusicPlayerData2 musicPlayerData2){
        boolean isOn = musicPlayerData2.isOn;
        if(isOn ){
            System.out.println("켜짐");
        }else{
            System.out.println("꺼짐");
        }
    }

}

class MusicPlayerData2{
    int volum = 0;
    boolean isOn = false;

}