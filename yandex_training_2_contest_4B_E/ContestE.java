import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContestE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> topic = new HashMap<>();
        Map<Integer, Integer> topicCount = new HashMap<>();
        Map<Integer, Integer> links = new HashMap<>();

        int msgNumber = 0;

        reader.readLine();

        while (reader.ready()) {
            String line = reader.readLine();

            if (line.equals("0")) {
                msgNumber++;
                topic.put(msgNumber, reader.readLine());
                topicCount.put(msgNumber, 0);
                reader.readLine(); // ненужная строка
            } else {
                msgNumber++;
                int numbLine = Integer.parseInt(line);

                if (topic.containsKey(numbLine)) {          // если ссылается прямо на топик
                    topicCount.merge(numbLine, 1, Integer::sum);
                    links.put(msgNumber, numbLine);
                    reader.readLine(); // ненужная строка
                } else {
                    Integer linkTopic = links.get(numbLine);
                    topicCount.merge(linkTopic, 1, Integer::sum);
                    links.put(msgNumber, linkTopic);
                    reader.readLine(); // ненужная строка
                }
            }
        }
        Map.Entry<Integer, Integer> max = Collections.max(topicCount.entrySet(), Map.Entry.comparingByValue());
        System.out.println(topic.get(max.getKey()));
    }
}
