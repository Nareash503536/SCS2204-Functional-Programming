package Tutorial_03

import scala.io.StdIn.readDouble

object Q_6_b {
  def main(args: Array[String]): Int = {

  /* Question b */

    print("Enter the first subject marks:")
    var marks1: Double = readDouble()

    print("Enter the second subject marks:")
    var marks2: Double = readDouble()

    print("Enter the third subject marks:")
    var marks3: Double = readDouble()

    var average: Double = (marks1 + marks2 + marks3) / 3;

    if (average < 0) {
      println("Invalid Marks")
      0}

    if(average > 39.0){
      if(average > 54.0){
        if(average > 69.0){
          print("Very Good")
          0
        }
        print("Good")
        0
      }
      print("Pass")
      0
    }
    print("Fail")
    0
  }

  /* End of Question b */

  /* Question c */

  /* Question b */

  //        var Grade: Int = (a > b) ? a : b
  //        The above sytax doesn't support in Scala

  /* End of question b */

  /* End of Question c */
}
