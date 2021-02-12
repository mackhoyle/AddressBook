package com.example.myapplication.buddy;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany
    private List<BuddyInfo> buddyInfo;

    public AddressBook() {
        this.buddyInfo = new ArrayList<BuddyInfo>();
    }

    public Long getId(){
        return id;
    }


    public void addElement(BuddyInfo b) {
        buddyInfo.add(b);
    }

    public int getSize(){
        return this.buddyInfo.size();
    }

}