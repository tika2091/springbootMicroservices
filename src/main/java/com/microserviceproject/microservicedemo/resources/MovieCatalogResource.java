package com.microserviceproject.microservicedemo.resources;
import com.microserviceproject.microservicedemo.models.CatalogItem;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class MovieCatalogResource {


    public List <CatalogItem> getCatalog(String userId){


        return Collections.singletonList(
                new CatalogItem("Transformer", "Test", 4);
        )
    }
}
