//You are in charge of the cake for a child's birthday. It will have one candle for each year of their total age. 
//They will only be able to blow out the tallest of the candles. Your task is to count how many candles are the tallest.
//Example
//candles=[4,4,2,3]
//The tallest candles are 4 units high. There are 2 candles with this height, so the function should return 2.





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxCandleHeight = 0;
        int maxCandleCount = 0;
        
        for(Integer candle : candles){
            if(candle > maxCandleHeight){
                maxCandleHeight = candle;
            }
        }
        
        for(Integer candle : candles){
            if(candle == maxCandleHeight){
                maxCandleCount++;
            }
        }
        return maxCandleCount;
    

    }

}

public class BirthdayCandle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
