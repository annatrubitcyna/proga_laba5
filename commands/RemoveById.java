package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class RemoveById extends Command {
    public RemoveById() {
        name = "remove_by_id";
        help = "удалить элемент из коллекции по его id";
    }

    /**
     * Удаляет элемент из коллекции по его id
     *
     * @param args       id элемента
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        if (args.equals("")) {
            System.out.println("Введите пожалуйста id");
        } else {
            for (int i = 0; i < collection.size(); i++) {
                int id = collection.get(i).id;
                String sId = String.valueOf(id);
                if (sId.equals(args)) {
                    System.out.println("Элемент удален");
                    collection.remove(i);
                    break;
                }
                else if(i==collection.size()-1){
                    System.out.println("Элемента с таким id нет");
                }
            }
        }
    }
}
