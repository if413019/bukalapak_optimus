package testdata;

import java.util.Map;
import java.util.TreeMap;

public class Credentials{
    /**
        This class stores credentials needed to run the test.
        you can just use username listed below in the feature files to pass it to steps where you can obtain all
        information that you need for that steps.
    **/
    private String[] VALID_AGENT_CREDENTIALS      = {"qwerty"};
    private String[] VALID_SELLER_CREDENTIALS     = {"qwerty"};
    private String[] NANMAIDABU                   = {"rahasiadong"};
    private String[] ARKADIUSREYMOND2             = {"qwerty", "Arkadius Reymond"};
    private String[] TESTAKUNSATUDUA1             = {"qwerty", "Test Akun Satu Dua 1"};
    private String[] MEOW                         = {"mantanqwerty"};
    private String[] SAYURKANGKUNG                = {"masihqwerty", "Sayur Kangkung"};
    private String[] TESTAKUNBARU                 = {"qwerty"};
    private String[] MOHAMMADRISHARADITYA1        = {"qwerty"};
    private String[] MYQA15                       = {"sayurkangkung"};
    private String[] INTANTESTING19               = {"udahdiganti"};
    private String[] AFK15                        = {"test123"};
    private String[] GOSEND1                      = {"qwerty"};
    private String[] GOSEND2                      = {"gosend2"};
    private String[] RHOMADUREN                   = {"maunyaapa"};
    private String[] MANUALANDROID                = {"android"};
    public  Map<String, String[]> data = new TreeMap<>();

    public Credentials(){
        data.put("aldotesting"          ,VALID_AGENT_CREDENTIALS);
        data.put("aldoseller"           ,VALID_SELLER_CREDENTIALS);
        data.put("nanmaidabu"           ,NANMAIDABU);
        data.put("arkadiusreymond2"     ,ARKADIUSREYMOND2);
        data.put("testakunsatudua1"     ,TESTAKUNSATUDUA1);
        data.put("meow"                 ,MEOW);
        data.put("sayurkangkung"        ,SAYURKANGKUNG);
        data.put("testakunbaru"         ,TESTAKUNBARU);
        data.put("mohammadrisharaditya1",MOHAMMADRISHARADITYA1);
        data.put("myqa15"               ,MYQA15);
        data.put("intantesting19"       ,INTANTESTING19);
        data.put("afk15"                ,AFK15);
        data.put("gosend1"              ,GOSEND1);
        data.put("gosend2"              ,GOSEND2);
        data.put("rhomaduren"           ,RHOMADUREN);
        data.put("manualandroid"        ,MANUALANDROID);
    }
}