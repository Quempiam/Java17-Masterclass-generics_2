package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;
import dev.lpa.util.QueryItem;
import dev.lpa.util.QueryList;
import dev.lpa.util.StudentCourseComparator;

import java.util.Comparator;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {
        int studentCount = 25;
        QueryList<LPAStudent> studentsList = new QueryList<>();

        for (int i = 0; i< studentCount; i++) {
            studentsList.add(new LPAStudent());
        }

        for (Student elem : studentsList) {
            System.out.println(elem.toString());
        }
        System.out.println("-".repeat(60));

        //  percent done query
        List<LPAStudent> halfWayCourse = studentsList.getMatches("PERCENT", "50.0");
        for (Student elem : halfWayCourse) {
            System.out.println(elem.toString());
        }
        System.out.println("-".repeat(60));

        //  sorting by id reversed
        halfWayCourse.sort(Comparator.reverseOrder());
        for (Student elem : halfWayCourse) {
            System.out.println(elem.toString());
        }
        System.out.println("-".repeat(60));

        //  sorting by course
        halfWayCourse.sort(new StudentCourseComparator().thenComparing(Comparator.naturalOrder()));
        for (Student elem : halfWayCourse) {
            System.out.println(elem.toString());
        }
        System.out.println("-".repeat(60));
    }
}
