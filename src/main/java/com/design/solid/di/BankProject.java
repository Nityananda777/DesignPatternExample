package com.design.solid.di;

import java.util.List;

public class BankProject implements Project {

    private List<Developer> developers;

    public BankProject(List<Developer> developers) {

        this.developers = developers;
    }

    @Override
    public void implementProject() {
        developers.forEach(d -> d.develop());
    }
}
