package com.artemissoftware.tantalusrestaurants.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.artemissoftware.tantalusrestaurants.api.RestaurantApi
import com.artemissoftware.tantalusrestaurants.data.Restaurant
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RestaurantViewModel @Inject constructor(api: RestaurantApi) : ViewModel() {


    private val restaurantsLiveData = MutableLiveData<List<Restaurant>>()
    val restaurants: LiveData<List<Restaurant>> = restaurantsLiveData


    init {
//        viewModelScope.launch {
//
//        }

//        viewModelScope.launch {
//            val restaurants = api.getRestaurants()
//            delay(2000)
//            restaurantsLiveData.value = restaurants
//        }
    }
}