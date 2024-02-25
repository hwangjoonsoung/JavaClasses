package day4;


class User {

    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        speaker.volume =200;
        speaker.showVolume();

        PrivateSpeaker privateSpeaker = new PrivateSpeaker();
//        privateSpeaker.volume 컴파일 오류 volume은 다른클레스에서 접근 할 수 없음

    }
}
