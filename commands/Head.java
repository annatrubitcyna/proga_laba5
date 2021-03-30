package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class Head extends Command {
    public Head() {
        name = "head";
        help = "вывести первый элемент коллекции";
    }

    /**
     * Выводит первый элемент коллекции
     *
     * @param args       не принимает аргументы
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        if (!args.equals("")) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else {
            HumanBeing first = collection.get(0);
            System.out.println("Первый элемент коллекции");
            System.out.println("id:" + first.id + ", " + "name:" + first.name + ", " + "coordinate x:" + first.coordinates.x + ", " + "coordinate y:" + first.coordinates.y + ", " + "creation date:" + first.creationDate + ", " + "real hero:" + first.realHero + ", " + "has tooth pick:" + first.hasToothpick + ", " + "impackt speed:" + first.impactSpeed + ", " + "soundtrack name:" + first.soundtrackName + ", " + "weapon type:" + first.weaponType + ", " + "mood:" + first.mood + ", " + "car cool:" + first.car.cool);
        }
    }
}
