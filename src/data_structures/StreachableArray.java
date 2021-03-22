package data_structures;

class StreachableArray {

    int initialSize = 10;
    private Object[] objects = new Object[initialSize];

    int index = -1;

    void add(Object object){

        if(index == objects.length - 1){
            Object[] original = objects;
            objects = new Object[initialSize * 2];

            for (int i = 0; i < original.length; i++) {
                objects[i] = original[i];
            }
        }

        try{
            objects[++index] = object;
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    Object get(int index){
        return objects[index];
    }

    int size(){
        return index + 1;
    }

}