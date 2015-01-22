package com.example.student7.cookbook20;


import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.RequiresHeader;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.RestClientHeaders;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.example.student7.cookbook20.data.EmailAndPassword;
import com.example.student7.cookbook20.data.Recipe;
import com.example.student7.cookbook20.data.CookBook;
//import com.example.student7.cookbook20.data.Picture;
import com.example.student7.cookbook20.data.User;

@Rest(rootUrl = "http://pegaz.wzr.ug.edu.pl:8080/rest",
        converters = { MappingJackson2HttpMessageConverter.class })
@RequiresHeader({"X-Dreamfactory-Application-Name"})
public interface CookBookRestClient extends RestClientHeaders {

    @Get("/db/recipe")
    CookBook getCookBook();

    @Post("/db/recipe")
    void addCookBookEntry(Recipe recipe);

    @Post("/user/session")
    User login(EmailAndPassword emailAndPassword);

//    @Get("/db/pictures/{id}")
//    Picture getPictureById(int id);

}