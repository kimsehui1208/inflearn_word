package com.example.inflearn_talk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("삶이 있는 한 희망은 있다")
        sentenceList.add("먼저핀꽃은 먼저진다 남보다 먼저 공을 세우려고 조급히 서둘것이 아니다")
        sentenceList.add("단순하게 살아라. 현대인은 쓸데없는 절차와 일 때문에 얼마나 복잡한 삶을 살아가는가?")
        sentenceList.add("한번의 실패와 영원한 실패를 혼동하지 마라")
        sentenceList.add("오랫동안 꿈을 그리는 사람은 마침내 그 꿈을 닮아 간다")
        sentenceList.add("고통이 남기고 간 뒤를 보라! 고난이 지나면 반드시 기쁨이 스며든다")
        sentenceList.add("이미끝나버린 일을 후회하기 보다는 하고 싶었던 일들을 하지못한 것을 후회하라")
        sentenceList.add("실패는 잊어라 그러나 그것이 준 교훈은 절대 잊으면 안된다")

        val sentenceadapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceadapter

    }
}