package Person

class Dancer(name: String, age: Int,var groupName:String) : Person(name, age) {
    fun groupName(){
        println("Group name $groupName")
    }

    fun dancing(){
        println("Raqsga tushadi")
    }

}