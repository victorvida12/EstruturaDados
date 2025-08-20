public class Principal {
    public static void main(String[] args) {

        No<String> obj1 = new No<String>("Victor");
        //System.out.println(obj1.toString());
        No<String> obj2 = new No<String>("Letícia");
        //System.out.println(obj2.toString());
        No<String> obj3 = new No<String>("José");
        //System.out.println(obj3.toString());
        No<String> obj4 = new No<String>("João");
        obj1.setNextNo(obj2);
        obj2.setNextNo(obj3);
        obj3.setNextNo(obj4);

        System.out.println(obj1.getNextNo().toString());
  
 
        


    }
}