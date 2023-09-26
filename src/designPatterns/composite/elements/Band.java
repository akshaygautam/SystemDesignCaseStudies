package designPatterns.composite.elements;

import designPatterns.composite.PartyElement;

import java.util.*;

public class Band implements PartyElement {
    private List<PartyElement> members = new ArrayList<>();

    public void addMember(PartyElement member) {
        members.add(member);
    }

    @Override
    public int getFunLevel() {
        int totalFunLevel = 0;
        for (PartyElement member : members) {
            totalFunLevel += member.getFunLevel();
        }
        return totalFunLevel;
    }
}
