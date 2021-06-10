import java.util.HashMap;
import java.util.Set;

public class MusicMap {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Land of the music", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        trackList.put("Never let the sun rise", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        trackList.put("rest", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        trackList.put("forgotten forgiven", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println("Song Title - " + key);
            System.out.println(trackList.get(key));
            System.out.println("---------------------------------------------------");
        }
    }
}