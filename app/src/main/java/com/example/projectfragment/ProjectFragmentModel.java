package com.example.projectfragment;

public class ProjectFragmentModel {
    String mTitle;  //текст таска
    Boolean mCheck; //состояние чекбокса
    public ProjectFragmentModel(String Title, Boolean Check){
        mTitle = Title;
        mCheck = Check;
    }
}
