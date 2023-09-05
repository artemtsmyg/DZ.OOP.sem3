package Domen;

import java.util.Collections;

/*
 * В методе `main` создается объект `stream` класса `StudentStream` с номеромпотока 1.
 */

public class Main {


    public static void main(String[] args) {

        StudentStream stream = new StudentStream(1);

/**
 * Затем создаются три объекта `group1`, `group2`, `group3` класса`StudentGroup` с разным количеством студентов,
 *  * и каждая группа добавляется всписок групп потока.
 */

        StudentGroup group1 = new StudentGroup("Group 1", 25);

        StudentGroup group2 = new StudentGroup("Group 2", 20);

        StudentGroup group3 = new StudentGroup("Group 3", 30);


        stream.addGroup(group1);

        stream.addGroup(group2);

        stream.addGroup(group3);
        /**
         * * Цикл `for` используется для вывода списка групп на консоль,
         *          * а после этогосписок сортируется методом `sort` класса `Collections`, используя интерфейс`Comparable`.
         */

        for (StudentGroup group : stream) {

            System.out.println(group);

        }

        Collections.sort(stream.getGroups());

        for (StudentGroup group : stream) {

            System.out.println(group);

        }
    }
}