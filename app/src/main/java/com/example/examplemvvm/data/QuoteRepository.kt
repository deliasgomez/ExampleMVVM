package com.example.examplemvvm.data

import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider
import com.example.examplemvvm.data.netWork.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getQuotes(): List<QuoteModel>{
        val response : List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response

    }
}