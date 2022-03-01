import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] nouns = {"book","lake","wheel","lamb","koala","banana","robot","shoe","magnet","card"};
        String[] adj={"cool","pretty","smart","ugly","fly","sick","colorful","kind","corny","funny"};

        Random r=new Random();
        int randomNumber=r.nextInt(nouns.length);
        int randomNumber2=r.nextInt(adj.length);
        System.out.println(adj[randomNumber2] + "-" + nouns[randomNumber]);
    }
}
