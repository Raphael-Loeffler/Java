import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
    public static void main(String[] args){
        // Write a method `getUniqueIpAddresses` which accepts a path to `log.txt`
        // as a parameter and returns an array of unique IP addresses.
        // Write a method `getRequestRatio` which accepts a path to `log.txt`
        // as a parameter and returns the ratio of GET to POST requests.
        // If the specified file cannot be found the methods should return an empty
        // array and 0.0 respectively (and raise no errors).
        // Change the path of the log.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        System.out.println(String.join(System.lineSeparator(), getUniqueIpAddresses("files/log.txt")));
        System.out.println(getRequestRatio("files/log.txt"));
    }
    public static String getRequestRatio(String logPathName) {
        try {
            int get = 0;
            int post = 0;
            List<String> content = Files.readAllLines(Paths.get(logPathName));
            for (String line: content) {
                String[] split = line.split("");
                if (split[split.length - 5].equals("O")) {
                    post++;
                } else {
                    get++;
                }
            }
            return "Get: " + get + " Post: " + post;
        } catch (Exception e) {
            return "";
        }
    }

    public static String[] getUniqueIpAddresses(String logPathName) {
        List<String> content;
        String[] out;
        String[] errorOut = new String[0];
        try {
            content = Files.readAllLines(Paths.get(logPathName));
            out = new String[content.size()];
            for (int i = 0; i < content.size(); i++) {
                out[i] = content.get(i);
            }
            return out;
        } catch (Exception e) {
            return errorOut;
        }
    }
}