package com.hellofresh.task2.activity

import android.os.Bundle
import com.hellofresh.task2.R

class RecipeListActivity : RecipeBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)
    }

}