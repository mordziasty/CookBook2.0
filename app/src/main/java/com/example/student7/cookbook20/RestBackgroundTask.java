package com.example.student7.cookbook20;


import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.rest.RestService;

import com.example.student7.cookbook20.data.Recipe;
import com.example.student7.cookbook20.data.CookBook;
//import com.example.student7.cookbook20.data.Picture;

@EBean
public class RestBackgroundTask {

    @RootContext
    MyActivity activity;

    @RestService
    CookBookRestClient restClient;

    @Background
    void getCookBook() {
        try {
            restClient.setHeader("X-Dreamfactory-Application-Name", "cookbook");
            CookBook cookBook = restClient.getCookBook();
//            for (Recipe recipe: cookBook.records) {
//                if (recipe.pictureId != null) {
//                    Picture picture = restClient.getPictureById(recipe.pictureId);
//                    person.pictureBytes = picture.base64bytes;
//                }
//
//            }
            publishResult(cookBook);
        } catch (Exception e) {
            publishError(e);
        }
    }

    @Background
    void addCookBookEntry(Recipe recipe) {
        try {
            restClient.setHeader("X-Dreamfactory-Application-Name", "cookbook");
            restClient.addCookBookEntry(recipe);
            CookBook cookBook = restClient.getCookBook();
            publishResult(cookBook);
        } catch (Exception e) {
            publishError(e);
        }
    }

    @UiThread
    void publishResult(CookBook cookBook) {
        activity.updateCookBook(cookBook);
    }

    @UiThread
    void publishError(Exception e) {
        activity.showError(e);
    }

}