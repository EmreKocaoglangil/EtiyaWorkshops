package Polymorphism;

public class Main {
    public static void main(String[] args) {

        Music[] musics = new Music[2];
        musics[0] = new MP3Music();
        musics[1] = new WAVMusic();


        for (Music music : musics) {
            music.play();
        }
    }
}
