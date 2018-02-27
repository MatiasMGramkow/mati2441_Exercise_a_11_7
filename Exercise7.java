import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
        Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique integers
        that occur in both lists. Use one or more sets as storage to help you solve this problem. For example, if one list contains
        the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values [–5, 15, 2, –1, 7,
        15, 36], your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists. */
public class Exercise7
{
    public static void main(String[] args)
    {
        List<Integer> liste1 = new LinkedList<>();
        List<Integer> liste2 = new LinkedList<>();
        liste1.add(3);
        liste1.add(7);
        liste1.add(3);
        liste1.add(-1);
        liste1.add(2);
        liste1.add(3);
        liste1.add(7);
        liste1.add(2);
        liste1.add(15);
        liste1.add(15);


        liste2.add(-5);
        liste2.add(15);
        liste2.add(2);
        liste2.add(-1);
        liste2.add(7);
        liste2.add(7);
        liste2.add(15);
        liste2.add(36);

        System.out.println(countCommon(liste1,liste2));
    }

    public static int countCommon (List<Integer> liste1, List<Integer> liste2)
    {
        Set<Integer> finalListe = new HashSet<>();
        for (Integer i : liste1)
        {
            if(liste2.contains(i))
            {
                finalListe.add(i);
            }
        }
        for (Integer i : liste2)
        {
            if(liste1.contains(i))
            {
                finalListe.add(i);
            }
        }

        System.out.println(finalListe);
        return finalListe.size();
    }
}
