package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        for (String key: timetable.keySet()) {
            List<String> listOfSubjects = timetable.get(key);
            for (String subject: listOfSubjects) {
                lessons.add(subject);
            }
        }
        return lessons;
    }
}
