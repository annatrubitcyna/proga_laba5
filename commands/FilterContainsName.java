package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class FilterContainsName extends Command {
    public FilterContainsName() {
        name = "filter contains name";
        help = "вывести элементы, значение поля name которых содержит заданную подстроку";
    }

    /**
     * Выводит элементы, значение поля name которых содержит заданную подстроку
     *
     * @param args       не принимает аргументы
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        if (!args.equals("")) {
            System.out.println("Введите пожалуйста подстроку");
        } else {
            System.out.println("Элементы, значение поля name которых содержит заданную подстроку:");
            for (int i = 0; i < collection.size(); i++) {
                if (collection.get(i).name.contains(args)) {
                    HumanBeing first = collection.get(i);
                    System.out.println("id:" + first.id + ", " + "name:" + first.name + ", " + "coordinate x:" + first.coordinates.x + ", " + "coordinate y:" + first.coordinates.y + ", " + "creation date:" + first.creationDate + ", " + "real hero:" + first.realHero + ", " + "has tooth pick:" + first.hasToothpick + ", " + "impackt speed:" + first.impactSpeed + ", " + "soundtrack name:" + first.soundtrackName + ", " + "weapon type:" + first.weaponType + ", " + "mood:" + first.mood + ", " + "car cool:" + first.car.cool);
                }
            }
        }
    }
}
