package org.example;

import org.example.Model.Ereignis;
import org.example.Model.SponsorGeschenk;
import org.example.Model.Tribut;
import org.example.Repository.EreignisRepo;
import org.example.Repository.SponsorGeschenkRepo;
import org.example.Repository.TributRepo;
import org.example.Service.EreignisService;
import org.example.Service.SponsorGeschenkService;
import org.example.Service.TributService;

public class Main {

    public static void main(String[] args) {

        String filePath = "src/main/resources/tributes.json";


        EreignisRepo<Ereignis> ereignisRepo = new EreignisRepo<>(filePath);
        TributRepo<Tribut> tributRepo = new TributRepo<>(filePath);
        SponsorGeschenkRepo<SponsorGeschenk> sponsorGeschenkRepo = new SponsorGeschenkRepo<>(filePath);

        EreignisService ereignisService = new EreignisService(ereignisRepo);
        TributService tributService = new TributService(tributRepo);
        SponsorGeschenkService sponsorGeschenkService = new SponsorGeschenkService(sponsorGeschenkRepo);

        ereignisRepo.readAll();
        sponsorGeschenkRepo.readAll();
        tributService.listAllTribut();

        tributService.sortBySkillLevel("desc");
        tributRepo.print(tributRepo.getAll());
        tributService.scrie("src/main/resources/tributes_sorted.txt",tributRepo.getAll());

    }
}