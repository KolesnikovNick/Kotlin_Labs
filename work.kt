class Student(var surname: String? = null, var points: Int){
    
}

class Group(val students: List<Student> = emptyList()){
    fun averagePoint(): Int{
        var allPoints = 0;
        var allStudents = 0;
        for(student in students) {
            allStudents = allStudents+1;
            allPoints+=student.points
        }
        return allPoints/allStudents
    }
    
    fun minimalPoint(): Student{
        val maxGradedStudent = students.filter{it.points==(students.minOfOrNull{it.points})};
        println(maxGradedStudent[0].surname);
        return maxGradedStudent[0];
    }
    
    fun maximalPoint(): Student{
        val maxGradedStudent = students.filter{it.points==(students.maxOfOrNull{it.points})};
        println(maxGradedStudent[0].surname);
        return maxGradedStudent[0];
    }
}
fun minimalPoint(group: ArrayList<Student>): Int{
    val minimal = group.minOf{it.points};
    return minimal;
}

fun main(){
    val student1 = Student("Koval", 87);
    val student2 = Student("Lidov", 78);
    val student3 = Student("Kolov", 65);
    val student4 = Student("Denisov", 55);
    val student5 = Student("Cherniy", 98);
    val student6 = Student("Maliy", 34);
    val students309: List<Student> = listOf(student1,student2,student3,student4, student5, student6)
    val group309 = Group(students309);
    group309.maximalPoint();
    group309.minimalPoint();
    println(group309.averagePoint());
}
