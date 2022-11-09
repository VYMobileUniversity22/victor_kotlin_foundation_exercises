interface Individualable {

    fun calculateBMI(weight: Int, height: Int): Int {

        val bmi: Double = weight / (height * height).toDouble()

        return if (bmi < 18.5) {
            -1
        } else if (bmi > 25) {
            1
        } else {
            0
        }
    }

    fun isOverAge(age: Int): Boolean {
        return age >= 18
    }

    fun checkGender(gender: Char): Char {
        return if (gender.equals('M', true) or (gender.equals('F', true)))
            gender
        else
            'M'
    }
    fun generatePassport(): Int {
        return (10000000..99999999).random()
    }
}