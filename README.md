# JSONParser-Maven
JSON Parser - antlr3.5.2

This is a simple ANTLR project , the motive is to parse JSON File/Text and print in the well defined ASTree format with custom Tree format

Procedure to test :

<pre>
cd {dir}
git clone https://github.com/kamal157/JSONParser-Maven.git 
</pre>

<pre>
cd JSONParser-Maven
mvn clean package 
cd target
</pre>


<pre>
java -jar JSONparser-0.0.jar
</pre>

<pre>
java -jar JSONparser-0.0.jar {file-path}

Ex. 
java -jar JSONparser-0.0.jar resources/testfile.json
</pre>

