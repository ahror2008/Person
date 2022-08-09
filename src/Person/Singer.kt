package Person

class Singer(  name: String, age: Int, var bandName:String) : Person(name, age) {
    fun bandName(){
        println("Band name $bandName")
    }
    fun singing(){
        println("Qoshiq aytadi")
    }
    fun playGuitar(){
        println("Gitara chaladi")
    }

}