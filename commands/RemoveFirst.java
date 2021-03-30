package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class RemoveFirst extends Command {

    public RemoveFirst() {
        name = "remove_first";
        help = "удалить первый элемент из коллекции";
    }

    /**
     * Удаляет первый элемент из коллекции
     *
     * @param args       не принимает аргументов
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) throws IndexOutOfBoundsException{
        if (!args.equals("")) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else {
            try {
                collection.remove(0);
                System.out.println("Первый элемент удален");
            }
            catch(IndexOutOfBoundsException i){
                System.out.println("В коллекции нет элементов");
                }
        }
    }
}
