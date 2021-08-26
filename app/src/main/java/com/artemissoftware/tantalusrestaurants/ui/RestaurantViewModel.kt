package com.artemissoftware.tantalusrestaurants.ui

import androidx.lifecycle.*
import com.artemissoftware.tantalusrestaurants.api.RestaurantApi
import com.artemissoftware.tantalusrestaurants.data.Restaurant
import com.artemissoftware.tantalusrestaurants.repository.RestaurantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RestaurantViewModel @Inject constructor(repository: RestaurantRepository) : ViewModel() {

    val restaurants = repository.getRestaurants().asLiveData()

// Old version
//    private val restaurantsLiveData = MutableLiveData<List<Restaurant>>()
//    val restaurants: LiveData<List<Restaurant>> = restaurantsLiveData
//
//
//    init {
//
//        viewModelScope.launch {
//            val restaurants = api.getRestaurants()
//            delay(2000) // ONLY FOR TESTING - REMOVE IN REAL APP
//            restaurantsLiveData.value = restaurants
//        }
//    }
}