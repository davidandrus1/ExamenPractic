package org.example.Service;

import org.example.Model.Ereignis;
import org.example.Repository.EreignisRepo;
import org.example.Repository.TributRepo;

import java.util.List;

public class EreignisService {
    private EreignisRepo<Ereignis> tributRepo;

    public EreignisService(EreignisRepo<Ereignis> EreignisRepo) {
        this.tributRepo = EreignisRepo;
    }

    public void listAllEreignis(){
        this.tributRepo.readAll();
    }


    public void addEreignis(Ereignis Ereignis){
        this.tributRepo.add(Ereignis);
    }

    public void removeEreignis(String name){
        this.tributRepo.remove(name);
    }

//    public void updateTribut(String name,Ereignis Ereignis){
//        this.tributRepo.update(name,Ereignis);
//    }
}
