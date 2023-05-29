package tarif.xo.myquizapp

import java.util.*

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS :String = "correct_answers"



    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        // 1

        val que1 = Question(
            1,"What Country Does This Flag Belongs To ?",
            R.drawable.ic_flag_of_argentina,"Argentina","Australia","uruguay","Egypt",
            1

        )
        questionList.add(que1)

        // 2
        val que2 = Question(
            1,"What Country Does This Flag Belongs To ?",
            R.drawable.ic_flag_of_australia,"Argentina","Australia","Austria","Egypt",
            2

        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            1,"What Country Does This Flag Belongs To ?",
            R.drawable.ic_flag_of_belgium,"Germany","Ghana","France","Belgium",
            4

        )
        questionList.add(que3)

        // 4
        val que4 = Question(
            1,"What Country Does This Flag Belongs To ?",
            R.drawable.ic_flag_of_brazil,"Peru","Brazil","uruguay","Colombia",
            2

        )
        questionList.add(que4)

        // 5
        val que5 = Question(
            1,"What Country Does This Flag Belongs To ?",
            R.drawable.ic_flag_of_germany,"Belgium","England","Germany","Egypt",
            3

        )
        questionList.add(que5)

        // 6
        val que6 = Question(
            1,"What Country Does This Flag Belongs To ?",
            R.drawable.ic_flag_of_india,"India","Turkey","China","Mexico",
            1

        )
        questionList.add(que6)



        return questionList




    }







}