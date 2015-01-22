package com.example.student7.cookbook20.itemView;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import com.example.student7.cookbook20.R;
import com.example.student7.cookbook20.data.Recipe;

@EViewGroup(R.layout.list_item)
public class RecipeItemView extends RelativeLayout {

//    @ViewById
//    ImageView avatar;

    @ViewById
    TextView title;

    @ViewById
    TextView introduction;

    public RecipeItemView(Context context) {
        super(context);
    }

    public void bind(Recipe recipe) {
        title.setText(recipe.title);
        introduction.setText(recipe.introduction);
//        if (recipe.pictureBytes != null) {
//            decodeAndSetImage(person.pictureBytes, avatar);
//        } else {
//            avatar.setImageDrawable(null);
//
//        }
    }

//    private void decodeAndSetImage(String base64bytes, ImageView image) {
//        // zamień ciąg tekstowy Base-64 na tablicę bajtów
//        byte[] decodedString = Base64.decode(base64bytes, Base64.DEFAULT);
//        // utwórz bitmapę na podstawie ciągu bajtów z obrazem JPEG
//        Bitmap decodedBytes = BitmapFactory.decodeByteArray(decodedString, 0,
//                decodedString.length);
//        // wstaw bitmapę do komponentu ImageView awatara
//        image.setImageBitmap(decodedBytes);

    }