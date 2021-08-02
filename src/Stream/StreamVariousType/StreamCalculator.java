package Stream.StreamVariousType;

import static java.lang.System.out;

import Stream.StreamVariousType.StreamAttribute.StreamController;

public class StreamCalculator {
    public static void main(String[] args) {
        StreamController<?> streamController = new StreamController<>();
        out.println(streamController);

    }
}
