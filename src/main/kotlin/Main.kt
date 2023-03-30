fun main(){
    var indices = evenIndices(listOf("Good", "morning", "today", "is", "going", "to", "be", "an", "amazing", "day"))
    println(indices)

    var avTotal = heights(listOf(2.5, 2.3, 3.2,3.5, 2.0))
    println(avTotal)

    var peeps = people()
    println(peeps)

    var manyPeople = morePeople()
    println(manyPeople)

//    println(peeps+manyPeople)


    var cars = carObjects()
    println(cars)

}
//Question 1
//Input - list of strings
//output - list of strings at even index positions
//process - loop through the list while skipping one element to get the even ones, store them in an empty list and keep adding to it
fun evenIndices(words:List<String>):List<String>{
    var filter = words.filterIndexed { index, word -> index%2==0 }
    return filter

}

//Question 2
//input - list of Double
//output - list of Double
//process - use inbuilt functions to get sum and average

fun heights(height:List<Double>):List<Double>{
    val averageHeight = height.average()
    val totalHeight = height.sum()
    val averageSum = listOf(averageHeight, totalHeight)
    return averageSum
}

//Question 3
//input - class and its objects
//output - list in desc order doubles
//process - create data class, input attributes, create function, feed objects to it, use sortedbydescending
data class Person (var name:String, var age:Int, var height:Double, var weight:Double)
    fun people():List<Person>{
        val name1 = Person("Esther", 16, 2.1, 58.0)
        val name2 = Person("Akech", 20, 1.8, 40.0)
        val name3 = Person("Maris", 26, 2.5, 65.0)
        val peoples = mutableListOf(name1,name2,name3)
        return peoples.sortedByDescending { Person -> Person.age }
    }

//Question 4
//input -above list of Person
//output - larger list of Person
//process - create fun, add 2 objects, add new objects to existing ones
fun morePeople():List<Person>{
    val name4 = Person("Lois", 60, 2.0, 70.0)
    val name5 = Person("Jo", 61, 1.5, 59.0)
    return mutableListOf(name4, name5)
}

//Question 5
//input data class, car objects in function, with attributes
//output - Double
//process - create data class, create fun, create multiple objects, use .average
data class Car(var registration:String, var mileage:Int)
fun carObjects():Double{
    val car1 = Car("KAK 761V",500)
    val car2 = Car("KcK 738V",800)
    val car3 = Car("KBG 385T",500)
    val car4 = Car("KDD 813A",500)
    var wholeList = mutableListOf(car1, car2, car3, car4)
    var mileages = listOf(car1.mileage, car2.mileage, car3.mileage, car4.mileage)
    return (mileages.average())
}