package Domen;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;



/*
 * представляет поток студентов и содержит поле`streamNumber` - номер потока,
 * и список `groups` - список учебных групп,представленных объектами класса `StudentGroup`.
 *
 */

class StudentStream implements Iterable<StudentGroup> {

    private int streamNumber;

    private List<StudentGroup> groups;



    public StudentStream(int streamNumber) {

        this.streamNumber = streamNumber;

        this.groups = new ArrayList<>();

    }

    /**
     * Метод `addGroup(StudentGroup group)` добавляет группу в список групп потока.
     * @param group
     */
    public void addGroup(StudentGroup group) {

        this.groups.add(group);

    }

    /**
     * Метод `getStreamNumber()` возвращает номер потока.
     * @return
     */
    public int getStreamNumber() {

        return streamNumber;

    }

    /**
     * Метод `getGroups()`  возвращает список групп.
     * @return
     */

    public List<StudentGroup> getGroups() {

        return groups;

    }

    /*
     * Интерфейс `Iterable` был реализован, поэтому в классе `StudentStream` былреализован метод `iterator()`,
     * который возвращает итератор для списка групп.
     */

    public Iterator<StudentGroup> iterator() {

        return groups.iterator();

    }



}

