package com.example.quizpert

object setData {

    const val name:String="name"
    const val score:String = "score"

    fun getQuestion():ArrayList<QuestionData>{
        val que:ArrayList<QuestionData> = arrayListOf()
        val q1 = QuestionData("What is the capital of India?",1,"UP","MP","Delhi","Kerala",3)
        val q2 = QuestionData("Who was the first Indian woman in space?",2,"Kalpana Chawla","Sunita Williams","Koneru Humpy","None of the above",1)
        val q3 = QuestionData("How many states are there in USA?",3,"49","51","52","50",4)
        val q4 = QuestionData("Which is not considered a planet anymore?",4,"Mercury","Pluto","Uranus","Saturn",2)
        val q5 = QuestionData("How many states are there in India",5,"27","30","29","28",3)
        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        return que
    }
}