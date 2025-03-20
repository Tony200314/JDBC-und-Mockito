public class App {
    public static void main(String[] args) throws Exception {
        MusicInterface musicInterface = new MusicInterface();

        System.out.println("choose a music:  ");
        System.out.println("E.R");
        System.out.println("Don Ready");
        System.out.println("Kieran the light ");
        System.out.println("Rst");
        System.out.println("Angie Rose");
        System.out.println();

        try {
            musicInterface.playMusic();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
