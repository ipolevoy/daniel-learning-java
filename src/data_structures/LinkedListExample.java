package data_structures;

public class LinkedListExample {
    public static void main(String[] args) {

        HouseList hl = new HouseList();

        for(int i = 0; i < 100; i++ ){
            hl.add(new House("address" + i));
        }

        System.out.println(hl.getCurrent());

        while(hl.hasNext()){
            System.out.println(hl.next());
        }
    }
}
