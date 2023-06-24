import java.util.Hashtable;
import java.util.Map;

public class ADDRESSBOOK {

        public static void main(String[] args) {
            Hashtable<Integer,BOOK> h = new Hashtable<Integer, BOOK>();
         BOOK b1 = new BOOK("raj","abc nagar","hosur","tamil nadu","raj@gmail.com");
         BOOK b2 = new BOOK("ram","bbc nagar","bangalore","karnataka","ram@gmail.com");
            h.put(1,b1);
            h.put(2,b2);
            for (Map.Entry<Integer,BOOK>m:h.entrySet()){
                int key = m.getKey();
                BOOK b = m.getValue();
                System.out.println(key+" "+"Details");
                System.out.println(b.name+" "+b.Address+" "+b.city+" "+b.state+" "+b.email);

            }

        }


}
