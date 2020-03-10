package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;
    public Student() {
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;

    }

    public Lab getLab(String labName) {
        for(Lab l : labs){
            if(l.getName().equals(labName)){
                return l;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab l = getLab(labName);
        if(l == null){
            throw new UnsupportedOperationException();
        }
        l.setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        lab.setStatus(LabStatus.PENDING);


    }

    public LabStatus getLabStatus(String labName) {
        for(Lab l : labs){
            if(l.getName().equals(labName)){
                return l.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        labs.sort(Comparator.comparing(Lab::getName));
        StringBuilder sb = new StringBuilder();
        for(Lab l : labs){
            sb.append(l.getName() + " > " + l.getStatus() + "\n");
        }
        return sb.toString().trim();
    }
}
