package org.fundacionjala.coding.abel;

import java.util.stream.Stream;

/**
 * Created by AbelBarrientos on 5/26/2017.
 */
public final class EanValidation {


    public static boolean validate(String checksum) {
        char[] charArray = checksum.substring(0, checksum.length() - 1).toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            int intValue = Integer.parseInt(String.valueOf(charArray[i]));
            sum += i % 2 == 0 ? intValue : intValue * 3;
        }
        int realChecksum = (sum % 10 == 0) ? 0 : 10 - (sum % 10);
        return realChecksum == Integer.parseInt(checksum.substring(checksum.length() - 1));

//        boolean flag = false;
//        int sum2 = 0;
//        Stream.of(checksum.substring(0, checksum.length() - 1).split(""))
//                .map((character, index) -> {
//                    int intValue = Integer.parseInt(character);
//                    sum2 += (index % 2 == 0) ? intValue * 3 : intValue;
//                    flag = !flag;
////                    if (flag)
////                        sum2 += intValue * 3;
////                    else
////                        sum2 += intValue;
//                });
//        int realChecksum = (sum2 % 10 == 0) ? 0 : 10 - (sum2 % 10);
//        return realChecksum == Integer.parseInt(checksum.substring(checksum.length() - 1));
    }
}
