import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Byte b = new Byte("1");
        Integer i = new Integer(4);
        Short s = new Short("2");
        Long l = new Long(6000000L);
        Double d = new Double(3.12456667);
        Float f = new Float(3.24f);
        Boolean t = new Boolean(true);
        Character c = new Character('c');



        System.out.println(b);
        System.out.println(i);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(t);
        System.out.println(c);



       // Deprecated object consider using valueOf()
    }
}
