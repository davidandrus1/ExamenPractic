package org.example.Service;

import org.example.Model.Status;
import org.example.Model.Tribut;
import org.example.Repository.TributRepo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TributService {
    private TributRepo<Tribut> tributRepo;
    
    public TributService(TributRepo<Tribut> TributRepo) {
        this.tributRepo = TributRepo;
    }

    public void listAllTribut(){
        this.tributRepo.readAll();
        this.tributRepo.print(this.tributRepo.getAll());
    }


    public void addTribut(Tribut Tribut){
        this.tributRepo.add(Tribut);
    }

    public void removeTribut(String name){
        this.tributRepo.remove(name);
    }

//    public List<Tribut> filterByDistriktandStatus(int distrikt, Status status)
//    {
//        this.tributRepo.readAll();
//
//        List<Tribut> resultedList = new ArrayList<>();
//
//        for (Tribut item : tributRepo)
//        {
//            if()
//            {
//                resultedList.add(item);
//            }
//        }
//
//        return resultedList;
//    }

    public void sortBySkillLevel(String order){

        List<Tribut> tributs = this.tributRepo.getAll();

        if(order.equals("asc"))
        {
            tributs.sort(Comparator.comparing(Tribut::getSkillLevel));
        }
        else
        {
            tributs.sort(Comparator.comparing(Tribut::getSkillLevel).reversed());
        }
    }
//    public void updateTribut(String name,Tribut Tribut){
//        this.tributRepo.update(name,Tribut);
//    }
}
