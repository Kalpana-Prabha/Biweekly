import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Sol7 {

    /*
     * Complete the 'minimumLoss' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER_ARRAY price as parameter.
     */

    public static int minimumLoss(List<Long> price) {

        Map<Long, Integer> indexMap = new HashMap<>();
        for (int i=0;i <price.size();i++) {
            indexMap.put(price.get(i),i);
        }
        Collections.sort(price);

        long minLoss=Long.MAX_VALUE;
        for (int i=1;i<price.size(); i++) {
            long sellPrice=price.get(i -1);
            long buyPrice=price.get(i);
            if (indexMap.get(buyPrice)<indexMap.get(sellPrice)) {
                long currentLoss=buyPrice-sellPrice;
                if(currentLoss<minLoss) {
                    minLoss=currentLoss;
                }
            }
        }

        return (int) minLoss;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> price = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        int result = Result.minimumLoss(price);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
