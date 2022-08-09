package Person

class Programmer(name: String, age: Int,var companyName:String) : Person(name, age) {

    fun companyName(){
        println("Company name $companyName")
    }
    fun coding(){
        println("Cod yozadi")
    }





}