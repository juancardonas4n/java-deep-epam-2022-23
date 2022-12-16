# Sorting App
## Author
Andrés Felipe Sánchez Sánchez
## Requirements
Make sure you have installed maven and java 1.8 and have set the
corresponding environment variables.
## Test the application
To test the application please make sure to be in the root of the project (at the same level
of the pom.xml) and type the command `mvn test`. Then you will see the result of the test
## Run the application
To Run the application please execute
`mvn package` and then make sure you are in the root of the
project (at the same level of pom.xml) and execute this command
on the console  `java -jar .\target\SortingApp-1.0.jar 12 5 825 -5 25544 1 2 58` (if you are in a windows machine)
or `java -jar ./target/SortingApp-1.0.jar 12 5 825 -5 25544 1 2 58` if you are in a linux machine
After running the application, please enter the numbers separated by blanks and press CTRL+D to
print and EOF character and indicate the end of the input.

## Generate Documentation
For generate the documentation please type this command on the
root of the project.
`mvn javadoc:javadoc`

Then please open the file apidoc/apidocs/index.html to see the
documentation
