package data_structures;

public class HouseList {

    private House head, tail, current;
    private int size = 0;

    public  void add(House house){
        if(tail == null){
            head = tail = current  = house;
        }else{
            tail.setNextHouse(house);
            tail = house;
        }

        size++;
    }

    public int size(){
        return size;
    }

    public House getCurrent(){
        return current;
    }

    public boolean hasNext(){
        return current.getNextHouse() != null;
    }

    public House next(){
        House house = current.getNextHouse();

        if(house == null){
            throw new RanOutOfHousesException();
        }
        current = house;
        return house;
    }
}
