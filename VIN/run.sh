#Check/change webapps path

APACHE_WEBAPPS=/var/lib/tomcat7/webapps

cd coverage
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
echo VIN Project code Coverage script
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
ant clean
ant
echo Coverage script done!
echo
cd ..
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
echo Project build, junit tests run and deploy script.
echo ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
echo
ant
echo done!
echo
echo ----------------------------------------------------------
echo Deploying war package to $APACHE_WEBAPPS
 
cd target
sudo cp VIN.war $APACHE_WEBAPPS
echo
echo Test on browser!
echo
echo "You can find code coverage at build/reports/index.html"
