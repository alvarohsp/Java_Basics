import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InterferenceExemplo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://docs.oracle.com/en/java/javase/16/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }
}
