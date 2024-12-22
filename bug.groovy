def myMethod() {
  def list = [1, 2, 3]
  list.each { element ->
    println element
    if (element == 2) {
      return // Incorrect early exit
    }
  }
}