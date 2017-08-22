package org.fundacionjala.coding.abel;

import java.util.stream.IntStream;

/**
 * CA stream of data is received and needs to be reversed. Each segment is 8 bits
 * meaning the order of these segments need to be reversed:
 * 11111111 00000000 00001111 10101010
 * (byte1) (byte2) (byte3) (byte4)
 * 10101010 00001111 00000000 11111111
 * (byte4) (byte3) (byte2) (byte1)
 * Total number of bits will always be a multiple of 8. The data is given in an array as such:
 * [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]
 */
public final class DataReverse {

    /**
     * Private Constructor.
     */
    private DataReverse() {

    }

    /**
     * Reverse the bytes on the input.
     *
     * @param data int[].
     * @return int[].
     */
    public static int[] dataReverse(int[] data) {
        int numberOfBytes = (data.length / 8) - 1;
        int[] result = new int[data.length];
        IntStream.rangeClosed(0, numberOfBytes)
                .forEach(i -> {
                    int dataPosition = 8 * i;
                    int resultPosition = (8 * numberOfBytes) - dataPosition;
                    IntStream.range(0, 8)
                            .forEach(n -> {
                                result[n + resultPosition] = data[n + dataPosition];
                            });
                });

        return result;
    }
}
