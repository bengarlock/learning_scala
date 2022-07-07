package lectures.part1basics

object Functions extends App {

  // Syntax is 'def', name of the function, parameter name, followed by the parameter type, the type of the returned
  // followed by '=', then finally the expression block {} (return value) of the function

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  // like everything else in scala, calling a function is also an expression.

  // Parameterless functions can also be called with just their names.

  def aPerimeterLessFunction(): Int = 42
  println(aPerimeterLessFunction())
  // or
  println(aPerimeterLessFunction)

  // parameterless functions can be called with just their names

  // using functions as loops.

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // Before, we were defining the return types of our functions, but in most cases, the compiler is smart enough
  // to do this for us.  We could rewrite the same function (aFunction) like this:

  def aFunction2(a: String, b: Int) = {
    a + " " + b
  }

  // HOWEVER if you don't specify the return type of a recursive function, the compiler will complain:

  def aRepeatedFunction2(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  // As best practice, always specify the return type.

  // If you write a function that has a side effect, you can return a unit
  def aFunctionWithSideEffects(aString: String): Unit = {
    println(aString)
  }

  // You can have code blocks as the implimentation of function.  Codeblocks also let you define secondary functions.

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = {
      a + b
    }
    aSmallerFunction(n, n - 1)
  }

  println(aBigFunction(2))


  // Practice

  def greeting(name: String, age: Int): String = {
    f"Hello, my name is $name and my ages is $age"
  }

  println(greeting("ben", 39))

  def factorial(n: Int): Int = {


  }
}




