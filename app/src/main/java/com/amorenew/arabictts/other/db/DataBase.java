/*
  Please feel free to use/modify this class. 
  If you give me credit by keeping this information or
  by sending me an email before using it or by reporting bugs , i will be happy.
  Email : gtiwari333@gmail.com,
  Blog : http://ganeshtiwaridotcomdotnp.blogspot.com/ 
 */
package com.amorenew.arabictts.other.db;

/**
 * @author Ganesh Tiwari
 */
public interface DataBase {
    void setType(String type);

    String[] readRegistered();

    Model readModel(String name);

    void saveModel(Model m, String name);
}
