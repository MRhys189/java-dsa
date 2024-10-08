package hackerrank;
import java.lang.String;
import java.util.*;
class Vowels {
    /**
     * Return the number (count) of vowels in the given string.
     * We will consider a, e, i, o, u as vowels for this Kata (but not y).
     * The input string will only consist of lower case letters and/or spaces.
     */

     public static void main(String[] args) {
        System.out.println(getCount("abracadabra")); //5
        System.out.println(getCount("")); //0
        System.out.println(getCount("pear tree")); //4
        System.out.println(getCount("o a kak ushakov lil vo kashu kakao")); //13
        System.out.println(getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty")); //168

     }

    

     public static int getCount(String str) {
        String regex = "a|e|i|o|u";
        char[] charArray = str.toCharArray();
        int count = 0;
        for(int index = 0; index < str.length(); index++) {
          String charStr = String.valueOf(charArray[index]);
          if (charStr.matches(regex))
            count++;
        }
        return count;
      }

      public static int getCountAlt1(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
      }

      public static int getCountAlt2(String str) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int vowelCount = 0;
        for (char c: vowels) {
            if (vowels.contains(c))
            vowelCount += 1;
        }
        return vowelCount;
      }
    
    
    }