package com.leon.smartkid.common

import com.leon.smartkid.R

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = ""
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getShapeQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Which shape is this?",
            R.drawable.rectangle,
            "Rectangle",
            "Hexagon",
            "Pyramid",
            "Cylinder",
            1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which shape is this?",
            R.drawable.pyramid,
            "Rectangle",
            "Hexagon",
            "Pyramid",
            "Cylinder",
            3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which shape is this?",
            R.drawable.cylinder,
            "Rectangle",
            "Hexagon",
            "Pyramind",
            "Cylinder",
            4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Which shape is this?",
            R.drawable.hexagon,
            "Heart",
            "Hexagon",
            "Pyramind",
            "Cylinder",
            2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which shape is this?",
            R.drawable.heart,
            "Pyramid",
            "Hexagon",
            "Heart",
            "Cylinder",
            3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which shape is this?",
            R.drawable.oval,
            "Oval",
            "Hexagon",
            "Cylinder",
            "none of these",
            1
        )

        questionsList.add(que6)

         //7
        val que7 = Question(
            7, "Which shape is this?",
            R.drawable.circle,
            "Heart",
            "Hexagon",
            "Circle",
            "Cylinder",
            3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Which shape is this?",
            R.drawable.star,
            "Heart",
            "Hexagon",
            "Heart",
            "Star",
            4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Which shape is this?",
            R.drawable.triangle,
            "Heart",
            "Triangle",
            "Heart",
            "Cylinder",
            2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Which shape is this?",
            R.drawable.diamond,
            "Diamond",
            "Hexagon",
            "Heart",
            "Cylinder",
            1
        )

        questionsList.add(que10)

        return questionsList
    }

    fun getEnglishQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Which object is this?",
            R.drawable.car,
            "Car",
            "Umbrella",
            "Bicycle",
            "Bed",
            1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which object is this?",
            R.drawable.bicycle,
            "Car",
            "Umbrella",
            "Bicycle",
            "Bed",
            3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which object is this?",
            R.drawable.bed,
            "Car",
            "Umbrella",
            "Bicycle",
            "Bed",
            4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Which object is this?",
            R.drawable.umbrella,
            "Girl",
            "Umbrella",
            "Bicycle",
            "Boy",
            2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which object is this?",
            R.drawable.girl,
            "Umbrella",
            "Bicycle",
            "Girl",
            "Boy",
            3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which object is this?",
            R.drawable.tv,
            "Television",
            "Bicycle",
            "Girl",
            "Boy",
            1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Which object is this?",
            R.drawable.boy,
            "Television",
            "Bicycle",
            "Boy",
            "Television",
            3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Which object is this?",
            R.drawable.plate,
            "Umbrella",
            "Bicycle",
            "Girl",
            "Plate",
            4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Which object is this?",
            R.drawable.cup,
            "Umbrella",
            "Cup",
            "Bicycle",
            "Girl",
            2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Which object is this?",
            R.drawable.chair,
            "Chair",
            "Umbrella",
            "Bed",
            "Car",
            1
        )

        questionsList.add(que10)

        return questionsList
    }

    fun getMathQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Match the numbers correctly",
            R.drawable.four,
            "4",
            "2",
            "7",
            "1",
            1
        )

        questionsList.add(que1)

         //2
        val que2 = Question(
            2, "Match the numbers correctly",
            R.drawable.ten,
            "1",
            "7",
            "10",
            "4",
            3
        )

        questionsList.add(que2)

         //3
        val que3 = Question(
            3, "Match the numbers correctly",
            R.drawable.five,
            "1",
            "2",
            "7",
            "5",
            4
        )

        questionsList.add(que3)

         //4
        val que4 = Question(
            4, "Match the numbers correctly",
            R.drawable.three,
            "1",
            "3",
            "7",
            "4",
            2
        )

        questionsList.add(que4)

         //5
        val que5 = Question(
            5, "Match the numbers correctly",
            R.drawable.six,
            "10",
            "2",
            "6",
            "4",
            3
        )

        questionsList.add(que5)

         //6
        val que6 = Question(
            6, "Match the numbers correctly",
            R.drawable.onee,
            "1",
            "7",
            "10",
            "4",
            1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Match the numbers correctly",
            R.drawable.nine,
            "1",
            "3",
            "9",
            "4",
            3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Match the numbers correctly",
            R.drawable.seven,
            "9",
            "2",
            "8",
            "7",
            4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Match the numbers correctly",
            R.drawable.two,
            "1",
            "2",
            "7",
            "4",
            2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Match the numbers correctly",
            R.drawable.eight,
            "8",
            "2",
            "7",
            "1",
            1
        )

        questionsList.add(que10)

        return questionsList
    }

    fun getAnimalsQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Which Animal is this?",
            R.drawable.elephant,
            "Elephant",
            "Lion",
            "Cheetah",
            "Zebra",
            1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which Animal is this?",
            R.drawable.zebra,
            "Elephant",
            "Lion",
            "Cheetah",
            "Zebra",
            4
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which Animal is this?",
            R.drawable.polar,
            "Elephant",
            "Lion",
            "Polar Bear",
            "Cheetah",

            3
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Which Animal is this?",
            R.drawable.gorilla,
            "Elephant",
            "Gorilla",
            "Cheetah",
            "Polar Bear",
            2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which Animal is this?",
            R.drawable.frog,
            "Pig",
            "Tortoise",
            "Frog",
            "Lion",
            3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which Animal is this?",
            R.drawable.pig,
            "Pig",
            "Tortoise",
            "Frog",
            "Lion",
            1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Which Animal is this?",
            R.drawable.tortoise,
            "Pig",
            "Tortoise",
            "Frog",
            "Lion",
            2
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Which Animal is this?",
            R.drawable.monkey,
            "Tortoise",
            "Frog",
            "Monkey",
            "Lion",
            3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Which Animal is this?",
            R.drawable.lion,
            "Pig",
            "Lion",
            "Tortoise",
            "Frog",

            2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Which Animal is this?",
            R.drawable.kitten,
            "Kitten",
            "Lion",
            "Tortoise",
            "Frog",
            1
        )

        questionsList.add(que10)

        return questionsList
    }

}