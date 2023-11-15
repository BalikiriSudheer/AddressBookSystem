package com.demo;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<PersonAddress> Details;
    public AddressBook(){
        this.Details=new ArrayList<>();
    }
    public void addDetails(PersonAddress address){
        Details.add(address);
    }
    public void removeDetails(PersonAddress address){
        Details.remove(address);
    }


    public void viewDetails(){
        if(Details.isEmpty()){
            System.out.println("There is no Details");
        }
        else{
            System.out.println("Your Address Details are:");
            for(PersonAddress list:Details){
                System.out.println(list.getFname()+" "+list.getLname()+" "+list.getMail()+" "+list.getPhone()+" "+list.getZip()+" "+list.getState());
            }
        }
    }

    public static void main(String[] args) {
        PersonAddress a1=new PersonAddress("Balikiri","sudheerkumar",789654328,"sudheer@123",34567,"Andhra");
        PersonAddress a2=new PersonAddress("Balikiri","Badri",4567899,"ABC@123",4578,"ANDHRA");
        PersonAddress a3=new PersonAddress("balikri","SUDHEER",234567,"CDE@234",23456,"Andhra");
        AddressBook ab=new AddressBook();
        ab.addDetails(a1);
        ab.addDetails(a2);
        ab.addDetails(a3);
        ab.viewDetails();

    }

}
