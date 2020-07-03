Probar en POSTMAN

http://localhost:8080/Major/ListAll
--------------------------------------------    
http://localhost:8080/Major/GetById?MajorId=5
-------------------------------------------- 
http://localhost:8080/Major/Delete?MajorId=5
--------------------------------------------     
http://localhost:8080/Major/Add
Body:
{
       "name": "Admin",
       "cyclesQuantity": 150
}
--------------------------------------------   
http://localhost:8080/Major/Update
Body:
{
       "name": "Administración",
       "majorId": 6,
       "cyclesQuantity": 140
}

*Los MajorId en este documento pueden variar en el momento de la revisión, ya que son autogenerados. 
