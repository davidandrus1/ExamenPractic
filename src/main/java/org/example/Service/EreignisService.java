package org.example.Service;

import org.example.Model.Ereignis;
import org.example.Model.Tribut;
import org.example.Repository.EreignisRepo;
import org.example.Repository.TributRepo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class EreignisService {
    private EreignisRepo<Ereignis> ereignisRepo;

    public EreignisService(EreignisRepo<Ereignis> EreignisRepo) {
        this.ereignisRepo = EreignisRepo;
    }

    public void listAllEreignis(){
        this.ereignisRepo.readAll();
    }


    public void addEreignis(Ereignis Ereignis){
        this.ereignisRepo.add(Ereignis);
    }

    public void removeEreignis(String name){
        this.ereignisRepo.remove(name);
    }

    public void scrie(String filePath, List<Tribut> tributs)
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath)))
        {
            for(Ereignis item : this.ereignisRepo.getAll())
            {
                writer.println(item.getId() + " | " + item.getDay()+ " | " + item.getPoints() + " | " + item.getTributId());
            }
        }
        catch (IOException e)
        {
            System.err.println("Eroare la scrierea fisierului: " + e.getMessage());
        }
    }

    public void abslussBericht(String filePath)
    {

    }

}
