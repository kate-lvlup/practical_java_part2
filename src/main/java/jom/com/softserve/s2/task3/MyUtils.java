package jom.com.softserve.s2.task3;

import java.util.*;

public class MyUtils {
    List<Person> maxDuration(List<Person> persons){
        int maxStudyYears = 0;
        int maxExperienceYears = 0;

        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getStudyYears() > maxStudyYears) {
                    maxStudyYears = student.getStudyYears();
                }
            }
        }

        for (Person person : persons) {
            if (person instanceof Worker) {
                Worker worker = (Worker) person;
                if (worker.getExperienceYears() > maxExperienceYears) {
                    maxExperienceYears = worker.getExperienceYears();
                }
            }
        }

        List<Person> result = new ArrayList<>();

        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getStudyYears() == maxStudyYears) {
                    result.add(student);
                }
            }
        }

        for (Person person : persons) {
            if (person instanceof Worker) {
                Worker worker = (Worker) person;
                if (worker.getExperienceYears() == maxExperienceYears) {
                    result.add(worker);
                }
            }
        }
        return result;
    }
}
