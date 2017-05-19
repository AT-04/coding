package org.fundacionjala.coding;

/**
 * Created by Administrator on 5/19/2017.
 */
public class Numbers {
    private String originalFileMessage;
    private String cutOffDigit;
    private int digitToExtract;
    private int digitParsed;

    private final String number0=" _ | ||_|";
    private final String number1="     |  |";
    private final String number2=" _  _||_ ";
    private final String number3=" _  _| _|";
    private final String number4="   |_|  |";
    private final String number5=" _ |_  _|";
    private final String number6=" _ |_ |_|";
    private final String number7=" _   |  |";
    private final String number8=" _ |_||_|";
    private final String number9=" _ |_| _|";

    public static void main(String args[]){
        Number myNumber=new Number("    _  _     _  _  _  _  _   | _| _||_||_ |_   ||_||_|  ||_  _|  | _||_|  ||_| _|",1);
        System.out.println(myNumber.());
    }

    public Numbers(String fileMessage,int digit){
        originalFileMessage=fileMessage;
        cutOffDigit="";
        digitToExtract=digit;
        parseDigit();
    }

    private void parseDigit() {
        if(originalFileMessage.length()==81){
            for(int i=(3*digitToExtract-3);i<originalFileMessage.length();i++){
                for(int j=i;j<i+3;j++){
                    cutOffDigit+=originalFileMessage.charAt(j)+"";
                }
                i+=26;
            }
            switch (cutOffDigit){
                case number0:
                    digitParsed=0;
                    break;
                case number1:
                    digitParsed=1;
                    break;
                case number2:
                    digitParsed=2;
                    break;
                case number3:
                    digitParsed=3;
                    break;
                case number4:
                    digitParsed=4;
                    break;
                case number5:
                    digitParsed=5;
                    break;
                case number6:
                    digitParsed=6;
                    break;
                case number7:
                    digitParsed=7;
                    break;
                case number8:
                    digitParsed=8;
                    break;
                case number9:
                    digitParsed=9;
                    break;
            }
        }
        else{
            digitParsed=-1;
            cutOffDigit="";
        }
    }

    public String getCutOffDigit(){
        return cutOffDigit;
    }

    public int getDigitParsed(){
        return digitParsed;
    }

}
