package edu.knoldus.crud

import java.sql.DriverManager
import java.sql._

/**
  * Created by knoldus on 1/2/17.
  */

object DBConnectionFactory {
  def getConnection():Connection={

    val url = "jdbc:mysql://localhost:3306/Company"
    val driver = "com.mysql.jdbc.Driver"
    try {
      Class.forName("com.mysql.jdbc.Driver")
      println("Driver Loaded")
      val connection= DriverManager.getConnection(url, "root", "root")
       connection
    }
    catch{
      case ex:Exception=>
        print("Error in connection")
        println("Program terminated")
        sys.exit(1)
    }


  }



}
