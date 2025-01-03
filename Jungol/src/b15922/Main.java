// 백준 15922번
package b15922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class LineSegment implements Comparable<LineSegment> {
    int start, end;
    public LineSegment(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(LineSegment other) {
        if (this.start == other.start) return this.end - other.end;
        return this.start - other.start;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int segmentCount = Integer.parseInt(reader.readLine());

        ArrayList<LineSegment> segments = new ArrayList<>();
        while (segmentCount-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            segments.add(new LineSegment(
                Integer.parseInt(tokenizer.nextToken()),
                Integer.parseInt(tokenizer.nextToken())
            ));
        }
        Collections.sort(segments);

        int currentStart = segments.get(0).start;
        int currentEnd = segments.get(0).end;
        int totalLength = 0;

        for (int i = 1; i < segments.size(); i++) {
            LineSegment currentSegment = segments.get(i);
            if (currentEnd >= currentSegment.start) {
                currentEnd = Math.max(currentEnd, currentSegment.end);
            } else {
                totalLength += currentEnd - currentStart;
                currentStart = currentSegment.start;
                currentEnd = currentSegment.end;
            }
        }
        totalLength += currentEnd - currentStart;

        System.out.println(totalLength);
    }
}