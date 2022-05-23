package org.fis2022.services;

import org.dizitart.no2.objects.ObjectRepository;
import org.fis2022.exceptions.ProductAlreadyExists;
import org.fis2022.models.Listing;

import java.util.ArrayList;

public class ProductService {
    private static ObjectRepository<Listing> proRepository;

    public static void initService() {
        proRepository = DBService.getDatabase().getRepository(Listing.class);
    }

    public static void addProduct(String nume, float pret, String descriere) throws ProductAlreadyExists {
        checkProductDoesNotAlreadyExist(nume);
        proRepository.insert(new Listing(nume, pret, descriere));
    }

    private static void checkProductDoesNotAlreadyExist(String nume) throws ProductAlreadyExists {
        for (Listing product : proRepository.find()) {
            if (product.getNume().equals(nume))
                throw new ProductAlreadyExists(nume);
        }
    }

    public static ArrayList<Listing> getAll(){
        ArrayList<Listing> result = new ArrayList<>();
        for(Listing b :  proRepository.find()){
            result.add(b);
        }

        return result;
    }
}
