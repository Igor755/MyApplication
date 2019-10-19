package com.company.myapplication

import FilmDataClass
import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader





class MainActivity : AppCompatActivity() {


    val list : ArrayList<FilmDataClass> = ArrayList()
    private var mListRecyclerView: RecyclerView? = null
    var isLastPage: Boolean = false
    var isLoading: Boolean = false
    lateinit var mAdapter : AdapterFilm





    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        read_json()



        mListRecyclerView = findViewById(R.id.my_recycler_view)
        val mAdapter = AdapterFilm(list)


        mListRecyclerView!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        mListRecyclerView!!.adapter = mAdapter

        mListRecyclerView?.addOnScrollListener(object : Pagination(mListRecyclerView!!.layoutManager as LinearLayoutManager) {
            override fun isLastPage(): Boolean {
                return isLastPage
            }

            override fun isLoading(): Boolean {
                return isLoading
            }

            override fun loadMoreItems() {
                isLoading = true
                //you have to call loadmore items to get more data
                getMoreItems()
            }
        })


    }

    fun getMoreItems() {
        //after fetching your data assuming you have fetched list in your
        // recyclerview adapter assuming your recyclerview adapter is
        //rvAdapter
      //  after getting your data you have to assign false to isLoading
        isLoading = false

     //   mAdapter.addData(list)
    }



    fun read_json(){

        val json : String?

        try{
            val inputStream : InputStream = assets.open("jsonfilms.json")
            json = inputStream.bufferedReader().use { it.readText() }

            val jsonarray = JSONArray(json)

            for (i in 0..jsonarray.length() - 1){
                val jsonObject = jsonarray.getJSONObject(i)
                val topic = Gson().fromJson(jsonObject.toString(), FilmDataClass::class.java)
                list.add(topic)
            }
        } catch (e : IOException){

        }

    }

}
