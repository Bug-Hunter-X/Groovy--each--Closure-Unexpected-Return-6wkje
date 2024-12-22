def myMethod() {
  def list = [1, 2, 3]
  boolean found = false
  list.each { element ->
    println element
    if (element == 2) {
      found = true
    }
  }
  if(found) {println "Found the number 2"}
} 
//Alternative solution
def myMethod2() {
  def list = [1, 2, 3]
  list.find { it == 2 }
  //or
  list.any { it == 2 }
} 