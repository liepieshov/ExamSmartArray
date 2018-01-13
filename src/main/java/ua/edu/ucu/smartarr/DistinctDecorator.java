package ua.edu.ucu.smartarr;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    @Override
    public Object[] toArray() {
        List<Object> list = new ArrayList<>();
        for (Object o : smartArray.toArray()) {
            if(!list.contains(o)){
                list.add(o);
            }
        }
        return list.toArray();
    }

    @Override
    public String operationDescription() {
        return smartArray.operationDescription();
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
