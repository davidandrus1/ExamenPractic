package org.example.Service;

import org.example.Model.SponsorGeschenk;
import org.example.Repository.SponsorGeschenkRepo;

import java.util.List;

public class SponsorGeschenkService {
    private SponsorGeschenkRepo<SponsorGeschenk> sponsorGeschenkRepo;

    public SponsorGeschenkService(SponsorGeschenkRepo<SponsorGeschenk> SponsorGeschenkRepo) {
        this.sponsorGeschenkRepo = SponsorGeschenkRepo;
    }

    public void listAllTribut(){
        this.sponsorGeschenkRepo.readAll();
    }


    public void addTribut(SponsorGeschenk SponsorGeschenk){
        this.sponsorGeschenkRepo.add(SponsorGeschenk);
    }

    public void removeTribut(String name){
        this.sponsorGeschenkRepo.remove(name);
    }

//    public void updateTribut(String name,SponsorGeschenk SponsorGeschenk){
//        this.tributRepo.update(name,SponsorGeschenk);
//    }
}
