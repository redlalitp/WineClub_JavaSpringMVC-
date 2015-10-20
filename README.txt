VIN project Code coverage, building and deploying war instructions(All instruction assume you are at Lalit-Patil-PR directory at start):



cd VIN
sh run.sh


This script runs code coverage,unit test cases, builds and deploys war to webapps folder.
------------------------------------------------------------------------------------------




If you want to run tasks individually, follow,
For code coverage:------------------------------------------------------------------------



cs VIN
cd coverage

ant clean

ant 


the script will run.

Check code coverage report at build/reports/index.html
------------------------------------------------------------------------------------------




For running tests and creating war file:--------------------------------------------------



cd VIN
ant clean

ant



The above commands will generate war package. at /target directory.

------------------------------------------------------------------------------------------






Deploying war file:-----------------------------------------------------------------------


We need to deploy .war file on apache tomcat server,

for that we need to copy our war file to apache tomcat webapps folder.


Move to target directory. 



cd VIN
cd target

sudo cp VIN.war /var/lib/tomcat7/webapps



Now we can test.



Postman VIN REST requests collection file is located at "Lalit-Patil-PR/VIN-REST.json.postman_collection" ,you can import and can test functionality using Postman app. 
