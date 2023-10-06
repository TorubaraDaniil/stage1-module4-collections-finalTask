package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        ProjectsComparator comp = new ProjectsComparator();
        List<String> listOfProjects = new ArrayList<>();
        for (String key: projects.keySet()) {
            Set<String> devs = projects.get(key);
            if(devs.contains(developer)){
                listOfProjects.add(key);
            }
        }
        listOfProjects.sort(comp);
        return listOfProjects;
    }
}

class ProjectsComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int lengthComparison = Integer.compare(o2.length(), o1.length());
        if (lengthComparison != 0) {
            return lengthComparison;
        } else {
            return o2.compareTo(o1);
        }
    }
}