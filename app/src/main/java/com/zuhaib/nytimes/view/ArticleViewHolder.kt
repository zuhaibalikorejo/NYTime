package com.zuhaib.nytimes.view


import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zuhaib.nytimes.databinding.MostViewArticleBinding

import com.zuhaib.nytimes.model.Results

class ArticleViewHolder(var itemBinding: MostViewArticleBinding) : RecyclerView.ViewHolder(itemBinding.root) {
    var index:Int=0
    fun populateData(mostview: Results, position:Int){
        index = position;


        Log.d("title",mostview.title)
        itemBinding.titleTxtView.text = mostview.title
        itemBinding.publishedDateTxtView.text = mostview.published_date
        itemBinding.txtArticleSnippet.text = mostview.abstract
        if (mostview.media!!.size>0)
            Glide.with(itemBinding.articleImage)
                .load(mostview.media[0].mediaMetadata[0].url)
                .into(itemBinding.articleImage)
    }


}