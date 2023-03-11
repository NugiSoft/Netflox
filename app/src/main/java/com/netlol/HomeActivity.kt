package com.netlol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.netlol.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_home)

        with(binding){
            with(rvFilmList){
                adapter=ListCategory(listOf("Action","Romance","Random"))
                layoutManager=LinearLayoutManager(this@HomeActivity,LinearLayoutManager.HORIZONTAL,false)
            }
            with(rvFilm){
                adapter=ListFilm(listOf(Film("Tukang haji naik bubur","2013-10-19","10/10", R.drawable.list_film),Film("Tukang haji naik bubur S2","2013-10-19","10/10", R.drawable.list_film)))
                layoutManager=LinearLayoutManager(this@HomeActivity)
            }
        }
    }
}