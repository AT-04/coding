package org.fundacionjala.coding.Richard;

/**
 * Created by RichardSeverich on 5/16/2017.
 */
public class BankOcr
{

    public String one;
    public String two;
    public String tre;
    public String fur;
    public String fiv;
    public String six;
    public String sev;
    public String eig;
    public String nin;

    String num1 ="";
    String num2 ="";
    String num3 ="";
    String num4 ="";
    String num5 ="";
    String num6 ="";
    String num7 ="";
    String num8 ="";
    String num9 ="";


    public BankOcr()
    {
        one="     |  |";
        two=" _  _||_ ";
        tre=" _  _| _|";
        fur="   |_|  |";
        fiv=" _ |_  _|";
        six=" _ |_ |_|";
        sev=" _   |  |";
        eig=" _ |_||_|";
        nin=" _ |_| _|";


    }

    public String convertEntryToNumber(String entryLine1, String entryLine2, String entryLine3)
    {
        String numero= "";

        extractString(entryLine1);
        extractString(entryLine2);
        extractString(entryLine3);

        if(num1.equals(one))
        {
            numero=numero+"1";
        }
        if(num2.equals(two))
        {
            numero=numero+"2";
        }
        if(num3.equals(tre))
        {
            numero=numero+"3";
        }
        if(num4.equals(fur))
        {
            numero=numero+"4";
        }
        if(num5.equals(fiv))
        {
            numero=numero+"5";
        }
        if(num6.equals(six))
        {
            numero=numero+"6";
        }
        if(num7.equals(sev))
        {
            numero=numero+"7";
        }
        if(num8.equals(eig))
        {
            numero=numero+"8";
        }
        if(num9.equals(nin))
        {
            numero=numero+"9";
        }


        return numero;
    }

    private void extractString(String entryLine)
    {
        for(int i = 0; i< entryLine.length();i++)
        {
            if(i<3)
            {
                num1=num1+entryLine.charAt(i);
            }
            if(i<6 && i>=3 )
            {
                num2=num2+entryLine.charAt(i);
            }

            if(i<9 && i>=6 )
            {
                num3=num3+entryLine.charAt(i);
            }
            if(i<12 && i>=9 )
            {
                num4=num4+entryLine.charAt(i);
            }
            if(i<15 && i>=12 )
            {
                num5=num5+entryLine.charAt(i);
            }
            if(i<18 && i>=15 )
            {
                num6=num6+entryLine.charAt(i);
            }
            if(i<21 && i>=18 )
            {
                num7=num7+entryLine.charAt(i);
            }
            if(i<24 && i>=21 )
            {
                num8=num8+entryLine.charAt(i);
            }
            if(i<27 && i>=24 )
            {
                num9=num9+entryLine.charAt(i);
            }


        }
    }



}
