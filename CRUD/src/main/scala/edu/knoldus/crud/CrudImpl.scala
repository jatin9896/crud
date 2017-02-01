package edu.knoldus.crud

import java.sql.DriverManager
import java.sql._

/**
  * Created by knoldus on 1/2/17.
  */
case class Employee(id:Int, name:String, address:String, phone:Long, deptId:Int, projectId:Int)
case class Department(id:Int, name:String)
case class Project(id:Int, deptId:Int, name:String, clientId:Int)
case class Client(id:Int, projectId:Int, name:String, address:String)


object CrudImpl extends App{
  val connection:Connection=DBConnectionFactory.getConnection()
  def addEmployee(employee: Employee):String = {

    val statement = connection.createStatement
    try {
      statement.executeUpdate(s"Insert into Company.Employee values(${employee.id},'${employee.name}','${employee.address}',${employee.phone},${employee.deptId},${employee.projectId})")
            "Data Inserted"
    }
    catch{
      case ex:Exception => println("Something wrong with tables")
        println("program terminated")
        sys.exit(1)
    }
  }
  def addProject(project: Project):String = {

    val statement = connection.createStatement
    try {
        statement.executeUpdate(s"Insert into Company.Project values(${project.id},'${project.name}',${project.deptId},${project.clientId})")
      "Data Inserted"
    }
    catch{
      case ex:Exception => println("Something wrong with tables")
        println("program terminated")
        sys.exit(1)
    }
  }
  def addDepartment(dept: Department):String = {

    val statement = connection.createStatement
    try {
      statement.executeUpdate(s"Insert into Company.Department values(${dept.id},'${dept.name}')")
      "Data Inserted"
    }
    catch{
      case ex:Exception => println("Something wrong with tables")
        println("program terminated")
        sys.exit(1)
    }
  }
  def addClient(client: Client):String = {

    val statement = connection.createStatement
    try {
      statement.executeUpdate(s"Insert into Company.Client values(${client.id},'${client.name}','${client.address}',${client.projectId})")
      "Data Inserted"
    }
    catch{
      case ex:Exception => println("Something wrong with tables")
        println("program terminated")
        sys.exit(1)
    }
  }

val temp=addDepartment(Department(7,"departmentdb"))
  println(temp)


}
