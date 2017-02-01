package edu.knoldus.crud

import org.scalatest.FunSuite

/**
  * Created by knoldus on 1/2/17.
  */
class CrudImplTest extends FunSuite {
  test("emp insert") {
    assert(CrudImpl.addEmployee(Employee(13,"dabaentry","noida",989989899,2,2))== "Data Inserted")
  }
  test("emp fault"){
    intercept[IllegalArgumentException]{
      assert(CrudImpl.addEmployee(Employee(1,"dabaentry","noida",989989899,2,2))== "Data Inserted")//primary key violated
    }
  }
  test("dept insert") {
    assert(CrudImpl.addDepartment(Department(7,"departmentdb"))== "Data Inserted")
  }
  test("dept fault"){
    intercept[IllegalArgumentException]{
      assert(CrudImpl.addDepartment(Department(2,"departmentdb"))== "Data Inserted")//primary key violated
    }
  }
  test("client insert") {
    assert(CrudImpl.addClient(Client(15,3,"clientdb","noida"))== "Data Inserted")
  }
  test("client fault") {
    intercept[IllegalArgumentException] {
      assert(CrudImpl.addClient(Client(1, 3, "clientdb", "noida")) == "Data Inserted") //primary key violated
    }
  }
  test("project insert") {
    assert(CrudImpl.addProject(Project(23,2,"projdb",2))== "Data Inserted")
  }
}
