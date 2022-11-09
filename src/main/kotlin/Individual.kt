class Individual(): Individualable {

    private var name: String = ""
        get() = field
        set(value) {field = value}

    private var age: Int = 0
        get() = field
        set(value) {field = value}


    private var passport: String = generatePassport().toString()
        get() = field

    private var gender: Char =' '
        get() = field
        set(value) {field = value}


    private var weight: Int=0
        get() = field
        set(value) {field = value}


    private var height: Int=0
        get() = field
        set(value) {field = value}



    companion object {
        private var counter: Int = 0
    }

    init {

        this.gender=checkGender(this.gender)

        counter++
    }


    constructor (name: String, age: Int, gender: Char):this() {
        this.name = name
        this.age = age
        this.gender=checkGender(gender)
    }

    constructor (name: String, age: Int, gender: Char, weight: Int, height: Int):this() {

        this.name = name
        this.age = age
        this.weight = weight
        this.height = height
        this.gender=checkGender(gender)

    }
    override fun toString():String {
        return "Name: $name" +
                "\nAge: $age" +
                "\nGender: $gender" +
                "\nWeight: $weight" +
                "\nHeight: $height" +
                "\nPassport: $passport" +
                "\nNumero de individius: $counter"

    }

    fun prueba(): String{

        return age.toString()
    }

}
