package commands;

import collectionClass.HumanBeing;

import java.util.LinkedList;

public class Show extends Command {
    public Show() {
        name = "show";
        help = "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    /**
     * Выводит элементы коллекции
     *
     * @param args       не принимает аргументов
     * @param collection коллекция
     */
    @Override
    public void work(String args, LinkedList<HumanBeing> collection) {
        if (!args.equals("")) {
            System.out.println("На данном этапе команда не принимает аргументы");
        } else {
            System.out.println("Элементы коллекции:");
            for (int i = 0; i < collection.size(); i++) {
                HumanBeing first = collection.get(i);
                System.out.println("id:" + first.id + ", " + "name:" + first.name + ", " + "coordinate x:" + first.coordinates.x + ", " + "coordinate y:" + first.coordinates.y + ", " + "creation date:" + first.creationDate + ", " + "real hero:" + first.realHero + ", " + "has tooth pick:" + first.hasToothpick + ", " + "impackt speed:" + first.impactSpeed + ", " + "soundtrack name:" + first.soundtrackName + ", " + "weapon type:" + first.weaponType + ", " + "mood:" + first.mood + ", " + "car cool:" + first.car.cool);
            }
        }
    }
}
