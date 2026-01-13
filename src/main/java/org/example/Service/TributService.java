package org.example.Service;

import org.example.Model.Tribut;
import org.example.Repository.TributRepo;

import java.util.List;

public class TributService {
    private TributRepo<Tribut> tributRepo;
    
    public TributService(TributRepo<Tribut> TributRepo) {
        this.tributRepo = TributRepo;
    }

    public void listAllTribut(){
        this.tributRepo.readAll();
    }


    public void addTribut(Tribut Tribut){
        this.tributRepo.add(Tribut);
    }

    public void removeTribut(String name){
        this.tributRepo.remove(name);
    }

//    public void updateTribut(String name,Tribut Tribut){
//        this.tributRepo.update(name,Tribut);
//    }
}
