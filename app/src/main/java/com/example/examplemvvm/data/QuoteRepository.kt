package com.example.examplemvvm.data

import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider
import com.example.examplemvvm.data.netWork.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api : QuoteService, private val quoteProvider:QuoteProvider){

    suspend fun getQuotes(): List<QuoteModel>{
        val response : List<QuoteModel> = api.getQuotes()
        quoteProvider.quotes = response
        return response

    }
}