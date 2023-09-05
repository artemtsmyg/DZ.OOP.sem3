package Domen;

//import java.util.Iterator;
//import java.util.List;

//public class StudentGroup implements Iterable<Student> {
//    private List<Student> group;
//    private Integer idGroup;
//
//    public StudentGroup(List<Student> group, Integer idGroup) {
//        this.group = group;
//        this.idGroup = idGroup;
//    }
//
//    public List<Student> getGroup() {
//        return group;
//    }
//
//    public void setGroup(List<Student> group) {
//        this.group = group;
//    }
//
//    public Integer getIdGroup() {
//        return idGroup;
//    }
//
//    public void setIdGroup(Integer idGroup) {
//        this.idGroup = idGroup;
//    }
//
//    @Override
//    public String toString() {
//        return "StudentGroup{" +
//                "group=" + group +
//                ", idGroup=" + idGroup +
//                '}';
//    }



    // @Override
    // public Iterator<Student> iterator() {
    //    return new Iterator<Student>() {

    //     private int counter;

    //     @Override
    //     public boolean hasNext() {

    //         if(counter<group.size())
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             return false;
    //         }
    //     }

    //     @Override
    //     public Student next() {
    //         return group.get(counter++);
    //     }

    //    };

    // }




//    @Override
//    public Iterator<Student> iterator() {
//        return new StudentIterator(group);
//
//    }
//
//
//}
/*
 * Класс `StudentGroup` представляет учебную группу и содержит поля `name` -название группы,
 * и `numberOfStudents` - количество студентов в группе.
 */

public class StudentGroup implements Comparable<StudentGroup> {



    private String name;

    private int numberOfStudents;


    public StudentGroup(String name, int numberOfStudents) {

        this.name = name;

        this.numberOfStudents = numberOfStudents;

    }


    public String getName() {

        return name;

    }


    public int getNumberOfStudents() {

        return numberOfStudents;

    }

    /*
     * Метод `compareTo(StudentGroup otherGroup)` реализует метод
     * сравненияобъектов класса `StudentGroup` по количеству студентов.
     */
    public int compareTo(StudentGroup otherGroup) {

        return Integer.compare(this.numberOfStudents, otherGroup.numberOfStudents);

    }

    /*
     * Метод `toString()` возвращает строку с названием группы и количеством студентов.
     */

    public String toString() {

        return "Group " + name + " (" + numberOfStudents + " students)";

    }


}



