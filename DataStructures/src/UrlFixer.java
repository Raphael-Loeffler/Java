public class UrlFixer {
    public static void main(String... args) {

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions!

        String url = "https//www.reddit.com/r/nevertellmethebots";

        //Using StringBuilder:
        StringBuilder url1Changed = new StringBuilder(url);
        url1Changed.replace(38, 42, "odds");
        url1Changed.insert(5, ':');
        System.out.println(url1Changed);

        //Using other String functions:
        url = url.replace("bots", "odds");
        //StringBuffer url2Changed = new StringBuffer(url);
        //url2Changed.insert(5, ':');
        //System.out.println(url2Changed); <-- not that good
    }
}