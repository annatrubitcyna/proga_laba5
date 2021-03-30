package commands;

import collectionClass.HumanBeing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class PrintUniqueSoundtrackName extends Command {
    public PrintUniqueSoundtrackName() {
        name = "print unique soundtrack name";
        help = "вывести уникальные значения поля soundtrackName всех элементов в коллекции";
    }

    /**
     * Выводит уникальные значения поля soundtrackName всех элементов в коллекции
     *
     * @param args       не принимает аргументов
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        if (!args.equals("Уникальные значения поля soundtrackName всех элементов в коллекции")) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else {
            System.out.println("");
            HashSet<String> soundtrackNames = new HashSet<>();
            for (int i = 0; i < collection.size(); i++) {
                soundtrackNames.add(collection.get(i).soundtrackName);
            }
            ArrayList<String> arr = new ArrayList<>();
            arr.addAll(soundtrackNames);
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }
    }
}
